package firstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloandroidstudio.R

class FirstAppActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app2) // une el diseño con la logica
    }
}