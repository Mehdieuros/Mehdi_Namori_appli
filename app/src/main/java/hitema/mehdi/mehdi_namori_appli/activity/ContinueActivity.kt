package hitema.mehdi.mehdi_namori_appli.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hitema.mehdi.mehdi_namori_appli.R
import kotlinx.android.synthetic.main.activity_continue.*

class ContinueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_continue)

        btnContinue.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity::class.java)
            val str = pays.text.toString()
            intent.putExtra("pays", str);

            startActivity(intent)
            finish()

        }
    }
}
