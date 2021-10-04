import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        double soma, sub, mult, div, dobro;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de X e Y");
        double x = ler.nextDouble();
        double y = ler.nextDouble();
        soma = x + y;
        System.out.println("Soma " + soma);
        sub = x - y;
        System.out.println("Subtração " + sub);
        mult = x * y;
        System.out.println("Produto " + mult);
        div = x / y;
        System.out.println("Divisão " + div);
        dobro = 2 * y;
        System.out.println("\n------------------------------------------------------------\n");

        if((x+y) >= (2*y)){
            System.out.println(soma);
            System.out.println(dobro);
            System.out.println("X é maior ou igual a y");
        }
        else{
            System.out.println(soma);
            System.out.println(dobro);
            System.out.println("X não e maior, nem igual a y");
        }
    }
}