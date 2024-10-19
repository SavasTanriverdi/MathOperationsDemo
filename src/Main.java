public class Main {
    public static void main(String[] args) {
        // Temel aritmetik operatörler
        int num1 = 10;
        int num2 = 5;

        System.out.println("Sayı 1: " + num1);
        System.out.println("Sayı 2: " + num2);

        // Toplama
        int sum = num1 + num2;
        System.out.println("Toplama: " + num1 + " + " + num2 + " = " + sum);

        // Çıkarma
        int difference = num1 - num2;
        System.out.println("Çıkarma: " + num1 + " - " + num2 + " = " + difference);

        // Çarpma
        int product = num1 * num2;
        System.out.println("Çarpma: " + num1 + " * " + num2 + " = " + product);

        // Bölme
        int quotient = num1 / num2;
        System.out.println("Bölme: " + num1 + " / " + num2 + " = " + quotient);

        // Modulus (kalan bulma)
        int remainder = num1 % num2;
        System.out.println("Modulus: " + num1 + " % " + num2 + " = " + remainder);

        // Artırma operatörü (increment)
        int a = 10;
        System.out.println("\nBaşlangıç değeri: " + a);

        // Pre-increment (++a)
        System.out.println("Pre-increment (++a): " + (++a)); // Önce artırır, sonra değeri kullanır

        // Post-increment (a++)
        System.out.println("Post-increment (a++): " + (a++)); // Önce değeri kullanır, sonra artırır
        System.out.println("Post-increment sonrası değer: " + a);

        // Azaltma operatörü (decrement)
        int b = 10;
        System.out.println("\nBaşlangıç değeri: " + b);

        // Pre-decrement (--b)
        System.out.println("Pre-decrement (--b): " + (--b)); // Önce azaltır, sonra değeri kullanır

        // Post-decrement (b--)
        System.out.println("Post-decrement (b--): " + (b--)); // Önce değeri kullanır, sonra azaltır
        System.out.println("Post-decrement sonrası değer: " + b);
    }
}