package elior.com.infrastructurekotlin

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class InfraViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: InfraRepository
    val allWords: LiveData<List<Infra>>

    init {
        val wordsDao = InfraRoomDatabase.getDatabase(application).infraDao()
        repository = InfraRepository(wordsDao)
        allWords = repository.allWords
    }

    fun insert(infra: Infra) = viewModelScope.launch {
        repository.insert(infra)
    }

    fun update(infra: Infra) = viewModelScope.launch {
        repository.update(infra)
    }

    fun delete() = viewModelScope.launch {
        repository.delete()
    }

    fun deleteAll() = viewModelScope.launch {
        repository.deleteAll()
    }

}
