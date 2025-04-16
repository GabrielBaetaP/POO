import java.util.Scanner;

public class Lista3 {
    public static void main(String[] args) {
//        QUESTÃO 1 LISTA 3
        for(int h = 1; h<11;h++) System.out.printf("Tabuada de %d\t", h);
        for(int i = 1; i < 11; i++){
            System.out.println();
            for (int j = 1; j < 11; j++) {
                System.out.printf("%d * %d = %d\t\t", j, i, (i * j));
            }
        }

//        QUESTÃO 2 LISTA 3
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor para a sequência de Fibonacci: ");
        int val = teclado.nextInt();
        long Fn0 = 0;
        long Fn1 = 1;
        for (int i = 0; i < val+1; i++) {
            if (i == 0) System.out.printf("%d\t", Fn0);
            else if (i == 1) System.out.printf("%d\t", Fn1);
            else {
                long aux = Fn0 + Fn1;
                System.out.printf("%d\t", aux);
                Fn0 = Fn1;
                Fn1 = aux;
            }
        }

//        QUESTÃO 3 LISTA 3
        System.out.print("Digite uma frase: ");
        String frase_ori = teclado.nextLine();
        String frase = frase_ori;
        int pos = frase.indexOf(" ");
        while(pos != -1){
            frase = frase.substring(0,pos) + frase.substring(pos + 1);
            pos = frase.indexOf(" ");
        }
        System.out.printf("Números de caracteres sem contar o espaço: %d\n", frase.length());

        String frase_maius = frase_ori.toUpperCase();
        System.out.printf("Frase em letras maiúsculas: %s\n", frase_maius);

        String frase_minus = frase_ori.toLowerCase();
        System.out.printf("Frase em letras minusculas: %s\n", frase_minus);

        pos = frase_minus.indexOf("a");
        int cont = 0;
        while(pos != -1){
            cont++;
            frase_minus = frase_minus.substring(0,pos) + frase_minus.substring(pos + 1);
            pos = frase_minus.indexOf("a");
        }

        System.out.printf("A quatidade de vezes que a letra A aparece é: %d", cont);
    }
}