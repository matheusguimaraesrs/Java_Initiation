package Condicionais;

public class Ternario {
    public static void main(String[] args) {
        int age = 19;
        //Funciona como um if else, porém mais simplificado, deixando o código mais limpo.
        //Deve ser usado com cuidado, somente em condições simples de true ou false.
        String result = (age >= 18) ? "Pode tirar CNH" : "Não pode tirar CNH";
        System.out.println(result);
    }
}
