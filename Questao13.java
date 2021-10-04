import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int N_aluno = 5;
        double[] nota = new double[N_aluno];
        double media;

        //entrada de dados das notas.
        for (int i = 0; i < N_aluno; i++) {
            System.out.println("Nota do " + (i+1) + "° Aluno");
            nota[i] = ler.nextDouble();
        }

        System.out.println("\n----------------------------------------------\n");

        //mostrando as notas
        for (int i = 0; i < N_aluno; i++) {
            System.out.println("Nota do " + (i+1) + "° Aluno: " + nota[i]);
        }

        media = (nota[0] + nota[1] + nota[2] + nota[3] + nota[4]) / 5;

        System.out.println("\n----------------------------------------------\n");

        //media das notas da turma
        System.out.println("MEDIA DE NOTAS DA TURMA: ");
        System.out.println(media);
    }

}
