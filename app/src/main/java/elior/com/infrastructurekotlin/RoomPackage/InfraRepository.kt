package elior.com.infrastructurekotlin.RoomPackage

import androidx.lifecycle.LiveData

class InfraRepository(private val infraDao: InfraDao) {

    val allWords: LiveData<List<InfraModel>> = infraDao.getInfras()

    suspend fun insert(infraModel: InfraModel) {
        infraDao.insert(infraModel)
    }

    suspend fun update(infraModel: InfraModel) {
        infraDao.update(infraModel)
    }

    suspend fun delete() {
        infraDao.deleteInfra()
    }

    suspend fun deleteAll() {
        infraDao.deleteAll()
    }

}
