package br.com.metrocamp.example.sergio.tempo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergio on 3/5/18.
 */

public class CidadeServices {



    public List<Clima> getClima() {

        ArrayList<Clima> lista = new ArrayList<Clima>();

        Clima clima = new Clima();

        clima.setNome("Campinas");
        clima.setTipoClima(TipoClima.NUBLADO);
        clima.setTemperatura(32);
        lista.add(clima);

        clima.setNome("Americana");
        clima.setTipoClima(TipoClima.SOL);
        clima.setTemperatura(27);
        lista.add(clima);

        clima.setNome("São Paulo");
        clima.setTipoClima(TipoClima.TEMPESTADE);
        clima.setTemperatura(17);
        lista.add(clima);

        clima.setNome("Sousas");
        clima.setTipoClima(TipoClima.NUBLADO);
        clima.setTemperatura(30);
        lista.add(clima);

        clima.setNome("Hortolância");
        clima.setTipoClima(TipoClima.CHUVOSO);
        clima.setTemperatura(32);
        lista.add(clima);

        clima.setNome("Sorocaba");
        clima.setTipoClima(TipoClima.TEMPESTADE);
        clima.setTemperatura(25);
        lista.add(clima);

        clima.setNome("Santos");
        clima.setTipoClima(TipoClima.SOL);
        clima.setTemperatura(35);
        lista.add(clima);

        clima.setNome("Sumaré");
        clima.setTipoClima(TipoClima.NUBLADO);
        clima.setTemperatura(30);
        lista.add(clima);

        clima.setNome("Amparo");
        clima.setTipoClima(TipoClima.CHUVOSO);
        clima.setTemperatura(20);
        lista.add(clima);

        clima.setNome("Holambra");
        clima.setTipoClima(TipoClima.SOL);
        clima.setTemperatura(31);
        lista.add(clima);

        clima.setNome("Joaquim Egídio");
        clima.setTipoClima(TipoClima.CHUVOSO);
        clima.setTemperatura(29);
        lista.add(clima);

        clima.setNome("Limeira");
        clima.setTipoClima(TipoClima.SOL);
        clima.setTemperatura(27);
        lista.add(clima);

        return lista;

    }

}
