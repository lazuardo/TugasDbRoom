package com.example.dbroom;

//    LATIHAN 3
//    NIM       : 10117139
//    Nama      : Nofrizal
//    Kelas     : IF4
//    Matakuliah: AKB4
//    Dibuat pada tanggal 1 Mei 2020

import androidx.room.RoomDatabase;
import androidx.room.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AktivisDao aktivisDao();
}
