package com.example.examentab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.example.examentab.Statics;


public class MainActivity extends AppCompatActivity {

    CardView card_bulb;
    CardView card_charm;
    CardView card_squirtle;
    CardView card_butter;
    CardView card_pika;
    CardView card_gastly;
    CardView card_ditto;
    CardView card_mew;
    CardView card_aron;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        com.example.examentab.Statics._SelectedPokemon = "";

        card_bulb = findViewById(R.id.card_bulbasaur);
        card_charm = findViewById(R.id.card_charmander);
        card_squirtle = findViewById(R.id.card_squirtle);

        card_butter = findViewById(R.id.card_butterfree);
        card_pika = findViewById(R.id.card_pikachu);
        card_gastly = findViewById(R.id.card_gastly);

        card_ditto = findViewById(R.id.card_ditto);
        card_mew = findViewById(R.id.card_mew);
        card_aron = findViewById(R.id.card_aron);

        //Клик ивенты. Открывается окно с информацией о покемоне и в статическую строку в имя покемона
        card_bulb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.examentab.Statics._SelectedPokemon = "Bulbasaur";
                Intent intent = new Intent(MainActivity.this, SelectedPokemon.class);
                startActivity(intent);
            }
        });

        card_charm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.examentab.Statics._SelectedPokemon = "Charmander";
                Intent intent = new Intent(MainActivity.this, SelectedPokemon.class);
                startActivity(intent);
            }
        });

        card_squirtle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.examentab.Statics._SelectedPokemon = "Squirtle";
                Intent intent = new Intent(MainActivity.this, SelectedPokemon.class);
                startActivity(intent);
            }
        });

        card_butter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.examentab.Statics._SelectedPokemon = "Butterfree";
                Intent intent = new Intent(MainActivity.this, SelectedPokemon.class);
                startActivity(intent);
            }
        });

        card_pika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.examentab.Statics._SelectedPokemon = "Pikachu";
                Intent intent = new Intent(MainActivity.this, SelectedPokemon.class);
                startActivity(intent);
            }
        });

        card_gastly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.examentab.Statics._SelectedPokemon = "Gastly";
                Intent intent = new Intent(MainActivity.this, SelectedPokemon.class);
                startActivity(intent);
            }
        });

        card_ditto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.examentab.Statics._SelectedPokemon = "Ditto";
                Intent intent = new Intent(MainActivity.this, SelectedPokemon.class);
                startActivity(intent);
            }
        });

        card_mew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.examentab.Statics._SelectedPokemon = "Mew";
                Intent intent = new Intent(MainActivity.this, SelectedPokemon.class);
                startActivity(intent);
            }
        });

        card_aron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.examentab.Statics._SelectedPokemon = "Aron";
                Intent intent = new Intent(MainActivity.this, SelectedPokemon.class);
                startActivity(intent);
            }
        });
    }
}