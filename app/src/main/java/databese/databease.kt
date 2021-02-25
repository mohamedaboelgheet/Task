package databese

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase
import doa.Tackdao

@Database(entities = [Taskdata::class],version = 1,exportSchema = true)
abstract class databease: RoomDatabase () {

    abstract fun TaskDoa(): Tackdao

    companion object {
        var mydatabease: databease? = null


    }

    fun getinstence(context: Context): databease {
        if (mydatabease == null) {

            mydatabease = databaseBuilder(context, databease::class.java, "mohamed")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build()


        }
        return mydatabease!!
    }
}


