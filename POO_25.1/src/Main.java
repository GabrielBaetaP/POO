import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        QUESTÃO 1 LISTA 1
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Digite o seu nome: ");
//        String nome = teclado.nextLine();
//        System.out.print("Olá " + nome + ", Bem-vindo(a) ao Java");

//        QUESTÃO 2 LISTA 1
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Digite a temperatura em Celsius: ");
//        int celsius = teclado.nextInt();
//        double fahrenheit = (celsius * 1.8)+32;
//        System.out.printf("%d°C equivalem a %.0f°F", celsius, fahrenheit);

//        QUESTÃO 3 LISTA 1
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Digite um número: ");
//        int n = teclado.nextInt();
//        if (n % 2 == 0) System.out.printf("O número %d é par", n);
//        else System.out.printf("O número %d é ímpar\n", n);

//        QUESTÃO 4 LISTA 1
//        Scanner teclado = new Scanner(System.in);
//        int n = teclado.nextInt();
//        int real = n/100;
//        int cinq = (n%100)/50;
//        int vint = ((n%100)%50)/25;
//        int dezc = (((n%100)%50)%25)/10;
//        int cinc = ((((n%100)%50)%25)%10)/5;
//        int umce = ((((n%100)%50)%25)%10)%5;
//        System.out.printf("%d moeda(s) de um real, "
//        + "%d moeda(s) de cinquenta centavos, "
//        + "%d moeda(s) de vinte e cinco centavos, "
//        + "%d moedas(s) de dez centavos, "
//        + "%d moedas(s) de cinco centavos, "
//        + "%d moedas(s) de um centavo.",
//        real,cinq,vint,dezc,cinc,umce);

//        QUESTÃO 1 E 2 LISTA 2
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Digite o número 1: ");
//        int num1 = teclado.nextInt();
//        System.out.print("Digite o numero 2: ");
//        int num2 = teclado.nextInt();
//        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
//        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
//        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
//        System.out.printf("%d / %d = %.1f\n", num1, num2, (float)num1/num2);

//        QUESTÃO 3 LISTA 2
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Digite a variável t: ");
//        int t = teclado.nextInt();
//        int horas = t/3600;
//        int minutos = (t%3600)/60;
//        int segundos = (t%3600)%60;
//        System.out.printf("%dh %dm %ds", horas, minutos, segundos);

//        QUESTÃO 4 LISTA 2
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Digita a distância em Km: ");
//        double dist = teclado.nextFloat();
//        System.out.print("Digite o tempo em horas: ");
//        double temp = teclado.nextFloat();
//        System.out.print("Digite a quantidade de gasolina em litros: ");
//        double qtd_gas = teclado.nextFloat();
//
//        System.out.printf("A velocidade média é %.2f\n", dist/temp);
//        System.out.printf("O consumo de combustível médio é %.2f\n", dist/qtd_gas);

//        QUESTÃO 5 LISTA 2
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Digite a coordenada X do ponto 1: ");
//        int x1 = teclado.nextInt();
//        System.out.print("Digite a coordenada Y do ponto 1: ");
//        int y1 = teclado.nextInt();
//        System.out.print("Digite a coordenada X do ponto 2: ");
//        int x2 = teclado.nextInt();
//        System.out.print("Digite a coordenada Y do ponto 2: ");
//        int y2 = teclado.nextInt();
//        System.out.print("Digite a coordenada X do ponto 3: ");
//        int x3 = teclado.nextInt();
//        System.out.print("Digite a coordenada Y do ponto 3: ");
//        int y3 = teclado.nextInt();
//
//        double dist_1_2 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
//        double dist_1_3 = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
//        double dist_2_3 = Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
//
//        if(dist_1_2 == dist_1_3 || dist_1_2 == dist_2_3 || dist_1_3 == dist_2_3) {
//            if(dist_1_2 == dist_1_3 && dist_1_2 == dist_2_3) System.out.println("É EQUILÁTERO");
//            else System.out.println("É ISÓSCELES");
//        }
//        else System.out.println("É ESCALENO");

//        QUESTÃO 6 LISTA 2
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Insira o nome do produto: ");
//        String nome = teclado.nextLine();
//        System.out.print("Insira a quantidade do produto: ");
//        int qtd = teclado.nextInt();
//        System.out.print("Insira o preço do produto: ");
//        double preco = teclado.nextFloat();
//
//        if(qtd<50){
//            if(qtd>20) preco = preco - (preco * 0.20);
//            else if(qtd>10) preco = preco - (preco * 0.10);
//        }
//        else preco = preco - (preco * 0.25);
//        double din = preco * qtd;
//
//        System.out.printf("Produto: %s, " +
//                "Quantidade: %d, " +
//                "Valor com desconto: %.2f.", nome, qtd, din);

//        QUESTÃO 7 LISTA 2
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Insira um número: ");
//        double n = teclado.nextFloat();
//        System.out.print("Insira o valor Min do intervalo: ");
//        int min = teclado.nextInt();
//        System.out.print("Insira o valor Max do intervalo: ");
//        int max = teclado.nextInt();
//
//        if(n<min || n>max) System.out.println("O número está fora do intervalo!");
//        else System.out.println("O número está dentro do intervalo!");


//        QUESTÃO 1 LISTA 3
//        for(int h = 1; h<11;h++) System.out.printf("Tabuada de %d\t", h);
//        for(int i = 1; i < 11; i++){
//            System.out.println();
//            for (int j = 1; j < 11; j++) {
//                System.out.printf("%d * %d = %d\t\t", j, i, (i * j));
//            }
//        }

//        QUESTÃO 2 LISTA 3
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Digite o valor para a sequência de Fibonacci: ");
//        int val = teclado.nextInt();
//        long Fn0 = 0;
//        long Fn1 = 1;
//        for (int i = 0; i < val+1; i++) {
//            if (i == 0) System.out.printf("%d\t", Fn0);
//            else if (i == 1) System.out.printf("%d\t", Fn1);
//            else {
//                long aux = Fn0 + Fn1;
//                System.out.printf("%d\t", aux);
//                Fn0 = Fn1;
//                Fn1 = aux;
//            }
//        }

//        QUESTÃO SLIDE AULA4
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Digite uma frase: ");
//        String frase_ori = teclado.nextLine();
//        String frase = frase_ori;
//        int pos = frase.indexOf(" ");
//        while(pos != -1){
//            frase = frase.substring(0,pos) + frase.substring(pos + 1);
//            pos = frase.indexOf(" ");
//        }
//        System.out.printf("Números de caracteres sem contar o espaço: %d\n", frase.length());
//
//        String frase_maius = frase_ori.toUpperCase();
//        System.out.printf("Frase em letras maiúsculas: %s\n", frase_maius);
//
//        String frase_minus = frase_ori.toLowerCase();
//        System.out.printf("Frase em letras minusculas: %s\n", frase_minus);
//
//        pos = frase_minus.indexOf("a");
//        int cont = 0;
//        while(pos != -1){
//            cont++;
//            frase_minus = frase_minus.substring(0,pos) + frase_minus.substring(pos + 1);
//            pos = frase_minus.indexOf("a");
//        }
//
//        System.out.printf("A quatidade de vezes que a letra A aparece é: %d", cont);
    }
}