package com.rezky.latihan3monitory;

/*
 * NIM   : 10118016
 * NAMA  : Rezky Nur Fauzi
 * KELAS : IF-01
 * TGL   : 4/05/2021
 * Deskripsi : Membuat Tampilan MainActivity dan membuat onClick menuju LoginActivity
 * */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnmulai(View view) {
        Intent intent =  new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}