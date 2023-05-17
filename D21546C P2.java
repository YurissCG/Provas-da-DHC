//Yuri Camilo Gonçalves
import java.util.Scanner;

public class D21546C {
    public static void main(String[] args) {
        double  prova1=0, prova2=0, prova3=0, trabalhoFinal=0,notaFinal=0,maior10=0,soma=0,somaT=0,contTrabalho=0,cont=-1,notafinalM=0, mediaF,mediaT;
        String nome="",conceito="", testeTrabalho = "", nomeM="";
        Scanner teclado = new Scanner(System.in);

        do {
            cont++;
            System.out.print("Digite o nome do Aluno: ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")) {
                System.out.print("Digite a nota da prova 1: ");
                prova1 = teclado.nextDouble();
                System.out.print("Digite a nota da prova 2: ");
                prova2 = teclado.nextDouble();
                System.out.print("Digite a nota da prova 3: ");
                prova3 = teclado.nextDouble();
                do {
                    System.out.print("Digite a nota do trabalho: ");
                    trabalhoFinal = teclado.nextDouble();

                    if (trabalhoFinal >= 0 && trabalhoFinal <= 25) {
                        testeTrabalho = "V";
                    } else {
                        testeTrabalho = "F";
                    }

                } while (testeTrabalho == "F");

                teclado.nextLine();

                notaFinal = (prova1 + (prova2 * 2) + (prova3 * 3) + trabalhoFinal) / 7;

                if (notaFinal < 5) {
                    conceito = "D";
                } else if (notaFinal < 10) {
                    conceito = "C";
                } else if (notaFinal < 20) {
                    conceito = "B";
                } else {
                    conceito = "A";
                }

                if (prova1 > 10 && prova2 > 10 && prova3 > 10) {
                    maior10++;
                }

                soma += notaFinal;
                if (trabalhoFinal > 0) {
                    somaT += trabalhoFinal;
                    contTrabalho++;
                }

                if (cont == 0 || notaFinal <= notafinalM) {
                    notafinalM = notaFinal;
                    nomeM = nome;
                }

                System.out.println("Nome do Aluno: " + nome + " Conceito do Aluno: " + conceito);
            }

        }while (!nome.equalsIgnoreCase("X"));

        mediaF = soma / cont;
        mediaT= somaT / contTrabalho;

        System.out.println("\n Quantidade de alunos que tiraram acima de 10 nas 3 provas: "+maior10);
        System.out.println("Media das notas finais: "+mediaF);
        System.out.println("Media das notas dos trabalhos finais que não foram zerados: "+mediaT);
        System.out.println("Nome do menor aluno que tirou a menor nota final: "+nomeM);


        teclado.close();
    }
}
