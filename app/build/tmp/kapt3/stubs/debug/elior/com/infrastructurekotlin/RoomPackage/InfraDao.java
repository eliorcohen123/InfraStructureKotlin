package elior.com.infrastructurekotlin.RoomPackage;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0003H\'J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\'\u00a8\u0006\f"}, d2 = {"Lelior/com/infrastructurekotlin/RoomPackage/InfraDao;", "", "deleteAll", "", "deleteInfra", "getInfras", "Landroidx/lifecycle/LiveData;", "", "Lelior/com/infrastructurekotlin/RoomPackage/InfraModelRoom;", "insert", "infraModelRoom", "update", "app_debug"})
public abstract interface InfraDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from InfraStructureKotlin ORDER BY name ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<elior.com.infrastructurekotlin.RoomPackage.InfraModelRoom>> getInfras();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    elior.com.infrastructurekotlin.RoomPackage.InfraModelRoom infraModelRoom);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    elior.com.infrastructurekotlin.RoomPackage.InfraModelRoom infraModelRoom);
    
    @androidx.room.Query(value = "DELETE From InfraStructureKotlin where name = name")
    public abstract void deleteInfra();
    
    @androidx.room.Query(value = "DELETE FROM InfraStructureKotlin")
    public abstract void deleteAll();
}