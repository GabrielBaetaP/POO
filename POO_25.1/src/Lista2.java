import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {
//        QUESTÃO 1 E 2 LISTA 2
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número 1: ");
        int num1 = teclado.nextInt();
        System.out.print("Digite o numero 2: ");
        int num2 = teclado.nextInt();
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("%d / %d = %.1f\n", num1, num2, (float)num1/num2);

//        QUESTÃO 3 LISTA 2
        System.out.print("Digite a variável t: ");
        int t = teclado.nextInt();
        int horas = t/3600;
        int minutos = (t%3600)/60;
        int segundos = (t%3600)%60;
        System.out.printf("%dh %dm %ds", horas, minutos, segundos);

//        QUESTÃO 4 LISTA 2
        System.out.print("Digita a distância em Km: ");
        double dist = teclado.nextFloat();
        System.out.print("Digite o tempo em horas: ");
        double temp = teclado.nextFloat();
        System.out.print("Digite a quantidade de gasolina em litros: ");
        double qtd_gas = teclado.nextFloat();

        System.out.printf("A velocidade média é %.2f\n", dist/temp);
        System.out.printf("O consumo de combustível médio é %.2f\n", dist/qtd_gas);

//        QUESTÃO 5 LISTA 2
        System.out.print("Digite a coordenada X do ponto 1: ");
        int x1 = teclado.nextInt();
        System.out.print("Digite a coordenada Y do ponto 1: ");
        int y1 = teclado.nextInt();
        System.out.print("Digite a coordenada X do ponto 2: ");
        int x2 = teclado.nextInt();
        System.out.print("Digite a coordenada Y do ponto 2: ");
        int y2 = teclado.nextInt();
        System.out.print("Digite a coordenada X do ponto 3: ");
        int x3 = teclado.nextInt();
        System.out.print("Digite a coordenada Y do ponto 3: ");
        int y3 = teclado.nextInt();

        double dist_1_2 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double dist_1_3 = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
        double dist_2_3 = Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));

        if(dist_1_2 == dist_1_3 || dist_1_2 == dist_2_3 || dist_1_3 == dist_2_3) {
            if(dist_1_2 == dist_1_3 && dist_1_2 == dist_2_3) System.out.println("É EQUILÁTERO");
            else System.out.println("É ISÓSCELES");
        }
        else System.out.println("É ESCALENO");

//        QUESTÃO 6 LISTA 2
        System.out.print("Insira o nome do produto: ");
        String nome = teclado.nextLine();
        System.out.print("Insira a quantidade do produto: ");
        int qtd = teclado.nextInt();
        System.out.print("Insira o preço do produto: ");
        double preco = teclado.nextFloat();

        if(qtd<50){
            if(qtd>20) preco = preco - (preco * 0.20);
            else if(qtd>10) preco = preco - (preco * 0.10);
        }
        else preco = preco - (preco * 0.25);
        double din = preco * qtd;

        System.out.printf("Produto: %s, " +
                "Quantidade: %d, " +
                "Valor com desconto: %.2f.", nome, qtd, din);

//        QUESTÃO 7 LISTA 2
        System.out.print("Insira um número: ");
        double n = teclado.nextFloat();
        System.out.print("Insira o valor Min do intervalo: ");
        int min = teclado.nextInt();
        System.out.print("Insira o valor Max do intervalo: ");
        int max = teclado.nextInt();

        if(n<min || n>max) System.out.println("O número está fora do intervalo!");
        else System.out.println("O número está dentro do intervalo!");
    }
}
