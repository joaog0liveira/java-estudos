import java.util.Scanner;

public class Projeto1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Somando com Double");
        System.out.println("Digite o primeiro número: ");
        double primeiroD = ler.nextDouble();
        System.out.println("Digite o segundo número: ");
        double segundoD = ler.nextDouble();
        System.out.println("Soma: " + (primeiroD + segundoD));
    }
}