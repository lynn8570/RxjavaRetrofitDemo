package webapp.demo.lynn.rxrestrofitdemo.view;

import webapp.demo.lynn.rxrestrofitdemo.entity.Book;

/**
 * Created by lynn on 2018/1/18.
 */

public interface BookView extends View {

    void onSuccess(Book book);

    void onError(String result);

}
