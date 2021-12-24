package com.example.dagger2

import dagger.Component

@Component(modules = [WheelsModule::class])
interface CarComponent {

//    1. COnstructor Injection
//    fun getCar():Car

//    2. Field Injection

    fun inject(mainActivity:MainActivity)


}