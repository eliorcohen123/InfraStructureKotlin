package elior.com.infrastructurekotlin.RoomPackage;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lelior/com/infrastructurekotlin/RoomPackage/InfraDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteInfra", "getInfras", "Landroidx/lifecycle/LiveData;", "", "Lelior/com/infrastructurekotlin/ModelPackage/InfraModel;", "insert", "infraModel", "(Lelior/com/infrastructurekotlin/ModelPackage/InfraModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public abstract interface InfraDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from InfraStructureKotlin ORDER BY name ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<elior.com.infrastructurekotlin.ModelPackage.InfraModel>> getInfras();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    elior.com.infrastructurekotlin.ModelPackage.InfraModel infraModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    elior.com.infrastructurekotlin.ModelPackage.InfraModel infraModel);
    
    @androidx.room.Query(value = "DELETE From InfraStructureKotlin where name = name")
    public abstract void deleteInfra();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM InfraStructureKotlin")
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
}