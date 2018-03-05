package br.com.metrocamp.example.sergio.tempo.model;

/**
 * Created by Sergio on 3/5/18.
 */

public class Cidade {

    //Attributes
    private String nome;
    private Clima clima;
    private int temperatura;

    //Properties
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Clima getClima() {
        return clima;
    }

    public void setClima(Clima clima) {
        this.clima = clima;
    }


    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}
