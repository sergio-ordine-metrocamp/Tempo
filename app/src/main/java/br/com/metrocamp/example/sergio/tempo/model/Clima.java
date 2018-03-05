package br.com.metrocamp.example.sergio.tempo.model;

/**
 * Created by Sergio on 3/5/18.
 */

public class Clima {

    //Attributes
    private String nome;
    private TipoClima tipoClima;
    private int temperatura;

    //Properties
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoClima getTipoClima() {
        return tipoClima;
    }

    public void setTipoClima(TipoClima tipoClima) {
        this.tipoClima = tipoClima;
    }


    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}
