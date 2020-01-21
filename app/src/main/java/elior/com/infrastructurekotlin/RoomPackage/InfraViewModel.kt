package elior.com.infrastructurekotlin.RoomPackage

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import elior.com.infrastructurekotlin.ModelPackage.InfraModel
import elior.com.infrastructurekotlin.RoomPackage.InfraRepository
import elior.com.infrastructurekotlin.RoomPackage.InfraRoomDatabase
import kotlinx.coroutines.launch

class InfraViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: InfraRepository
    val allWords: LiveData<List<InfraModel>>

    init {
        val wordsDao = InfraRoomDatabase.getDatabase(application).infraDao()
        repository =
            InfraRepository(wordsDao)
        allWords = repository.allWords
    }

    fun insert(infraModel: InfraModel) = viewModelScope.launch {
        repository.insert(infraModel)
    }

    fun update(infraModel: InfraModel) = viewModelScope.launch {
        repository.update(infraModel)
    }

    fun delete() = viewModelScope.launch {
        repository.delete()
    }

    fun deleteAll() = viewModelScope.launch {
        repository.deleteAll()
    }

}
