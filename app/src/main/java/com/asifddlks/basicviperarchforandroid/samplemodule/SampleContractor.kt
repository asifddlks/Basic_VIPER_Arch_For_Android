package com.asifddlks.basicviperarchforandroid.samplemodule

class SampleContractor {

    //abstract methods for view
    interface SampleView{
        fun Sample(): String
    }

    //abstract methods for model
    interface SampleInteractor{
        fun Sample()
    }

    //abstract methods for presenter
    interface SamplePresenter{
        fun Sample()
    }

    //abstract methods for router
    interface SampleRouter{
        fun Sample()
    }
}