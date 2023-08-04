package uz.abbosbek.broadcast

import android.content.Intent
import android.content.IntentFilter
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myGpsBroadcast = MyGpsBroadcast()
        val filter = IntentFilter(LocationManager.PROVIDERS_CHANGED_ACTION)
        filter.addAction(Intent.ACTION_PACKAGE_CHANGED)

        this.registerReceiver(myGpsBroadcast, filter)
    }

    override fun onStop() {
        super.onStop()

    }
}