package com.asifddlks.basicviperarchforandroid.samplemodule

import android.content.Context

class SamplePresenter(private val sampleView: SampleContractor.SampleView, private val context: Context): SampleContractor.SamplePresenter{

    private val sampleInteractor: SampleInteractor = SampleInteractor(this)

    override fun Sample() {


    }
}