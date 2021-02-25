package doa

import androidx.room.*
import databese.Taskdata


@Dao
interface Tackdao {
    @Insert
    fun insert(task:Taskdata)
    @Delete
    fun delete(task: Taskdata)

    @Update
        fun update(task: Taskdata)

    @Query("select *from Taskdata where ittel like :query")
    fun search(query: String):List<Taskdata>
@Query("select*from taskdata")
fun gitallTask(task: Taskdata)




}