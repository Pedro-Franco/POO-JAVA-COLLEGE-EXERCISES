import java.util.Scanner;

public class Questao16 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);



        //dados do curso
        System.out.println("Digite o nome do seu curso");
        String nomecurso = ler.nextLine();



        //entrada de dados número de alunos
        int num_aluno;
        System.out.println("As notas de quantos alunos seráo obtidas?");
        num_aluno = ler.nextInt();
        System.out.println("\n==================================\n");



        //funções
        double[] notas = new double[num_aluno];
        double media = 7, mediaturma;



        //entrada de dados de notas da turma
        for (int i = 0; i < num_aluno; i++){
            System.out.println("notas do " + (i+1) + "° aluno");
            notas[i] = ler.nextDouble();
        }
        System.out.println("\n==================================\n");



        //média da turma
        mediaturma = (notas[0] + notas[1] + notas[2] + notas[3] + notas[4]) / 5;
        System.out.println("Nome do curso: " + (nomecurso.toUpperCase()));
        System.out.println("Média de notas da turma: " + mediaturma);
        System.out.println("\n==================================\n");



        //notas acima da Média
        System.out.println("Nome do curso: " + (nomecurso.charAt(2)));
        for (int i = 0; i < num_aluno; i++){
            if (notas[i] >= media){
                System.out.println("O " + (i+1) + "° aluno tem nota " + notas[i]);
            }
        }
    } 
}
