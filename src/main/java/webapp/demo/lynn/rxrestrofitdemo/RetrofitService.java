package webapp.demo.lynn.rxrestrofitdemo;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
import webapp.demo.lynn.rxrestrofitdemo.entity.Book;

/**
 * Created by lynn on 2018/1/18.
 * 与web api相对应，定义 get post head put delete等接口方法，具体查阅retrofit的api
 * 与rxjava结合和，可定义返回对象为 observable。便于后续的响应式开发
 * <p>
 * 这个只是个接口定义，最后以RetrofitService service = mRetrofit.create(RetrofitService.class);的形式由retrofit来实现和返回
 * retrofit负责将定义网络请求进行接口封装
 */

public interface RetrofitService {

    @GET("book/search")
    Observable<Book> getSearchBook(@Query("q") String name,
                                   @Query("tag") String tag,
                                   @Query("start") int start,
                                   @Query("count") int count);

    @GET("group/{id}/users")
    Call<Book> groupList(@Path("id") int groupId);

    @GET("group/{id}/users")
    Call<Book> groupList(@Path("id") int groupId, @Query("sort") String sort);


}
