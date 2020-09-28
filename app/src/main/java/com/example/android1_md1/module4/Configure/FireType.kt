package com.example.android1_md1.module4.Configure

sealed class FireType(var fireType: String){
    object Single: FireType("Single")
    object Query:FireType("Query")
}
