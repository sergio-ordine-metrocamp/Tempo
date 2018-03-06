package br.com.metrocamp.example.sergio.tempo.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import br.com.metrocamp.example.sergio.tempo.R;
import br.com.metrocamp.example.sergio.tempo.model.CidadeServices;

public class CidadesActivity extends AppCompatActivity {

    CompleteAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cidades);

        RecyclerView lista = (RecyclerView)findViewById(R.id.listaCidades);
        lista.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CompleteAdapter(this, CidadeServices.getClima());
        lista.setAdapter(adapter);
    }
}
