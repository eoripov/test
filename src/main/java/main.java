import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

import static java.lang.System.out;

public class main {
    public static void main(String[] args) throws IOException {
     OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://icanhazdadjoke.com/")
                .header("Accept", "application/json")
                .build();

        Response response = okHttpClient.newCall(request).execute();

        System.out.println(response.body().string());
    }
}
