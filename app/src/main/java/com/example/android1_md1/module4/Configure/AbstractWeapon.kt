package com.example.android1_md1.module4.Configure

abstract class AbstractWeapon(var maxAmmo: Int, var fireType: FireType) {
    private var ammo= mutableListOf<Ammo>()
    var needReload=ammo.size<=0
    abstract fun createAmmo():Ammo

    fun reload(){
        ammo.clear()
        for(i in 0..maxAmmo)
        ammo.add(createAmmo())
        needReload=false
        }
    fun cockhutter(){
        when (fireType) {
            FireType.Single -> ammo.removeAt(ammo.size-1)
            FireType.Query -> {
                for(i in 0..5){
                    if(ammo.size>0)
                    ammo.removeAt(ammo.size-1)}
            }
        }
        needReload=ammo.size<=0

    }


}