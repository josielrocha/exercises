import java.util.Scanner;

public class Unit01 {
    public static void main (String[] args) {

        // Run exercises
        exerciseOne();
    }

    public static void exerciseOne() {
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[12];
        int greatherValue = 0;
        int greatherValueOrder = 0;
        int number = 0;

        for (int i=0; i<numbers.length; i++) {
            System.out.print("Digite um número inteiro: ");
            number = input.nextInt();

            if (i==0) {
                greatherValue = number;
                greatherValueOrder = i + 1;
            }

            if (number > greatherValue) {
                greatherValue = number;
                greatherValueOrder = i + 1;
            }

            numbers[i] = number;
        }

        System.out.println("===================================================");
        System.out.println("Foram lidos " + numbers.length + " números");
        System.out.println("O maior valor lido foi: " + greatherValue);
        System.out.println("O maior valor foi informado ao digitar o " + greatherValueOrder + "º número");
        System.out.println("===================================================");
    }
}

