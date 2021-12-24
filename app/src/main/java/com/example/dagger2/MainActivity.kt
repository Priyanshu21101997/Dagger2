package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @set:Inject
    lateinit var car:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // 1. Constructor Injection -> USe @Inject keyword n constructor and COmponent keyword on car component
//        val component:CarComponent = DaggerCarComponent.create()
//
//        car = component.getCar()
//        car.drive()

        // 2.Field Injection -> Annotate our member variable . Cant make our member variable private

        val component:CarComponent = DaggerCarComponent.create()
        component.inject(this)

        car?.drive()

        //3. Modules -> Used when we have to work with external libraries so make a module calss
        // and use provides annotation. Then in our componenet add moduels on top

        // Declare dependency as an interface insted of a class



    }
}