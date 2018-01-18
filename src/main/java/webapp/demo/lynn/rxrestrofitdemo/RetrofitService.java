package webapp.demo.lynn.rxrestrofitdemo;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
import webapp.demo.lynn.rxrestrofitdemo.entity.Book;

/**
 * Created by lynn on 2018/1/18.
 */

public interface RetrofitService {

    @GET("book/search")
    Observable<Book> getSearchBook(@Query("q")String name,
                                   @Query("tag")String tag,
                                   @Query("start")int start,
                                   @Query("count")int count);

    @GET("group/{id}/users")
    Call<Book> groupList(@Path("id") int groupId);

    @GET("group/{id}/users")
    Call<Book> groupList(@Path("id") int groupId,@Query("sort") String sort);


}
