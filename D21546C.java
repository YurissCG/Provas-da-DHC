import java.util.Scanner;
public class D21546C {
    public static void main(String[] args) {
        double valorIpva, anofabricacao, finalIpva, descontoIpva, descontocombustivel;
        String combustivel;
        int placa, finalPlaca, dia, mes, ano;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a placa do seu carro: ");
        placa = teclado.nextInt();

        System.out.print("Digite o valor do IPVA: ");
        valorIpva = teclado.nextDouble();

        teclado.nextLine();

        System.out.print("Qual o tipo de combustivel: ");
        combustivel = teclado.nextLine();

        System.out.print("Digite o ano de Fabricação do Veículo: ");
        anofabricacao = teclado.nextDouble();

        finalPlaca = placa % 10;
        descontoIpva = 0;
        dia = 0;
        mes = 01;
        ano = 2023;

        if (anofabricacao < 1960){
            finalIpva = 0;
        }else
            if (anofabricacao <= 1970){
                descontoIpva = 50/100f;
            }else
                if (anofabricacao < 1980){
                    descontoIpva = 20/100f;
                }else {
                    descontoIpva = 1;
                }


       switch (finalPlaca){
           case 0: case 1:
               dia = 15;
               break;

           case 2: case 3:
               dia = 17;
               break;

           case 4: case 5:
               dia = 19;
               break;

           case 6: case 7:
               dia = 21;
               break;

           case 8: case 9:
               dia = 23;
               break;

           default:
               System.out.println("final de placa não existe");
       }



         if (combustivel.equalsIgnoreCase("Alcool")){
             descontocombustivel = 5/100f;
         }else {
             descontocombustivel = 1;
         }



        finalIpva = valorIpva * descontocombustivel * descontoIpva;

        System.out.printf("IPVA a pagar = R$%.2f,", finalIpva);
        System.out.println(" Data do pagamento = " + dia + "/" + mes + "/" + ano);
        teclado.close();
    }
}
