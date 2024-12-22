import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("   NUMERO INVERTIDO   ");
        System.out.println("======================");
        System.out.print("informe um numero:");
        int numero = scanner.nextInt();
        String n = String.valueOf(numero);

        System.out.print("numero invertido: ");
        for(int i = n.length()-1; i>= 0; i--)
            System.out.print(n.charAt(i));




        scanner.close();

    }
    
}
