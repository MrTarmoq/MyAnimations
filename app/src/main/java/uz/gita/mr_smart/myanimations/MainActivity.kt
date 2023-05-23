package uz.gita.mr_smart.myanimations

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.gita.mr_smart.myanimations.databinding.ActivityMainBinding
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            image1.setOnClickListener {
                rotationAnimation(it)
            }
            image2.setOnClickListener {
                exampleAnimation(it)
            }

            image3.setOnClickListener {
                exampleAnimation1(it)
            }

            image4.setOnClickListener {
                exampleAnimation2(it)
            }
        }

    }

    private fun exampleAnimation(view: View){

        ValueAnimator.ofFloat(0f, 100f).apply {
            addUpdateListener {
                view.alpha = (100 - it.animatedValue as Float) / 100
            }
            duration = 2000
            start()
        }

        ValueAnimator.ofFloat(0f, 100f).apply {
            addUpdateListener {
                view.alpha = (it.animatedValue as Float) / 100
            }
            duration = 2000
            start()
        }
    }

    private fun rotationAnimation(view: View){
        ValueAnimator.ofFloat(0f, 360f).apply {
            addUpdateListener {
                view.rotation = it.animatedValue as Float
            }
            duration = 2000
            start()
        }
    }

    private fun exampleAnimation1(view: View){

    }

    private fun exampleAnimation2(view: View){

    }

}