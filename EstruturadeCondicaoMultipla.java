import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número de um digito: ");
        int x = scanner.nextInt();

        switch (x){
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            default:
                System.out.println("Desconhecido");
                break;
        }

        scanner.close();
    }
}
