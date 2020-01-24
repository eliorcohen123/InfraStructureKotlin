package elior.com.infrastructurekotlin.RetrofitPackage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lelior/com/infrastructurekotlin/RetrofitPackage/GetDataService;", "", "getAllMovies", "Lio/reactivex/Observable;", "Lelior/com/infrastructurekotlin/DataPackage/JSONResponse;", "Companion", "app_debug"})
public abstract interface GetDataService {
    public static final elior.com.infrastructurekotlin.RetrofitPackage.GetDataService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/search/movie?/&query=q&api_key=4e0be2c22f7268edffde97481d49064a")
    public abstract io.reactivex.Observable<elior.com.infrastructurekotlin.DataPackage.JSONResponse> getAllMovies();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lelior/com/infrastructurekotlin/RetrofitPackage/GetDataService$Companion;", "", "()V", "create", "Lelior/com/infrastructurekotlin/RetrofitPackage/GetDataService;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final elior.com.infrastructurekotlin.RetrofitPackage.GetDataService create() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}