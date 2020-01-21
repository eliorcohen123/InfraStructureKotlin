package elior.com.infrastructurekotlin.RoomPackage

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import elior.com.infrastructurekotlin.ModelPackage.InfraModel

@Database(entities = [InfraModel::class], version = 1, exportSchema = false)
abstract class InfraRoomDatabase : RoomDatabase() {

    abstract fun infraDao(): InfraDao

    companion object {
        @Volatile
        private var INSTANCE: InfraRoomDatabase? = null

        fun getDatabase(context: Context): InfraRoomDatabase {
            return INSTANCE
                ?: synchronized(this) {
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
