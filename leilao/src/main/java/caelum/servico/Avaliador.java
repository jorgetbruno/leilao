package caelum.servico;

import caelum.leilao.dominio.Lance;
import caelum.leilao.dominio.Leilao;

/**
 * Created by aluno on 27/09/17.
 */
public class Avaliador {
    private double maiorDeTodos = Double.NEGATIVE_INFINITY;
    private double menorDeTodos = Double.POSITIVE_INFINITY;

    public void avaia(Leilao leilao){
        for(Lance lance : leilao.getLances()){
            if(lance.getValor() > maiorDeTodos){
                maiorDeTodos = lance.getValor();
            }
            if(lance.getValor() < menorDeTodos){
                menorDeTodos = lance.getValor();
            }
        }
    }

    public double getMaiorDeTodos() {
        return maiorDeTodos;
    }

    public double getMenorDeTodos() {
        return menorDeTodos;
    }
}
