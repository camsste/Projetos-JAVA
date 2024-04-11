import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.print("Digite um valor: ");
        x = scanner.nextInt();
        if(x > 0){
            System.out.println("O número é positivo!");
        } else if (x == 0) {
            System.out.println("O número é neutro!");
        } else {
            System.out.println("O número é negativo!");
        }
    }
}
