import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args) {
//        QUESTÃO 1 LISTA 1
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Olá " + nome + ", Bem-vindo(a) ao Java");

//        QUESTÃO 2 LISTA 1
        System.out.print("Digite a temperatura em Celsius: ");
        int celsius = teclado.nextInt();
        double fahrenheit = (celsius * 1.8)+32;
        System.out.printf("%d°C equivalem a %.0f°F", celsius, fahrenheit);

//        QUESTÃO 3 LISTA 1
        System.out.print("Digite um número: ");
        int n = teclado.nextInt();
        if (n % 2 == 0) System.out.printf("O número %d é par", n);
        else System.out.printf("O número %d é ímpar\n", n);

//        QUESTÃO 4 LISTA 1
        n = teclado.nextInt();
        int real = n/100;
        int cinq = (n%100)/50;
        int vint = ((n%100)%50)/25;
        int dezc = (((n%100)%50)%25)/10;
        int cinc = ((((n%100)%50)%25)%10)/5;
        int umce = ((((n%100)%50)%25)%10)%5;
        System.out.printf("%d moeda(s) de um real, "
        + "%d moeda(s) de cinquenta centavos, "
        + "%d moeda(s) de vinte e cinco centavos, "
        + "%d moedas(s) de dez centavos, "
        + "%d moedas(s) de cinco centavos, "
        + "%d moedas(s) de um centavo.",
        real,cinq,vint,dezc,cinc,umce);
    }
}
