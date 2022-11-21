package com.example.agenda2;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;

import androidx.room.Entity;

import androidx.room.PrimaryKey;
@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "nombre")
    private String nombre;
    @ColumnInfo(name = "telefono")
    private String telefono;

    public Word(@NonNull String nombre, String telefono) {

        this.telefono= telefono;
        this.nombre = nombre;}


    public String getNombre(){return this.nombre;}
    public String getTelefono(){return this.telefono;}
}
