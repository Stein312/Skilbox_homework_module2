package com.example.android1_md1.module4.Configure

object Weapons {
    class Pistol : AbstractWeapon(10, FireType.Single) {
        override fun createAmmo(): Ammo {
            return Ammo.Pistol
        }
    }
    class Rifle: AbstractWeapon(maxAmmo = 5, fireType = FireType.Single) {
        override fun createAmmo(): Ammo {
            return Ammo.Rifle
        }
    }

    class AutoPistol: AbstractWeapon(9, FireType.Query) {
        override fun createAmmo(): Ammo {
            return Ammo.AutoPistol
        }
    }
}