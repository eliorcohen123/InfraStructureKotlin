package elior.com.infrastructurekotlin.RoomPackage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lelior/com/infrastructurekotlin/RoomPackage/InfraRepository;", "", "infraDao", "Lelior/com/infrastructurekotlin/RoomPackage/InfraDao;", "(Lelior/com/infrastructurekotlin/RoomPackage/InfraDao;)V", "allWords", "Landroidx/lifecycle/LiveData;", "", "Lelior/com/infrastructurekotlin/RoomPackage/InfraModelRoom;", "getAllWords", "()Landroidx/lifecycle/LiveData;", "delete", "", "deleteAll", "insert", "infraModelRoom", "update", "app_debug"})
public final class InfraRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<elior.com.infrastructurekotlin.RoomPackage.InfraModelRoom>> allWords = null;
    private final elior.com.infrastructurekotlin.RoomPackage.InfraDao infraDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<elior.com.infrastructurekotlin.RoomPackage.InfraModelRoom>> getAllWords() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    elior.com.infrastructurekotlin.RoomPackage.InfraModelRoom infraModelRoom) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    elior.com.infrastructurekotlin.RoomPackage.InfraModelRoom infraModelRoom) {
    }
    
    public final void delete() {
    }
    
    public final void deleteAll() {
    }
    
    public InfraRepository(@org.jetbrains.annotations.NotNull()
    elior.com.infrastructurekotlin.RoomPackage.InfraDao infraDao) {
        super();
    }
}