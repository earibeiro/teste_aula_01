package br.edu.ifpr.test.servico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ServicoOrdenacao {

    public ArrayList<Integer> obterDadosDoArquivo(String nomeDoArquivo) throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nomeDoArquivo);
        ArrayList<Integer> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))){
            String primeiraLinha = reader.readLine();
            int n = Integer.parseInt(primeiraLinha);
            for (int i = 0; i < n; i++){
                String linha = reader.readLine();
                int numero = Integer.parseInt linha;
                lista.add numero;
            }
        } catch (Exception e) {

        }
        return null;
    }

}

    public ArrayList<Integer> ordenar(ArrayList<Integer> original) {
        ArrayList<Integer> ordenado = new ArrayList<>(original);
        Collections.sort(ordenado);

        return ordenado;
    }
