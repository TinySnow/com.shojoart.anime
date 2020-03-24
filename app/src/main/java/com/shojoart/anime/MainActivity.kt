package com.shojoart.anime

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_activity_left_drawerlayout.*
import kotlinx.android.synthetic.main.main_activity_toolbar.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(main_activity_toolbar)
//        val actionbar : androidx.appcompat.app.ActionBar? = supportActionBar
//        if (actionbar != null){
//            actionbar.setDisplayHomeAsUpEnabled(true)
//            actionbar.setHomeAsUpIndicator(R.drawable.ic_menu)
//        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return true
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
