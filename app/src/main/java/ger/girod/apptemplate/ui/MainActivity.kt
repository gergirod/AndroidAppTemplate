package ger.girod.apptemplate.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ger.girod.apptemplate.R
import ger.girod.apptemplate.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
