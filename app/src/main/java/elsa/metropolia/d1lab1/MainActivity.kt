package elsa.metropolia.d1lab1

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mp: MediaPlayer
    private val myClickListener = View.OnClickListener {
        Log.i("My App", "button click $it.text")
        textViewHello.text = getString(R.string.modified)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnClick.setOnClickListener(myClickListener)
        fltBtn.setOnClickListener {
            playSound()
        }
    }

    private fun playSound() {
        mp = MediaPlayer.create(this, R.raw.laugh)
        mp.start()
    }
}


