import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // formatar números em java

        //converter um valor para dolar
        NumberFormat pound = NumberFormat.getCurrencyInstance(); // ele pega o a moeda que é default na minha maquina
        String productValue = pound.format(120.80);
        System.out.println(productValue);

        // Operadores de comparação

        int a = 4;
        int b = 5;
        System.out.println(a == b); // se são iguais
        System.out.println(a != b); // se são diferentes
        System.out.println(a >= b); // se um é maior e igual ou menor e igual que outro

        // operador AND

        int priceProduct = 20;

        boolean buy = priceProduct >= 10 && priceProduct <= 15;
        System.out.println(buy);

        // operador OR

        boolean temEmprego = false;
        boolean temEmpresa = true;
        boolean tem50k = true;
        boolean podeFinanciar = (temEmprego || temEmpresa) && tem50k;
        System.out.println(podeFinanciar);

        // if e else

        int valorCarro = 100_001;

        if (valorCarro > 100_000)
            System.out.println("Não Comprar. Acima da tabela!");
        else if (valorCarro >= 90_000 && valorCarro <=100_00)
            System.out.println("Comprar o carro");
        else
            System.out.println("Não comprar. valor abaixo da tabela");

        // operador ternário
        int ingresso = 400;
        String terAcesso = ingresso >= 500 ? "VIP" : "Pista"; // isso aqui é o operador ternario
        // é a mesma solução de baixo

//
//        if (ingresso >=500)
//            terAcesso = "VIP";
//        else
//            terAcesso = "PISTA";
        System.out.println(terAcesso);
    }
}