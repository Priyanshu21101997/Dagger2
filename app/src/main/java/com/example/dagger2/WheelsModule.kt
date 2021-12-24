package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims():Rims{
        return Rims();
    }

    @Provides
    fun provideTyres():Tyres{
        val tyre = Tyres()
        tyre.inflate()
        return tyre
    }

    @Provides
    fun provideWheels(rims:Rims,tyre:Tyres):Wheels{
        return Wheels(rims, tyre)
    }

}