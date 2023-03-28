import java.util.Scanner;
public class D21546A {
    public static void main(String[] args) {
    double valorp, valorq, funcaopq, parte1, parte2, parte3;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de P: ");
        valorp = teclado.nextDouble();

        System.out.print("Digite o valor de Q: ");
        valorq = teclado.nextDouble();


        parte2 = Math.sqrt( ((Math.pow( valorq + 1.0, 2 )) / 4.0) + ((Math.pow( valorp + 1.0, 3 ))/27.0)  );
        parte1 = Math.cbrt( (-valorq/2.0) + parte2  );
        parte3 = Math.sqrt(valorq / valorp);

        funcaopq = parte1 + parte3 + 100 ;


        System.out.println("Valro da F(p,q) = " + funcaopq);
        teclado.close();

    }
}
