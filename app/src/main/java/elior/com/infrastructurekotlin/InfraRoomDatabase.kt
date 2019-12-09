package elior.com.infrastructurekotlin

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(entities = [Infra::class], version = 1, exportSchema = false)
abstract class InfraRoomDatabase : RoomDatabase() {

    abstract fun infraDao(): InfraDao

    companion object {
        @Volatile
        private var INSTANCE: InfraRoomDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): InfraRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    InfraRoomDatabase::class.java,
                    "InfraStructureKotlin"
                )
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }

}
