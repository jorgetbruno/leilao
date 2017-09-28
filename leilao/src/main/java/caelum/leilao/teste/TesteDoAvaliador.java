package caelum.leilao.teste;

import caelum.leilao.dominio.Lance;
import caelum.leilao.dominio.Leilao;
import caelum.leilao.dominio.Usuario;
import caelum.servico.Avaliador;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by aluno on 27/09/17.
 */
public class TesteDoAvaliador {
    @Test
    public void deveEntenderLancesEmOrdemCrescente (){
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Xbx One usado");

        leilao.propoe(new Lance(joao, 250.00));
        leilao.propoe(new Lance(jose, 300.00));
        leilao.propoe(new Lance(maria, 400.00));

        Avaliador leioeiro = new Avaliador();

        leioeiro.avaia(leilao);

        double maiorEsperado = 400;
        double menorEsperado = 250;

        //Assert.assertEquals();
        Assert.assertEquals(maiorEsperado, leioeiro.getMaiorDeTodos(), 0.00001);
        Assert.assertEquals(menorEsperado,leioeiro.getMenorDeTodos(),0.00001);

    }
}
