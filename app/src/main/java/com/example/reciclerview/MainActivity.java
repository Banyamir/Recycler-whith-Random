package com.example.reciclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.reciclerview.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;

    int minimo=100;
    int maximo=500;
        Random rando = new Random();
        int n = rando.nextInt((maximo-minimo)+1)+minimo;
        int rango = n;

        String artist[] = new String[rango];
        String canc[] = new String[rango];
        int caract[] = new int[rango];;

    private int [] caratulas = {R.drawable.ba,R.drawable.bb,R.drawable.bc,R.drawable.bd,R.drawable.be,
            R.drawable.bf,R.drawable.bg, R.drawable.bh};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanciamos recycler
        recyclerview=(RecyclerView)findViewById(R.id.RecyclerV);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(new Datos( this,artist,canc,caract));
        rellenarartist();
        rellenarcancion();
        rellenacaratula ();
    }

    private void rellenacaratula() {
        for (int i=0; i<caract.length; i++) {
            Random ra = new Random();
            int num = ra.nextInt(8);
            caract[i]=caratulas[num];

        }
    }

    private void rellenarartist() {
        for (int i=0; i<artist.length; i++) {
            Random rando = new Random();
            int num = rando.nextInt(8);
            String Artista="";
            switch (num) {
                case 0:
                    Artista= "Artista 1";
                    break;
                case 1:
                    Artista= "Artista 2";
                    break;
                case 2:
                    Artista= "Artista 3";
                    break;
                case 3:
                    Artista= "Artista 4";
                    break;
                case 4:
                    Artista= "Artista 5";
                    break;
                case 5:
                    Artista= "Artista 6";
                    break;
                case 6:
                    Artista= "Artista 7";
                    break;
                case 7:
                    Artista="Artista 8";
                    break;

            }
            artist[i]=Artista;
        }
    }

    private void rellenarcancion() {
            for (int i = 0; i< canc.length; i++) {
                Random rando = new Random();
                int num = rando.nextInt(8);
                String Cancion = "";
                switch (num) {
                    case 0:
                        Cancion = "Cancion 1";
                        break;
                    case 1:
                        Cancion = "Cancion 2";
                        break;
                    case 2:
                        Cancion = "Cancion 3";
                        break;
                    case 3:
                        Cancion = "Cancion 4";
                        break;
                    case 4:
                        Cancion = "Cancion 5";
                        break;
                    case 5:
                        Cancion = "Cancion 6";
                        break;
                    case 6:
                        Cancion = "Cancion 7";
                        break;
                    case 7:
                        Cancion = "Cancion 8";
                        break;

                }
                canc[i] = Cancion;
            }
        }
    }

