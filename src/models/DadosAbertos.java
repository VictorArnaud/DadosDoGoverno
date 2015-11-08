
package models;

import edu.unb.fga.dadosabertos.Deputado;
import java.util.List;

public class DadosAbertos {

    public static List<Deputado> deputados;
    public static ModeloTabela tabelaDeputados;
    public static ModeloTabela tabelaPartidos;

    public DadosAbertos(){
        
    }

    public static ModeloTabela getTabelaDeputados() {
        return tabelaDeputados;
    }

    public static void setTabelaDeputados(ModeloTabela tabelaDeputados) {
        DadosAbertos.tabelaDeputados = tabelaDeputados;
    }

    public static ModeloTabela getTabelaPartidos() {
        return tabelaPartidos;
    }

    public static void setTabelaPartidos(ModeloTabela tabelaPartidos) {
        DadosAbertos.tabelaPartidos = tabelaPartidos;
    }


    public static List<Deputado> getDeputados() {
        return deputados;
    }

    public static void setDeputados(List<Deputado> deputados) {
        DadosAbertos.deputados = deputados;
    }
}