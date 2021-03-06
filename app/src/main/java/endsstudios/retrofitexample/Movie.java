package endsstudios.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by MEHMET on 10.08.2017.
 */

public class Movie {



        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("url")
        @Expose
        public Url url;
        @SerializedName("timestamp")
        @Expose
        public String timestamp;

        public class Url {

            @SerializedName("small")
            @Expose
            public String small;
            @SerializedName("medium")
            @Expose
            public String medium;
            @SerializedName("large")
            @Expose
            public String large;

        }


}
