import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro e notas dos alunos
        for (int i = 1; i <= 3; i++) {
            System.out.println("Vamos cadastrar o aluno " + i + "!");

            String nome = cadastrarAluno(scanner, i);
            String email = cadastrarEmail(scanner, i);
            int nota1 = obterNota(scanner, nome, 1);
            int nota2 = obterNota(scanner, nome, 2);
            int nota3 = obterNota(scanner, nome, 3);

            System.out.println("----------------------------------");

            // Exibir todas as informações do aluno
            System.out.println("Resultados para o aluno " + i + ":");
            System.out.println("Nome: " + nome);
            System.out.println("Email: " + email);
            System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
            double media = calcularMedia(nota1, nota2, nota3);
            System.out.println("Média: " + String.format("%.2f", media));

            // Verificar o status do aluno
            verificarStatus(nome, media);

            System.out.println("----------------------------------");
        }

        // Fechar o Scanner ao final do método main
        scanner.close();
    }

    private static String cadastrarAluno(Scanner scanner, int numeroAluno) {
        System.out.println("Qual o nome do aluno " + numeroAluno + "?");
        return scanner.next();
    }

    private static String cadastrarEmail(Scanner scanner, int numeroAluno) {
        System.out.println("E qual o email do aluno " + numeroAluno + "?");
        return scanner.next();
    }

    private static int obterNota(Scanner scanner, String alunoNome, int numeroNota) {
        System.out.print("Coloque a nota " + numeroNota + " do aluno " + alunoNome + ": ");
        return scanner.nextInt();
    }

    private static double calcularMedia(int nota1, int nota2, int nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    private static void verificarStatus(String alunoNome, double media) {
        if ((media >= 0.0) && (media <= 10.0)) {
            if (media >= 7.0) {
                System.out.println("Parabéns, " + alunoNome + ", você passou direto. Por acaso você programa em Java?");
            } else if (media >= 5.0) {
                System.out.println("Infelizmente, " + alunoNome + ", você vai ter que fazer recuperação.");
            } else {
                System.out.println("Você foi reprovado, " + alunoNome + ". Ainda bem que é só simulação, hein?");
            }
        } else {
            System.out.println("Nota inválida para o aluno " + alunoNome + ". Fechando aplicativo.");
        }
    }
}
