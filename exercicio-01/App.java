import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("oi");


        System.out.println("=====================");
        System.out.println("C A L C U L A D O R A");
        System.out.println("=====================");

        System.out.print("informe dois numeros:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("informe a operação desejada: ");
        String operacao = scanner.next();
        System.out.print("Resultado de "+ a+ " " + operacao + " "+ b+ " = ");

        switch (operacao) {
            case "+":
                System.out.println(a+b);
                break;
        
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if(b == 0){
                    System.out.println("impossivel fazer uma divisão por zero");
                } else{
                    System.out.println((double)a/b);
                }
                break;
            default:
                System.out.println("informe um operador valido!");
                break;
        }


        scanner.close();

    }
}