package Bi3.Trabalho;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho desse vetor: ");
        int n = sc.nextInt();
        int[] var = new int[n];

        for(int i = 0; i<var.length; i++){
            System.out.println(i + 1);
        }


        sc.close();
    }
}
