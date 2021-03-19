import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class Main{
  public static void main(String[] args)throws IOException{
    Scanner dgt = new Scanner(System.in);

    System.out.printf("Nome arquivo: ");
    String nome = dgt.nextLine();
    
    System.out.println("Palavra 1: ");
    String p1 = dgt.nextLine();

    System.out.println("Palavra 2: ");
    String p2 = dgt.nextLine();

    System.out.println("Palavra 3: ");
    String p3 = dgt.nextLine();

    File arq = new File(nome);
    if (arq.exists()){
      System.out.printf("Arquivo já existe");
    }
    else{
      FileOutputStream arq2 = new FileOutputStream(nome);
      DataOutputStream gravarArquivo = new DataOutputStream(arq2);

      gravarArquivo.writeUTF(p1);
      gravarArquivo.writeUTF(p2);
      gravarArquivo.writeUTF(p3);
      System.out.println("Arquivo criado!");
      arq2.close();
    }
  }
}