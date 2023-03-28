import javax.swing.JOptionPane;
public class D21546B {
    public static void main(String[] args) {
       String lado1Str, lado2Str, lado3Str;
       double lado1, lado2, lado3;

        lado1Str = JOptionPane.showInputDialog(null,
                "Dite o valor do Lado 1 do triãngulo: ",
                "Classificação do triangulo",
                JOptionPane.QUESTION_MESSAGE);

        lado2Str = JOptionPane.showInputDialog(null,
                "Dite o valor do Lado 2 do triãngulo: ",
                "Classificação do triangulo",
                JOptionPane.QUESTION_MESSAGE);

        lado3Str = JOptionPane.showInputDialog(null,
                "Dite o valor do Lado 3 do triãngulo: ",
                "Classificação do triangulo",
                JOptionPane.QUESTION_MESSAGE);

        lado1 = Double.valueOf(lado1Str);
        lado2 = Double.valueOf(lado2Str);
        lado3 = Double.valueOf(lado3Str);



        if (lado1 == lado2 && lado2 == lado3){
          JOptionPane.showMessageDialog(null,
                  "Seu Triângulo é Equilátero ");
        }else
            if (lado1 == lado2 || lado2 == lado3){
                JOptionPane.showMessageDialog(null,
                        "Seu Triângulo é Isóscele ");
            } else
                if (lado1 == lado3){
                    JOptionPane.showMessageDialog(null,
                            "Seu Triângulo é Isóscele ");
                }else {
                    JOptionPane.showMessageDialog(null,
                            "Seu Triângulo é Escaleno ");
                }


    }
}
