import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //scanner.useLocale(Locale.US);

        double c, k, f, re, ra;

        //Coloque para perguntar qual a temperatura em Celsius
        System.out.print("Coloque a temperatura em Celsius: ");
        c = scanner.nextDouble(); //Aqui o usuário possa escolher o número
        k = c + 273.15;
        re = c * 0.8;
        ra = c * 1.8 + 32 + 459.67;
        f = c + 1.8 + 32;

        System.out.printf("A temperatura em Kelvin (K) é : %.2f %n", k); //Aqui imprima 2 casas decimais
        System.out.printf("A temperatura em Réaumur (Re) é : %.3f %n", re); //Aqui imprima 3 casas decimais
        System.out.printf("A temperatura em Rankine (Ra) é : %.4f %n", ra); //Aqui imprima 4 casas decimais
        System.out.printf("A temperatura em Fahrenheit (F) é : %.5f %n", f); //Aqui imprima 5 casas decimais
    }
}
