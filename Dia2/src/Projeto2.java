import java.util.Arrays;

public class Projeto2 {
    public static void main(String[] args) {
        int [] my_array1 = {
                1789, 2036, 1899, 1456, 2013,
                1458, 2458, 1245, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String [] my_array2 = {
          "Java",
          "Python",
          "PHP",
          "C#",
          "C Programming",
          "C++"
        };

        // imprimir na tela array original
        // array ordenada

        System.out.println(Arrays.toString(my_array1));
        System.out.println(Arrays.toString(my_array2));
        System.out.println();
        Arrays.sort(my_array1);
        System.out.println(Arrays.toString(my_array1));
        Arrays.sort(my_array2);
        System.out.println(Arrays.toString(my_array2));
    }
}
