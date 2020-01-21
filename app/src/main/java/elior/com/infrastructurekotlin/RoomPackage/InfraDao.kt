package elior.com.infrastructurekotlin.RoomPackage

import androidx.lifecycle.LiveData;
import androidx.room.*

@Dao
interface InfraDao {

    @Query("SELECT * from InfraStructureKotlin ORDER BY name ASC")
    fun getInfras(): LiveData<List<InfraModelRoom>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(infraModelRoom: InfraModelRoom)

    @Update
    fun update(infraModelRoom: InfraModelRoom)

    @Query("DELETE From InfraStructureKotlin where name = name")
    fun deleteInfra()

    @Query("DELETE FROM InfraStructureKotlin")
    suspend fun deleteAll()
}
