package elior.com.infrastructurekotlin.RoomPackage

import androidx.lifecycle.LiveData

class InfraRepository(private val infraDao: InfraDao) {

    val allWords: LiveData<List<InfraModelRoom>> = infraDao.getInfras()

    suspend fun insert(infraModelRoom: InfraModelRoom) {
        infraDao.insert(infraModelRoom)
    }

    suspend fun update(infraModelRoom: InfraModelRoom) {
        infraDao.update(infraModelRoom)
    }

    suspend fun delete() {
        infraDao.deleteInfra()
    }

    suspend fun deleteAll() {
        infraDao.deleteAll()
    }

}
