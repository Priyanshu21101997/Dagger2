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
        tyre.inflate() // COnfiguration changes
        return tyre
    }

    @Provides
    fun provideWheels(rims:Rims,tyre:Tyres,engineInterface: EngineInterface):Wheels{
        return Wheels(rims, tyre)
    }

}