package com.asifddlks.basicviperarchforandroid.samplemodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asifddlks.basicviperarchforandroid.R
import com.asifddlks.basicviperarchforandroid.databinding.ActivitySampleBinding

class SampleActivity : AppCompatActivity() {


    private lateinit var binding: ActivitySampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sample)

        binding = ActivitySampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {

        }
    }
}