package id.dicka.androidroomkotlin.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SubscriberDao {

    @Insert
    suspend fun insertSubscriber(subscriber: Subscriber) : Long

    @Update
    suspend fun updateSubscriber(subscriber: Subscriber)

    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber)

    @Query(value = "DELETE FROM subscriber_data_table")
    suspend fun deleteAll()

    @Query(value = "SELECT * FROM subscriber_data_table")
    fun getAllSubscribers(): LiveData<List<Subscriber>>


//    @Insert
//    fun insertSubscriber1(subscriber: Subscriber) : Long
//
//    @Insert
//    fun insertSubscriber2(subscriber1: Subscriber, subscriber2: Subscriber, subscriber3: Subscriber) : List<Long>
//
//    @Insert
//    fun insertSubscribers1(subscribers: List<Subscriber>) : List<Long>
//
//    @Insert
//    fun insertSubscribers2(subscriber: Subscriber, subscribers: List<Subscriber>) : List<Long>
}