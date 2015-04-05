public class AppExercises {
    public static void main (String[] args) {
        // Run exercises
        exerciseOne();
        exerciseTwo(); 
    }

    public static void exerciseOne() {

        System.out.println("====================================");
        System.out.println("Exercício 01");
        System.out.println("====================================");

        Aluno aluno = new Aluno();
        aluno.setNome("Josiel de Carvalho Rocha");
        aluno.setAltura(1.83);
        aluno.setPeso(83);
        aluno.setSexo('M');
        aluno.setAnoNascimento(1987);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Sexo: " + aluno.getSexo());
        System.out.println("IMC: " + aluno.getImc());
        System.out.println("Situação (IMC): " + aluno.getSituacao());
        System.out.println();
    }

    public static void exerciseTwo() {

        Bhaskara equacao1 = new Bhaskara(0, 2, 3);
        Bhaskara equacao2 = new Bhaskara(1, -8, 7);
        Bhaskara equacao3 = new Bhaskara(1, 2, 3);
        Bhaskara equacao4 = new Bhaskara(2, 4, 2);

        System.out.println("====================================");
        System.out.println("Exercício 02");
        System.out.println("====================================");

        equacao1.print();
        equacao2.print();
        equacao3.print();
        equacao4.print();
    }
}

