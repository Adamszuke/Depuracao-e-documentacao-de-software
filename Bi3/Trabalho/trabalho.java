package Bi3.Trabalho;
import java.util.Scanner;

public class trabalho {

    public static int converterParaNatural(int n, Scanner sc){
        if(n >= 0){
            return n;
        }
        System.out.println("O número digitado não é natural, digite novamente: ");
        n = sc.nextInt();

        return converterParaNatural(n, sc);
    }

    public static int preencherVetor(int[] n, int numeroNatural, int numeroAtual){
        numeroAtual = 1;
        if (numeroAtual < numeroNatural ){
            return numeroAtual + 1;
        } else {
            return n[numeroAtual];
        }
        //return preencherVetor(n, numeroNatural, numeroAtual);
        //Corrigir
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAtual = 0;
        System.out.println("Digite o tamanho do seu Vetor: ");
        int numeroNatural = sc.nextInt();

        int[] vetor = new int[numeroNatural]; 


        if (vetor[numeroAtual] < numeroNatural) {
            preencherVetor(vetor, numeroNatural, numeroAtual);
        }



    }
}
