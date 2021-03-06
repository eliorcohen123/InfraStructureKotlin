package elior.com.infrastructurekotlin.RoomPackage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lelior/com/infrastructurekotlin/RoomPackage/InfraViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allWords", "Landroidx/lifecycle/LiveData;", "", "Lelior/com/infrastructurekotlin/RoomPackage/InfraModelRoom;", "getAllWords", "()Landroidx/lifecycle/LiveData;", "repository", "Lelior/com/infrastructurekotlin/RoomPackage/InfraRepository;", "delete", "Lkotlinx/coroutines/Job;", "deleteAll", "insert", "infraModelRoom", "update", "app_debug"})
public final class InfraViewModel extends androidx.lifecycle.AndroidViewModel {
    private final elior.com.infrastructurekotlin.RoomPackage.InfraRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<elior.com.infrastructurekotlin.RoomPackage.InfraModelRoom>> allWords = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<elior.com.infrastructurekotlin.RoomPackage.InfraModelRoom>> getAllWords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull()
    elior.com.infrastructurekotlin.RoomPackage.InfraModelRoom infraModelRoom) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job update(@org.jetbrains.annotations.NotNull()
    elior.com.infrastructurekotlin.RoomPackage.InfraModelRoom infraModelRoom) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job delete() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteAll() {
        return null;
    }
    
    public InfraViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}