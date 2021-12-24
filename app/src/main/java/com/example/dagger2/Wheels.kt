package com.example.dagger2

import javax.inject.Inject

class Wheels {

    private val rims:Rims
    private val tyres:Tyres

    constructor(rims:Rims,tyres:Tyres){
        this.rims = rims
        this.tyres = tyres
    }
}