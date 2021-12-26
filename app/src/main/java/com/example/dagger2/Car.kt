package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Car {

    private val TAG = "Car"
    
    var engine:Engine
    var engineInterface:EngineInterface
    var wheels:Wheels

    @Inject
    constructor( engine:Engine,wheels:Wheels,engineInterface:EngineInterface){
        this.engine = engine
        this.wheels = wheels
        this.engineInterface = engineInterface

    }
    
    fun drive(){
        engineInterface.start()
        Log.d(TAG, "drive: driving")
    }
}