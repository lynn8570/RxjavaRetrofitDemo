package webapp.demo.lynn.rxrestrofitdemo.presenter;

import android.content.Context;
import android.content.Intent;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;
import webapp.demo.lynn.rxrestrofitdemo.entity.Book;
import webapp.demo.lynn.rxrestrofitdemo.manager.DataManager;
import webapp.demo.lynn.rxrestrofitdemo.view.BookView;
import webapp.demo.lynn.rxrestrofitdemo.view.View;

/**
 * Created by lynn on 2018/1/18.
 * p 的出现，是为了解决activity太过臃肿的问题，
 * view 通过 p 来读取 m中的东西。
 *
 * activity 通过 BookPresenter 访问数据，数据通过
 * BookView在回掉中返回数据。
 * 在bookview的回调中实现界面的更新
 *
 *
 */

public class BookPresenter implements Presenter {
    private DataManager manager;

    private CompositeSubscription mCompositeSubscription;
    private Context mContext;
    private BookView mBookView;
    private Book mBook;

    public BookPresenter(Context context){
        this.mContext=context;
    }

    @Override
    public void onCreate() {
       manager=new DataManager(mContext);
       mCompositeSubscription=new CompositeSubscription();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {
        if(mCompositeSubscription.hasSubscriptions()){
            mCompositeSubscription.unsubscribe();
        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void attachView(View view) {
        mBookView = (BookView) view;
    }

    @Override
    public void attatchIncomingIntent(Intent intent) {

    }

    public void getSearchBooks(String name,String tag,int start,int count){
        mCompositeSubscription.add(manager.getSearchBooks(name,tag,start,count)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<Book>() {
            @Override
            public void onCompleted() {
                mBookView.onSuccess(mBook);
            }

            @Override
            public void onError(Throwable e) {
                mBookView.onError("请求失败");
            }

            @Override
            public void onNext(Book book) {
                mBook =book;
            }
        }));
    }
}
