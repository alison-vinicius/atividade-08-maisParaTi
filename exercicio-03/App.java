import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      SEQUENCIA FIBONACCI       ");
        System.out.println("================================");
        System.out.print("informe a quantidade de numeros para exibir da sequencia fibonacci:");
        int n = scanner.nextInt();

        System.out.println("------------------------------");

        if(n == 1){
            System.out.print("1");
        } else if(n==2){
            System.out.print("1 - 1");
        } else{
            int ant = 1;
            int prox = 1;
            int aux;
            System.out.print(ant + " - " + prox +" -");
            for(int i = 1; i <=n - 2; i++){
                System.out.print(ant+prox);
                System.out.print(" - ");
                aux = prox;
                prox = ant + prox;
                ant = aux;
                
            }
        }
        scanner.close();
    }
    
}
