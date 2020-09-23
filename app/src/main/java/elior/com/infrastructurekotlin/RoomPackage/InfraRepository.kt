package elior.com.infrastructurekotlin.RoomPackage

import androidx.lifecycle.LiveData

class InfraRepository(private val infraDao: InfraDao) {

    val allInfras: LiveData<List<InfraModelRoom>> = infraDao.getInfras()

    fun insert(infraModelRoom: InfraModelRoom) {
        infraDao.insert(infraModelRoom)
    }

    fun update(infraModelRoom: InfraModelRoom) {
        infraDao.update(infraModelRoom)
    }

    fun delete() {
        infraDao.deleteInfra()
    }

    fun deleteAll() {
        infraDao.deleteAll()
    }

}
