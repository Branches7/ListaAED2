import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner dgt = new Scanner(System.in);
    int n = 10;
    int vetor[] = new int[n];
    int ordenado[] = new int[n]; 
    
    for (int i = 0; i < n; i++){
    System.out.printf("Digite o %d° número: ", i+1);
    vetor[i] = dgt.nextInt();
    ordenado[i] = vetor[i]; //array que vai ser ordenado recebe do array original
    }
    Arrays.sort(ordenado); //ordenando array

    for (int i=0;i<n;i++){
      System.out.printf("Original:%d Ordenado:%d\n",vetor[i], ordenado[i]); //printando os 2 arrays
    }
  }
}
