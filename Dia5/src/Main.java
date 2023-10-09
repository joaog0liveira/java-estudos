public class Main {
    public static void main(String[] args) {
        productList("McLaren", 250.000000);
        productList("Ferrari", 500.000000);

        evenNumbers(20);
    }
    public static void productList(String productName, double productValue) {
        System.out.println(productName + " - " + productValue);
    }

    public static void evenNumbers(int numbers) {
        for (int i = 0; i <= numbers; i++)
            if (i % 2 == 0)
                System.out.println(i + " ");
    }
}