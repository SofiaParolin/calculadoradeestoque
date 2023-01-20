public class CalculadoraDeLivroLooping {
    public static void main(String[] args) {

        double soma = 0;
        int contador = 0;

        while (contador < 35) {
            double valorDoLivro = 59.90;
            soma += valorDoLivro;
            contador ++;
        }
        System.out.println("O total em estoque é:" +soma);
        if (soma < 150) {
            System.out.println("Seu estoque está abaixo da média!");
        }else if (soma >= 2000) {
                System.out.println("Seu estoque está muito alto!");
            }else{
                System.out.println("Seu estoque está na média!");
            }
        }
    }
