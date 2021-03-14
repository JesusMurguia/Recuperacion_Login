package murguia.jesus.recuperacion_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRegistrar.setOnClickListener {

            var intent= Intent(this, ActivityBienvenida::class.java)

            intent.putExtra("nombre",etNombre.text.toString())
            intent.putExtra("apellido",etApellido.text.toString())
            startActivity(intent)
        }
    }
}