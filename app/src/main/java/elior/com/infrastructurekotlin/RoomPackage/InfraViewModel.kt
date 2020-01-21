package elior.com.infrastructurekotlin.RoomPackage

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class InfraViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: InfraRepository
    val allWords: LiveData<List<InfraModelRoom>>

    init {
        val wordsDao = InfraRoomDatabase.getDatabase(application).infraDao()
        repository =
            InfraRepository(wordsDao)
        allWords = repository.allWords
    }

    fun insert(infraModelRoom: InfraModelRoom) = viewModelScope.launch {
        repository.insert(infraModelRoom)
    }

    fun update(infraModelRoom: InfraModelRoom) = viewModelScope.launch {
        repository.update(infraModelRoom)
    }

    fun delete() = viewModelScope.launch {
        repository.delete()
    }

    fun deleteAll() = viewModelScope.launch {
        repository.deleteAll()
    }

}
