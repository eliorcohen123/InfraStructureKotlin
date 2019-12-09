package elior.com.infrastructurekotlin

import androidx.lifecycle.LiveData;
import androidx.room.*

@Dao
interface InfraDao {

    @Query("SELECT * from InfraStructureKotlin ORDER BY name ASC")
    fun getInfras(): LiveData<List<Infra>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(infra: Infra)

    @Update
    fun update(infra: Infra)

    @Query("DELETE From InfraStructureKotlin where name = name")
    fun deleteInfra()

    @Query("DELETE FROM InfraStructureKotlin")
    suspend fun deleteAll()
}
