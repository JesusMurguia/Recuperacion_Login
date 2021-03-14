package murguia.jesus.recuperacion_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bienvenida.*

class ActivityBienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        var extras=intent.extras

        tvNombre.text="${extras!!.getString("nombre")} ${extras!!.getString("apellido")}"
    }
}