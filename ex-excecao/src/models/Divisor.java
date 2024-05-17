package models;

public class Divisor {

    //Atributos
    private int num1;
    private int num2;

    //Getters e Setters
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //Métodos
    public void calcular(){
        double resultado = num1/num2;
        System.out.println("Resultado: " + resultado);
    }
}
