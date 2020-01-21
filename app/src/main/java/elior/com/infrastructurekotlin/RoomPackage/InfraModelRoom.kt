package elior.com.infrastructurekotlin.RoomPackage

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "InfraStructureKotlin")
data class InfraModelRoom(@PrimaryKey @ColumnInfo(name = "name") val infra: String)