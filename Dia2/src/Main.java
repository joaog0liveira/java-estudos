import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] valores = {10, 20 , 15 ,30 ,40};

        Arrays.sort(valores); // ordena os valores

        System.out.println(Arrays.toString(valores));

        System.out.println(valores.length);


        // arrays string
        String [] cars = {"BMW", "TESLA", "Jeep", "Fiat"};

        cars[2] = "Ferrari";

        System.out.println(Arrays.toString(cars));

        System.out.println(cars[2]);

        String [][] cars2 = {{"FIAT", "PORSCHE"}, {"MCLAREN", "FERRARI"}};

        System.out.println(Arrays.deepToString(cars2));

        // constantes

        final double taxaJuros = 11.92; // não consigo alterar uma constantes
        // taxajuros = 10;
        System.out.println(taxaJuros);

        // operadores

        int a = 4 / 3; // retorna um pq é interger
        double b = 4 / 3; //retorna 1.0 pq acha que os valores é interger ainda

        double c = (double)4 / (double)3; // cast para double
        System.out.println(c);

        // incrementos

        int d = 0;
        d++;
        System.out.println(d);
        d--;
        System.out.println(d);

        // converter string em valor

        String valorProduto = "10";
        // int valortotal = valorProduto + 2; não pode converter isso aqui de string para ingerter
        int valorTotal = Integer.parseInt(valorProduto) + 2;
        System.out.println(valorTotal);

        // classe MATH

        double value = Math.round(10.2); // arredondar para 10
        double value2 = Math.ceil(10.2); // arredonda sempra para cima
        double value3 = Math.floor(10.2);// sempre para baixo
        System.out.println(value);


        double value4 = Math.random() * 100; // resultados multiplacados por 100;
        // Math.round(Math.random() * 100); arredondo o random

        //(int)Math.round(Math.random() * 100) // cast para tirar o valor do double

        System.out.println(value4);
    }
}