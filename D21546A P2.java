//Yuri Camilo Gonçalves
import java.util.Scanner;

public class D21546A {
    public static void main(String[] args) {
        double baseMaior, baseMenor, result, cont=0, altura=10,cont2=0,soma=0,media;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da Base Maior: ");
        baseMaior = teclado.nextDouble();
        System.out.print("Digite o valor da Base Menor: ");
        baseMenor = teclado.nextDouble();

        do {
            cont++;
            result = ((baseMaior+ baseMenor) * altura) / 2;

            if (result > 300){
                cont2++;
                soma += result;
            }
            altura++;

        }while (cont != 41);

        media = soma/cont2;

        System.out.println("Valor da Media: "+media);

        teclado.close();
    }
}
