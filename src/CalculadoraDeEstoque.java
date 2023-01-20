public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        //DOUBLE NUMERO COM PONTO FLUTUANTE

        double livroJavaB = 45.90;
        double livroTDD = 59.50;

        double soma = livroJavaB + livroTDD;

        System.out.println("O total em estoque é "+soma);

        if (soma < 150) {
            System.out.println("Seu valor está abaixo da média");
        } else if (soma >= 2000){
            System.out.println("Seu estoque está maior que o normal. Verifique!");
        } else {
            System.out.println("Seu estoque está na média");
        }

    }
}
