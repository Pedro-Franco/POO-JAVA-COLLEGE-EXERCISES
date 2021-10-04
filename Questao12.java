import java.util.Scanner;

public class Questao12 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um caractere para a operação de soma ");
        String op = ler.next();
        System.out.println("Digite agora dois valores inteiros para somar ");
        int a = ler.nextInt();
        int b = ler.nextInt();
        int resultado = a + b;
        System.out.println(a + op + b + " = "+ resultado);
    }

}
