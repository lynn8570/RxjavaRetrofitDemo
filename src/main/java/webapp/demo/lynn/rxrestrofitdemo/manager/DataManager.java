package webapp.demo.lynn.rxrestrofitdemo.manager;

import android.content.Context;


import rx.Observable;
import webapp.demo.lynn.rxrestrofitdemo.RetrofitHelper;
import webapp.demo.lynn.rxrestrofitdemo.RetrofitService;
import webapp.demo.lynn.rxrestrofitdemo.entity.Book;

/**
 * Created by lynn on 2018/1/18.
 * 管理RetrofitService
 * 提供给p层调用
 *
 * 会有
 */

public class DataManager {
    private RetrofitService mRetrofitService;

    public DataManager(Context context){
        this.mRetrofitService = RetrofitHelper.getInstance(context).getService();
    }

    public Observable<Book> getSearchBooks(String name, String tag, int start, int count){
        return mRetrofitService.getSearchBook(name,tag,start,count);
    }
}
