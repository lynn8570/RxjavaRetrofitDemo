package webapp.demo.lynn.rxrestrofitdemo;

import android.content.Context;

import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lynn on 2018/1/18.
 */

public class RetrofitHelper {

    private Context mContext;

    OkHttpClient client = new OkHttpClient();

    GsonConverterFactory factory = GsonConverterFactory.create(new GsonBuilder().create());

    private static RetrofitHelper instance= null;
    private Retrofit mRetrofit;

    private RetrofitHelper(Context context){
        mContext=context;
        init();

    }
    public static RetrofitHelper getInstance(Context context){
        if(instance==null){
            instance=new RetrofitHelper(context);
        }
        return  instance;
    }

    private void init(){
        resetApp();
    }

    private void resetApp(){
        mRetrofit= new Retrofit.Builder()
                .baseUrl("https://api.douban.com/v2/")
                .client(client)
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

    }
    
    public RetrofitService getService(){
        return mRetrofit.create(RetrofitService.class);
    }











}
