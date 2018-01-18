package webapp.demo.lynn.rxrestrofitdemo.presenter;

import android.content.Intent;

import webapp.demo.lynn.rxrestrofitdemo.view.View;

/**
 * Created by lynn on 2018/1/18.
 */

public interface Presenter {
    void onCreate();

    void onStart();

    void onStop();

    void pause();

    void attachView(View view);


    void attatchIncomingIntent(Intent intent);
}
