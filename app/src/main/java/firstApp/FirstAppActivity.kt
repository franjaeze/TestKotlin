package firstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.helloandroidstudio.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app) // une el diseño con la logica

        val btnStart=findViewById<AppCompatButton>(R.id.btnStart)
        val editText=findViewById<AppCompatEditText>(R.id.editor)

        val name = editText.text.toString()

        btnStart.setOnClickListener{
            if(name.isNotEmpty()){
            Log.i("FranDev", "Button clicked ${name}")
        }

    }
}
}