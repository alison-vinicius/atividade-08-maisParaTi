import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("  VERIFICADOR DE PALINDROME  ");
        System.out.println("=============================");
        System.out.print("informe uma palavra: ");
        String palavra = scanner.nextLine();

        boolean palindorme = true;
        for(int i = 0; i <= palavra.length()/2;i++){
            if(palavra.charAt(i) != palavra.charAt(palavra.length()-i-1)){
                palindorme = false;
            }
        }

        if(palindorme){
            System.out.println(palavra + " eh palindrome");
        } else{
            System.out.println(palavra + " nao eh palindrome");
        }


        scanner.close();

    
    }
    
}
