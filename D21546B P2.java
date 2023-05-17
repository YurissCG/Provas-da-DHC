//Yuri Camilo Gonçalves
import java.util.Scanner;


public class D21546B {
    public static void main(String[] args) {
        double termos, div=0,den=0,serie=0,total;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        termos = teclado.nextDouble();

        for (int aux = 1; aux <= termos; aux++){

            div = Math.pow( (aux * 9) - 8, (aux * 2) -1 );
            den = Math.pow(10,aux+1);
            serie += div/den;
        }

        total = 7 + Math.cbrt(serie);

        System.out.println("valor da Serie com o número de Termos: "+total);
        teclado.close();
    }
}
