package com.example.android1_md1.module4.Configure

object Weapons{
    val pistol=object : AbstractWeapon(10,FireType.Single) {
        override fun createAmmo(): Ammo {
            return Ammo.Pistol
        }
    }
    val rifle=object : AbstractWeapon(5,FireType.Single) {
        override fun createAmmo(): Ammo {
            return Ammo.Rifle
        }
    }
    val autoPistol=object : AbstractWeapon(25,FireType.Query) {
        override fun createAmmo(): Ammo {
            return Ammo.Pistol
        }
    }
}