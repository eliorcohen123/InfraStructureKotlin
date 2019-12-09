package elior.com.infrastructurekotlin

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
interface InfraDao {

    @Query("SELECT * from InfraStructureKotlin ORDER BY name ASC")
    fun getAlphabetizedInfras(): LiveData<List<Infra>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(infra: Infra)

    @Query("DELETE FROM InfraStructureKotlin")
    suspend fun deleteAll()
}
