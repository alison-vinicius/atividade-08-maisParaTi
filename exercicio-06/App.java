import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===============================");
        System.out.println("   J O G O   DO  A D V I N H A");
        System.out.println("===============================");

        int advinha = 20;
        while (true) {
            System.out.print("digite um numero: ");
            int n = scanner.nextInt();
            if(n == advinha){
                break;
            } else{
                System.out.println("palpite errado. digite novamente");
            }
            
        }

        System.out.println("parabens, voce acertou");
        



        scanner.close();
    }
}
