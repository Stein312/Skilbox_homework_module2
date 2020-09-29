package com.example.android1_md1.module4.Configure

abstract class AbstractWeapon(val maxAmmo: Int, val fireType: FireType) {
    private var ammo = mutableListOf<Ammo>()
    val needReload: Boolean
        get() = ammo.size == 0

    abstract fun createAmmo(): Ammo

    fun reload() {
        ammo.clear()
        for (i in 0..maxAmmo)
            ammo.add(createAmmo())
    }

    fun cockTheShutter(): List<Ammo> {
        val newListAmmo = mutableListOf<Ammo>()
        when (fireType) {
            FireType.Single -> {
                newListAmmo.add(ammo.last())
                ammo.removeAt(ammo.size - 1)
            }
            FireType.Query -> {
                for (i in 0..5) {
                    if (!needReload) {
                        newListAmmo.add(ammo.last())
                        ammo.removeAt(ammo.size - 1)
                    }
                }
            }
        }
        return newListAmmo
    }


}