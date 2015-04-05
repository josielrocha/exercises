import java.util.Scanner;

public class Unit02 {
    public static void main(String[] args) {
        // Run exercises
        exerciseOne();
        exerciseTwo();
    }

    public static void exerciseOne() {
        String[] rowCities = {"Cidade 01", "Cidade 02", "Cidade 03", "Cidade 04"};
        String[] colCities = {"Cidade 05", "Cidade 06", "Cidade 07"};
        double[][] distances = new double[rowCities.length][colCities.length];
        Scanner input = new Scanner(System.in);

        for(int i=0; i<distances.length; i++) {
            for (int j=0; j<distances[0].length; j++) {
                System.out.print("Distância entre " + rowCities[i] + " e " + colCities[j] + ": ");
                distances[i][j] = input.nextDouble();
            }
        }

        // Exibindo os dados
        System.out.println("=============================================");
        System.out.println("Exercício 01");
        System.out.println("=============================================");

        System.out.print("\t\t");
        for (int i=0; i<colCities.length; i++) {
            System.out.print(colCities[i] + "\t");
        }
        System.out.println();

        for (int i=0; i<distances.length; i++) {
            System.out.print(rowCities[i]);

            for (int j=0; j<distances[0].length; j++) {
                System.out.print("\t\t" + distances[i][j]);
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void exerciseTwo() {
        String[] rowCities = {"Cidade 01", "Cidade 02", "Cidade 03", "Cidade 04"};
        String[] colCities = {"Cidade 05", "Cidade 06", "Cidade 07"};
        double[][] distances = new double[rowCities.length][colCities.length];
        Scanner input = new Scanner(System.in);
        double distance;
        double greatherDistance = 0;
        String greatherDistanceCity01 = "";
        String greatherDistanceCity02 = "";

        for(int i=0; i<distances.length; i++) {
            for (int j=0; j<distances[0].length; j++) {
                System.out.print("Distância entre " + rowCities[i] + " e " + colCities[j] + ": ");
                distances[i][j] = input.nextDouble();
            }
        }

        // Exibindo os dados
        System.out.print("\t\t");
        for (int i=0; i<colCities.length; i++) {
            System.out.print(colCities[i] + "\t");
        }
        System.out.println();

        for (int i=0; i<distances.length; i++) {
            System.out.print(rowCities[i]);

            for (int j=0; j<distances[0].length; j++) {
                System.out.print("\t\t" + distances[i][j]);
            }

            System.out.println();
        }

        // Encontrar a maior distância e exibir o resultado
        for(int i=0; i<distances.length; i++) {
            for (int j=0; j<distances[0].length; j++) {
                distance = distances[i][j];

                if ((i==0 && j==0) || distance > greatherDistance) {
                    greatherDistance = distance;
                    greatherDistanceCity01 = rowCities[i];
                    greatherDistanceCity02 = colCities[j];
                }
            }
        }

        System.out.println("=============================================");
        System.out.println("Exercício 02");
        System.out.println("=============================================");

        System.out.println("A maior distância informada é: " + greatherDistance
            + ". A mesma fica entre " + greatherDistanceCity01 + " e "
            + greatherDistanceCity02);

        System.out.println();
    }
}

