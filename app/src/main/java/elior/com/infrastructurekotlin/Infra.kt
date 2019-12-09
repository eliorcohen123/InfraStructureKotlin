package elior.com.infrastructurekotlin

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "InfraStructureKotlin")
data class Infra(@PrimaryKey @ColumnInfo(name = "name") val infra: String)
