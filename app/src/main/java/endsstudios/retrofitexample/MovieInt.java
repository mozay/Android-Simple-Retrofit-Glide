package endsstudios.retrofitexample;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by MEHMET on 10.08.2017.
 */

public interface MovieInt {
    @GET("/json/glide.json")
    Call<Movie[]> getJsonValues();
}
