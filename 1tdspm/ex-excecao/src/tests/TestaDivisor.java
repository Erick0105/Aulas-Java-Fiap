package tests;

import models.Divisor;

public class TestaDivisor {
    public static void main(String[] args) {
        Divisor d = new Divisor();

        try {
            d.setNum1(10);
            d.setNum2(0);
            d.calcular();
        }catch (ArithmeticException e){
            System.out.println("Operação Invalida! | Não existe divisão por 0");
        }
    }
}
