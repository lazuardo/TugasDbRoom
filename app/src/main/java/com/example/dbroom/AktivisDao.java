package com.example.dbroom;

//    LATIHAN 3
//    NIM       : 10117139
//    Nama      : Nofrizal
//    Kelas     : IF4
//    Matakuliah: AKB4
//    Dibuat pada tanggal 1 Mei 2020

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface AktivisDao {
    @Insert
    void tambahAktivis(AktivisEntity aktivisEntity);

    @Delete
    public void hapusAktivis(AktivisEntity aktivisEntity);

    @Query("SELECT * FROM AktivisEntity")
    List<AktivisEntity> tampilSeluruhAktivis();

    @Query("SELECT * FROM AktivisEntity WHERE zonaTugas LIKE :zona")
    List<AktivisEntity> findByZone(String zona);


}
