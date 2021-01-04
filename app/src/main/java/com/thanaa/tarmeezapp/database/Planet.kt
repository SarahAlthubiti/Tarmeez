package com.thanaa.tarmeezapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Planet(@PrimaryKey val id:Int, val name:String)
