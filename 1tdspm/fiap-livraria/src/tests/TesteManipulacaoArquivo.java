package tests;

import models.ManipuladorArquivo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TesteManipulacaoArquivo {
    public static void main(String[] args) {
        try{
        String path = "D:\\1TDSPM\\Erick\\Aulas-Java-Fiap\\fiap-livraria\\Cupom.txt";
            ManipuladorArquivo.escrever(path);
            ManipuladorArquivo.leitor(path);

        } catch (FileNotFoundException e){
            System.out.println("Arquivo não escontrado");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
