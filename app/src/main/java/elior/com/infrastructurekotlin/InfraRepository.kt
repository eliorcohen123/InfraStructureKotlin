package elior.com.infrastructurekotlin

import androidx.lifecycle.LiveData

class InfraRepository(private val infraDao: InfraDao) {

    val allWords: LiveData<List<Infra>> = infraDao.getInfras()

    suspend fun insert(infra: Infra) {
        infraDao.insert(infra)
    }

    suspend fun update(infra: Infra) {
        infraDao.update(infra)
    }

    suspend fun delete() {
        infraDao.deleteInfra()
    }

    suspend fun deleteAll() {
        infraDao.deleteAll()
    }

}
