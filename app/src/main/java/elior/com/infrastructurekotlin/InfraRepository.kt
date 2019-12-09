package elior.com.infrastructurekotlin

import androidx.lifecycle.LiveData

class InfraRepository(private val infraDao: InfraDao) {

    val allWords: LiveData<List<Infra>> = infraDao.getAlphabetizedInfras()

    suspend fun insert(infra: Infra) {
        infraDao.insert(infra)
    }

}
