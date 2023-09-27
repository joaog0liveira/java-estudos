import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        byte umByte = 1;
        short doisBytes = 2;
        int quatroBytes = 1800;
        long oitoBytes = 78840000000L;
        double oitoBytesTambem = 1.85;
        char doisBytesTambem = 'J';
        boolean umBytetambem = true;

        String firstName = "João \nGabriel";
        System.out.println(firstName.toUpperCase());
        System.out.println(firstName.toLowerCase());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Seu nome é :" + nome);
    }
}
