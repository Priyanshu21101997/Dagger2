package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Car {

    private val TAG = "Car"
    
    var engine:Engine
    var wheels:Wheels

    @Inject
    constructor( engine:Engine,wheels:Wheels){
        this.engine = engine
        this.wheels = wheels
    }
    
    fun drive(){
        Log.d(TAG, "drive: driving")
    }
}