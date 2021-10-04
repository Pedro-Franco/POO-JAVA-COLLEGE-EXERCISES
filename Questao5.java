import java.util.Scanner;
public class Questao5 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros");
        int n1 = ler.nextInt();
        int n2 = ler.nextInt();
        int resultado = n1 % n2;
        System.out.println("Resulado " + resultado);

        if(resultado == 0) {
            System.out.println("Numero nulo");
        }
        else {
            System.out.println("Numero nao nulo");
        }

    }
    
}
