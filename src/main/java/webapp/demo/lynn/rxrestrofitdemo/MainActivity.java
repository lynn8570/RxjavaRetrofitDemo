package webapp.demo.lynn.rxrestrofitdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import webapp.demo.lynn.rxrestrofitdemo.mode.Book;




public class MainActivity extends Activity {


    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textview = (TextView) findViewById(R.id.textview);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.douban.com/v2/")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        RetrofitService service = retrofit.create(RetrofitService.class);

//        Call<Book> call = service.getSearchBook("白夜行",null,0,1);

//        call.enqueue(new Callback<Book>() {
//            @Override
//            public void onResponse(Call<Book> call, Response<Book> response) {
//                    textview.setText(response.body().toString());
//            }
//
//            @Override
//            public void onFailure(Call<Book> call, Throwable t) {
//
//            }
//        });

        Observable<Book> observable = service.getSearchBook("白夜行", null, 0, 1);

        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Book>() {
                    @Override
                    public void onCompleted() {
                        Log.i("linlian","onCompleted()");
                    }

                    @Override
                    public void onError(Throwable e) {
                         e.printStackTrace();
                    }

                    @Override
                    public void onNext(Book book) {
                         textview.setText(book.toString());
                    }
                });



    }
}
