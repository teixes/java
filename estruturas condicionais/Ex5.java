import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        Double n1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        Double n2 = scanner.nextDouble();
        
        System.out.println("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        Double resultado; 
        
        switch(operacao) {
            case '+':
                resultado = n1 + n2;
                System.out.println("O resultado é: " + resultado);
                break;
            case '-':
                resultado = n1 - n2;
                System.out.println("O resultado é: " + resultado);
                break;
            case '*':
                resultado = n1 * n2;
                System.out.println("O resultado é: " + resultado);
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("Não é possível dividir por zero");
                } else {
                    resultado = n1 / n2;
                    System.out.println("O resultado é: " + resultado);
                }
                break;
        }
        
        scanner.close();
    }
}