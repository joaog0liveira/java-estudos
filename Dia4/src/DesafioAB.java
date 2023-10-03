public class DesafioAB {
    public static void main(String[] args) {

        // Desafio A - pares
        for (int i = 0; i <=100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        //Desafio A2 - impares
//        for (int i = 0; i <=100; i++) {
//            if (i % 2 != 0)
//                System.out.print(i + " ");
//        }

        // Desafio B

        String space = "Hellow World";

        for (int i = 0; i <= space.length() - 1; i++) {
            System.out.print(space.charAt(i) + " ");
        }


    }
}
