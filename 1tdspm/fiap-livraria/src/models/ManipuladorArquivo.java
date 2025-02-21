package models;

import java.io.*;
import java.util.Scanner;

public class ManipuladorArquivo {

    public static void leitor(String path) throws IOException {
        BufferedReader leitura = new BufferedReader(new FileReader(path));
        String linha = "";
        do{
            if(linha != null){
                System.out.println(linha);
            }else{
                break;
            } linha = leitura.readLine();
        }while (true);
        leitura.close();
    }

    public static void escrever(String path) throws IOException {
        BufferedWriter escritor = new BufferedWriter(new BufferedWriter(new FileWriter(path)));
        String linha = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite algo: ");
        linha = scan.nextLine();
        escritor.append(linha + "\n");
        escritor.close();
    }
}
