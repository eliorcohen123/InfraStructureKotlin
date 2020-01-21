package elior.com.infrastructurekotlin.ModelPackage

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "InfraStructureKotlin")
data class InfraModel(@PrimaryKey @ColumnInfo(name = "name") val infra: String)