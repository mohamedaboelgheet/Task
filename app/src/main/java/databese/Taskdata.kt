package databese

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Taskdata(


        @ColumnInfo @PrimaryKey(autoGenerate = true)  val  id:Int,

      @ColumnInfo val ittel:String?=null,
      @ColumnInfo val deccrption:String?=null,
       @ColumnInfo val iscomplited:Boolean




)





