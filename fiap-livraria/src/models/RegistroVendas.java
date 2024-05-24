package models;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroVendas {

    private List<Exemplar> lista = new ArrayList<>();
    private double total;
    //Polimorfismo
    public void adicionar(Exemplar item){
        System.out.println("Item adicionado " + item.getTitulo());
        total += item.getPreco();
        lista.add(item);
    }

    public void exibir(){
        System.out.println("-------------------------------------------------------");
        System.out.println("  ITENS COMPRADOS   ");
        System.out.println("Título adquirido    - Preço");
        lista.forEach(e ->
                System.out.println(e.getTitulo() + " -    " + e.getPreco()));
        System.out.println("-------------------------------------------------------" +
                "\nValor total da sua compra: R$ " + total);
    }

    public void imprimirCupons(String path) throws IOException {
        BufferedWriter escritor = new BufferedWriter(new BufferedWriter(new FileWriter(path)));
        try {
            escritor.append("CUPOM FISCAL");
            escritor.append("\n-------------------------------------------------------");
            escritor.append("\n  ITENS COMPRADOS   ");
            lista.forEach(e ->{
                try {
                    escritor.append("\n" + e.getTitulo() + " -    " + e.getPreco());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
            escritor.append("\n-------------------------------------------------------" +
                    "\nValor total da sua compra: R$ " + total);
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            escritor.close();
        }
    }

    public void teste(){

        for(Exemplar e : lista){
            System.out.println(e.getTitulo());
        }
    }
}
