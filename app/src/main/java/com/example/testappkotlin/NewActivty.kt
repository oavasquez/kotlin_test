package com.example.testappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_new_activty.*

class NewActivty : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_activty)

        progressBar.progress=20;

        fab.setOnClickListener{
            progressBar.progress=(progressBar.progress+5)%100


        }
    }
}
