public class CalculadoraDeLivroFor {
    public static void main(String[] args) {

        double soma = 0;
        //for (double i = 0; i < 35; i ++){
        //            soma += 59.90;
        for (int contador = 0; contador < 35; contador ++){
            soma += 59.90;

            System.out.println("A soma do estoque é:"+soma);
            if (soma < 35) {
                System.out.println("Estoque está abaixo da média. Verifique!");
            }else if (soma >= 2000) {
                System.out.println("Estoque está mais alto que o normal. Verifique!");
            }else{
                System.out.println("Estoque com média normal!");
            }
        }

    }
}
