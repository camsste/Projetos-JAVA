public class Main {
    public static void main(String[] args) {

        int x;
        for(x = 1; x <= 10; x++){
            System.out.println();
            System.out.print("Número: ");
            if(x == 5){
                break;
            }

            for(x = 1; x <= 10; x++){
                System.out.println();
                System.out.print("Número: ");
                if(x == 5){
                    continue;
                }
                System.out.print(x);
            }
        }
    }
}
