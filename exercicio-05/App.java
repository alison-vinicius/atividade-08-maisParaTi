import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("VERIFICADOR DE ANAGRAMAS");
        System.out.println("======================");
        System.out.print("digite duas palavras: ");
        String a = scanner.next();
        String b = scanner.next();

        boolean anagrama = true;
        int letras = 0;

        for(char letraA: a.toCharArray()){
            letras = 0;
            for(char letraB: b.toCharArray()){
                if(letraA ==letraB){
                    letras += 1;
                }
            }

            if(letras == 0){
                anagrama = false;
                break;
            }
        }

        if(anagrama){
            System.out.println("As palavras sao anagramas");
        } else{
            System.out.println("As palavras nao sao anagramas");
        }


        scanner.close();
    }
    
}
