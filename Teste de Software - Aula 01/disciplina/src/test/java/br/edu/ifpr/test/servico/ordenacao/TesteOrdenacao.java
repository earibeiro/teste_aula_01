package br.edu.ifpr.test.servico.ordenacao;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import br.edu.ifpr.test.servico.ServicoOrdenacao;

public class TesteOrdenacao {

    @Test
    public void deveOrdenarArrayList(){
    //Estruturas: 
        //DADO - PREPARAR - ARRANGE
        String nomeDoArquivo = "caso1.txt";
        ArrayList<Integer> entradaEsperada = new ArrayList<>();
        entradaEsperada.add(4);
        entradaEsperada.add(9);
        entradaEsperada.add(12);

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nomeDoArquivo);
        assertNotNull(inputStream, "Mensagem de erro personalizada");
        //QUANDO - AGIR - ACT
        ServicoOrdenacao servicoOrdenacao = new ServicoOrdenacao();
        ArrayList<Integer> original = servicoOrdenacao.obterDadosDoArquivo(nomeDoArquivo);
        

        //ENTÃO - VERIFICAR - ASSERT
        assertEquals(entradaEsperada, ordenado);
    }

    @Test
    public void deveCarregarCorretamenteArquivo() throws IOException {
        //Estruturas: 
        //DADO - PREPARAR - ARRANGE
        String nomeDoArquivo = "caso1.txt";
        ArrayList<Integer> entradaEsperada = new ArrayList<>();
        entradaEsperada.add(4);
        entradaEsperada.add(12);
        entradaEsperada.add(9);

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nomeDoArquivo);
        assertNotNull(inputStream, "Mensagem de erro personalizada");
        //QUANDO - AGIR - ACT
        ServicoOrdenacao servicoOrdenacao = new ServicoOrdenacao();
        ArrayList<Integer> original = servicoOrdenacao.obterDadosDoArquivo(nomeDoArquivo);
        System.out.println(original);

        //ENTÃO - VERIFICAR - ASSERT
        assertEquals(servicoOrdenacao, original);
    }

    @Test
    public void deveLerDesordenadosImprimirOrdenados() throws IOException {
        //Estruturas: 
        //DADO - PREPARAR - ARRANGE
        String nomeDoArquivo = "caso1.txt";
        String entradaEsperada = "4, 12, 9";
        String saidaEsperada = "4, 9, 12";

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nomeDoArquivo);
        assertNotNull(inputStream, "Mensagem de erro personalizada");
        //QUANDO - AGIR - ACT
        ServicoOrdenacao servicoOrdenacao = new ServicoOrdenacao();
        ArrayList<Integer> original = servicoOrdenacao.obterDadosDoArquivo(nomeDoArquivo);
        ArrayList<Integer> ordenado = servicoOrdenacao.ordenar(original);

        String entradaGerada = servicoOrdenacao.prepararImpressao(original);
        String saidaGerada = servicoOrdenacao.prepararImpressao(ordenado);
        //ENTÃO - VERIFICAR - ASSERT
    }
}
