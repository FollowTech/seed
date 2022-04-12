package com.example.seed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seed.ui.main.MainFragment

class MainActivity : AppCompatActivity() {
    
    var toolBar:Int = 1 
    var toolBar:Int = 1 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}
