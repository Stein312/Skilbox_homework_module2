package com.example.android1_md1.module4.Configure

import com.example.android1_md1.module4.Interface.InterfaceWarrior
import kotlin.random.Random

abstract class AbstractWarrior(
    val maxHP: Int,
    override val evasion: Int,
    val accuracy: Int,
    val weapon: AbstractWeapon
) : InterfaceWarrior {
    var HP = maxHP
        private set
    override var iskilled: Boolean = false


    override fun attack(warrior: InterfaceWarrior) {
        if (!weapon.needReload) {
            weapon.cockhutter()
            if (weapon.fireType == FireType.Single)
                if (Random.nextInt(101) < accuracy - warrior.evasion)
                    warrior.damage(weapon.createAmmo().currentDamage(weapon.createAmmo()))
                else for (i in 0..5)
                    if (Random.nextInt(101) < accuracy - warrior.evasion)
                        warrior.damage(weapon.createAmmo().currentDamage(weapon.createAmmo()))

        } else {
            weapon.reload()
        }
    }

    override fun damage(dmg: Int) {
        HP -= dmg
        if (HP <= 0) iskilled = true

    }
}