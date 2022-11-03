package com.example.module4databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.module4databinding.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        var john = User("John","JW@free.fr","+33420420420","Newark","USA")
        amb.user = john
        amb.buttonCheckData.setOnClickListener {
            Snackbar.make(
                amb.root,
                amb.user.toString(),
                Snackbar.LENGTH_LONG
            ).show()
        }
    }
}