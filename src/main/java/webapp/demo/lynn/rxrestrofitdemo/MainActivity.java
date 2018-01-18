package webapp.demo.lynn.rxrestrofitdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import webapp.demo.lynn.rxrestrofitdemo.entity.Book;
import webapp.demo.lynn.rxrestrofitdemo.presenter.BookPresenter;
import webapp.demo.lynn.rxrestrofitdemo.presenter.Presenter;
import webapp.demo.lynn.rxrestrofitdemo.view.BookView;


public class MainActivity extends Activity {


    private TextView textview;
    private Button button;

    private BookPresenter mBookPresenter = new BookPresenter(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = (TextView) findViewById(R.id.textview);
        button = (Button) findViewById(R.id.button);

        mBookPresenter.onCreate();
        mBookPresenter.attachView(mBookView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBookPresenter.getSearchBooks("白夜行",null,0,1);
            }
        });


//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://api.douban.com/v2/")
//                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .build();
//
//        RetrofitService service = retrofit.create(RetrofitService.class);



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

      /*  Observable<Book> observable = service.getSearchBook("白夜行", null, 0, 1);

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

*/

    }

    private BookView mBookView = new BookView() {
        @Override
        public void onSuccess(Book book) {
            textview.setText(book.toString());
        }

        @Override
        public void onError(String result) {
            Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();
        }
    };
}
