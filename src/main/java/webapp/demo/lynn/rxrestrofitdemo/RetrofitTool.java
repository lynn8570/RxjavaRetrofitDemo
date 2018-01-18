package webapp.demo.lynn.rxrestrofitdemo;

import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lynn on 2018/1/18.
 */

public class RetrofitTool {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.douban.com/v2/")
            .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
            .build();

    RetrofitService service = retrofit.create(RetrofitService.class);





}
