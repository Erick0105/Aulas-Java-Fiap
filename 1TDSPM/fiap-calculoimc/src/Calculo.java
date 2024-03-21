public class Calculo {

    //Atributos
    public double peso;
    public double altura;

    //Método construtor
    public Calculo(double peso, double altura){
        this.peso = peso;
        this.altura = altura;

        //double x = Math.pow(3,2) 3²;
    }

    //Métodos
    public double calcularImc(){
        return this.peso /Math.pow(this.altura,2);
    }
    public String exibirMensagem(){
        String mensagem;
        if (this.calcularImc() <= 18.5)
            mensagem = "Seu IMC é de " + calcularImc() + "e você está abaixo do peso.";
        else if (this.calcularImc() < 24.9 && this.calcularImc() >= 18.6)
            mensagem = "Seu IMC é de " + calcularImc() + "e você está no Peso ideal(parabéns)";
        else if (this.calcularImc() < 29.9 && this.calcularImc() >= 25)
            mensagem = "Seu IMC é de " + calcularImc() + "e você está levemente acima do peso";
        else if (this.calcularImc() < 34.9 && this.calcularImc() >= 30)
            mensagem = "Seu IMC é de " + calcularImc() + "e você está em obesidade grau 1";
        else if (this.calcularImc() < 39.9 && this.calcularImc() >= 35)
            mensagem = "Seu IMC é de " + calcularImc() + "e você está em obesidade grau 2";
        else
            mensagem = "Seu IMC é de " + calcularImc() + "e você está em obesidade grau 3";
        return mensagem;
    }
    public double pesoIdeal(String sexo){
        if (sexo.equalsIgnoreCase("Masculino"))
            return 52 + (0.75 * (this.altura - 152.4));
        else
            return 52  + (0.67 * (this.altura - 152.4));
    }
}
