import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       

        Scanner scanner = new Scanner(System.in);
        System.out.print("digite uma palavra: ");
        String palavra = scanner.nextLine();

        int cont = 0;
        for(char letra: palavra.toCharArray()){
            if(letra == ' '){
                cont += 1;
            }
        }
        cont += 1;

        String palavras = (cont > 1)? "palavras": "palavra";

        System.out.printf("a frase possui %d %s", cont, palavras);

        scanner.close();


    }
    
}
