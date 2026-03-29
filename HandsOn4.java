import java.util.Scanner;

public class HandsOn4 {
    public static void main(String[] args) {
        int tentativa = 0;
        String resposta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual comando no CMD é usado para limpar tudo?\nA) dir\nB) cd\nC) mkdir\nD) cls\nE) del\n");
        resposta = sc.next();

        if (!resposta.equalsIgnoreCase("D")) {
            do {
                tentativa++;
                System.out.println("Resposta incorreta\nQual comando no CMD é usado para limpar tudo?\nA) dir\nB) cd\nC) mkdir\nD) cls\nE) del\n");
                resposta = sc.next();
            } while (resposta.equalsIgnoreCase("D") && tentativa < 3);
             }

             if (resposta.equalsIgnoreCase("D")) {
                System.out.println("Certa resposta!");
             } else{
                System.out.println("Número de tentativas esgotado!");
             }
             sc.close();

      }
}
