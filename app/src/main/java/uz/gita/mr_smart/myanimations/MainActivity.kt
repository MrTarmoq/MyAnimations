package uz.gita.mr_smart.myanimations

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt = findViewById<TextView>(R.id.text)
        txt.setOnClickListener {
            exampleAnimation(txt)
        }
    }

    private fun exampleAnimation(view: View){
        ValueAnimator.ofFloat(0f, 360f).apply {
            addUpdateListener {
                view.rotation = it.animatedValue as Float
            }
            duration = 2000
            start()
        }
    }

}