import java.util.Random;

public class Sorteio {
    // Atributos, propriedades, variaveis globais

    // Funções e procedimentos

    // Rotina principal

    public static void main(String[] args) {
        Random gerador = new Random();
        int c = 1;
        int soma = 0;
        int maior = 0;
        int menor = 100;
        while (c <= 90) {
            // ler o número
            int n = 1 + gerador.nextInt(100);
            c++; // c += 1 ou c= c + 1

            soma = soma + n;

            if (n < menor) {
                menor = n;

            }
            if (n > maior) {
                maior = n;
            }
            System.out.print(n);
        }

        System.out.print("Soma = " + soma);
        System.out.print("Maior = " + maior);
        System.out.print("Menor = " + menor);
        System.out.print("Media = " + soma / 1000f);

    }
}
