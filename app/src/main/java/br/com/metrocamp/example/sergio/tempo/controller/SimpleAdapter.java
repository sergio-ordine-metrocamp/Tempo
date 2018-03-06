package br.com.metrocamp.example.sergio.tempo.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.metrocamp.example.sergio.tempo.R;
import br.com.metrocamp.example.sergio.tempo.model.Clima;

/**
 * Created by Sergio on 3/5/18.
 */

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {

    private List<Clima> lista;
    private LayoutInflater inflater;

    // data is passed into the constructor
    public SimpleAdapter(Context context, List<Clima> data) {
        this.inflater = LayoutInflater.from(context);
        this.lista = data;
    }

    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder  {
        TextView cityName;

        ViewHolder(View itemView) {
            super(itemView);
            cityName = itemView.findViewById(R.id.nomeCidade);
        }
    }

    //Carrega uma célula do layout quando necessário
    @Override
    public SimpleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.simple_cell, parent, false);
        return new SimpleAdapter.ViewHolder(view);

    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Clima clima = lista.get(position);
        holder.cityName.setText(clima.getNome());
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return lista.size();
    }

}
