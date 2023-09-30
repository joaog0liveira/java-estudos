import java.util.Scanner;

public class Projeto3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = ler.nextInt();

        if (numero < 9 && numero >= 1) {
            System.out.println("Um digito!");
        }
        else if (numero < 100 && numero >=10) {
                System.out.println("Dois digitos");
            }
        else if (numero < 1000 && numero >= 100) {
                System.out.println("Três digitos");
            }
        else if (numero <10000 && numero >= 1000) {
                System.out.println("Quatro digitos");
            }
        else
                System.out.println("Cinco digitos ou mais!");

    }
}

