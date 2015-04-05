import java.util.Scanner;

public class Unit01 {
    public static void main (String[] args) {

        // Run exercises
        exerciseOne();
        exerciseTwo();
    }

    public static void exerciseOne() {
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[12];
        int greatherValue = 0;
        int greatherValueOrder = 0;
        int number = 0;

        System.out.println("===================================================");
        System.out.println("Exercício 01");
        System.out.println("===================================================");

        for (int i=0; i<numbers.length; i++) {
            System.out.print("Digite um número inteiro: ");
            number = input.nextInt();

            if (i==0 || number > greatherValue) {
                greatherValue = number;
                greatherValueOrder = i + 1;
            }

            numbers[i] = number;
        }

        System.out.println("===================================================");
        System.out.println("Foram lidos " + numbers.length + " números");
        System.out.println("O maior valor lido foi: " + greatherValue);
        System.out.println("O maior valor foi informado ao digitar o " + greatherValueOrder + "º número");
    }

    public static void exerciseTwo() {
        Scanner input = new Scanner(System.in);
        double weights[] = new double[35];
        int ableFighters = 0;
        double sum = 0.0;
        double weight, average;

        System.out.println("===================================================");
        System.out.println("Exercício 02");
        System.out.println("===================================================");

        for (int i=0; i<weights.length; i++) {
            System.out.print("Informe o peso do " + (i + 1) + "º lutador: ");
            weight = input.nextDouble();

            sum += weight;
            weights[i] = weight;
        }

        // average
        average = sum / weights.length;

        for (int i=0; i<weights.length; i++) {
            weight = weights[i];

            if (weight >= average) {
                ableFighters++;
            }
        }

        System.out.println("===================================================");
        System.out.println("Foram lidos os pesos de " + weights.length + " lutadores");
        System.out.println("O peso médio obtido é: " + average);
        System.out.println(ableFighters + " lutadores possuem o peso maior ou igual a média");
    }
}

