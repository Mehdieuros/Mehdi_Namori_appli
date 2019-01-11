package hitema.mehdi.mehdi_namori_appli.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hitema.mehdi.mehdi_namori_appli.R
import android.content.Intent
import android.support.v4.app.Fragment
import android.view.View
import android.widget.TextView
import hitema.mehdi.mehdi_namori_appli.fragment.CityFragment
import hitema.mehdi.mehdi_namori_appli.fragment.HomeFragment
import hitema.mehdi.mehdi_namori_appli.fragment.SettingsFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(HomeFragment())

        val intent = intent
        var str = ""

        if (intent != null){
            str = intent.getStringExtra("pays")
            val textView = findViewById<TextView>(R.id.pays_main)
            textView.text = "$str"
        }
    }

    fun menuClick(view: View){
        when (view.id){
            R.id.btnHome -> replaceFragment(HomeFragment())
            R.id.btnCity -> replaceFragment(CityFragment())
            R.id.btnSettings -> replaceFragment(SettingsFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
                .replace(R.id.framelayout, fragment)
                .commit()
    }
}
