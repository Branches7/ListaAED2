import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner dgt = new Scanner(System.in);
  
    int n = 3;
    int matriz1[][] = new int[n][n];
    int matriz2[][] = new int[n][n];
    int matriz3[][] = new int[n][n];

    for (int i=0; i<n; i++){ // Para escrever nas matrizes
      for (int j=0; j<n; j++){
        System.out.printf("Número %d/%s: ",i,j);
        matriz1[i][j] = dgt.nextInt();
        matriz2[i][j] = matriz1[i][j]; 
      }
    }
    System.out.println("\nMatriz 1\n");
    for (int i=0; i<n; i++){ 
      for (int j=0; j<n; j++){
        System.out.printf("%4d",matriz1[i][j]);
      }
      System.out.println("");
    }
    System.out.println("\nMatriz 2\n");
    for (int i=0; i<n; i++){ 
      for (int j=0; j<n; j++){
        System.out.printf("%4d",matriz2[i][j]);
      }
      System.out.println("");
    }

    System.out.println("\nMatriz 3\n");
    for (int i=0; i<n; i++){ 
      for (int j=0; j<n; j++){
        matriz3[i][j] = matriz1[i][j] + matriz2[i][j]; // matriz3 recebe a soma das outras duas matrizes
        System.out.printf("%4d",matriz3[i][j]);
      }
      System.out.println("");
    }
  }
}
