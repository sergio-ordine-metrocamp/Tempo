package br.com.metrocamp.example.sergio.tempo.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.metrocamp.example.sergio.tempo.R;
import br.com.metrocamp.example.sergio.tempo.model.Clima;
import br.com.metrocamp.example.sergio.tempo.model.TipoClima;

/**
 * Created by Sergio on 3/5/18.
 */

public class CompleteAdapter extends RecyclerView.Adapter<CompleteAdapter.ViewHolder> {

    private ItemClickListener listener;

    public void setListener(ItemClickListener listener) {
        this.listener = listener;
    }

    public interface ItemClickListener {
        public void itemSelected (Clima item, int index);
    }

    private List<Clima> lista;
    private LayoutInflater inflater;
    private Context context;



    // data is passed into the constructor
    public CompleteAdapter(Context context, List<Clima> data) {
        this.inflater = LayoutInflater.from(context);
        this.lista = data;
        this.context = context;
    }

    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView cityName;
        TextView temperatura;
        ImageView icone;

        ViewHolder(View itemView) {
            super(itemView);
            cityName = itemView.findViewById(R.id.nomeCidade);
            temperatura = itemView.findViewById(R.id.temperatura);
            icone = itemView.findViewById(R.id.imgClima);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            if (listener != null) {
                int selectedIndex = getAdapterPosition();
                listener.itemSelected(getItem(selectedIndex), selectedIndex);
            }
        }
    }

    // convenience method for getting data at click position
    Clima getItem(int id) {
        return lista.get(id);
    }

    //Carrega uma célula do layout quando necessário
    @Override
    public CompleteAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.complete_cell, parent, false);
        return new CompleteAdapter.ViewHolder(view);

    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Clima clima = lista.get(position);
        holder.cityName.setText(clima.getNome());
        holder.temperatura.setText("" + clima.getTemperatura());

        setIcone(holder, clima.getTipoClima());

    }

    // total number of rows
    @Override
    public int getItemCount() {
        return lista.size();
    }


    public void setIcone(ViewHolder holder, TipoClima clima) {

        int idImagem = 0;

        switch (clima) {
            case SOL:
                idImagem = R.drawable.sol;
                break;
            case NUBLADO:
                idImagem = R.drawable.nublado;
                break;
            case CHUVOSO:
                idImagem = R.drawable.chuva;
                break;
            case TEMPESTADE:
                idImagem = R.drawable.tempestade;
                break;
        }

        holder.icone.setImageDrawable(context.getResources().getDrawable(idImagem));

    }

}

