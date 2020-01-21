package elior.com.infrastructurekotlin.RoomPackage

import androidx.lifecycle.LiveData;
import androidx.room.*
import elior.com.infrastructurekotlin.ModelPackage.InfraModel

@Dao
interface InfraDao {

    @Query("SELECT * from InfraStructureKotlin ORDER BY name ASC")
    fun getInfras(): LiveData<List<InfraModel>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(infraModel: InfraModel)

    @Update
    fun update(infraModel: InfraModel)

    @Query("DELETE From InfraStructureKotlin where name = name")
    fun deleteInfra()

    @Query("DELETE FROM InfraStructureKotlin")
    suspend fun deleteAll()
}
