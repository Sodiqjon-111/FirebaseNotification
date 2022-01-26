package uz.sodiqjon.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {


    override fun onNewToken(token: String) {

       // val refreshToken = FirebaseInstanceIdInternal.getInstance().token
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

        shownotification(remoteMessage.notification?.title.toString(),remoteMessage.notification?.body.toString())



    }

    fun shownotification(title:String, message:String){

        val builder=NotificationCompat.Builder(this,"test")
            .setContentTitle(title)
            .setContentText(message)


                val manager= NotificationManagerCompat.from(this)
                    manager.notify(222,builder.build())

    }


}