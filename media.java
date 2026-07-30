import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        int nota1=0;
        int nota2=0;

        try {
            while (true) {
                System.out.printf("Insira a 1° nota: ");
                nota1 = rd.nextInt();
                if (nota1 >= 1 && nota1 <= 10) {
                    break;
                } else {
                    System.out.println("\nponha um valor entre 1 e 10");
                }
            }

            while (true) {
                System.out.printf("Insira a 2° nota: ");
                nota2 = rd.nextInt();
                if (nota2 >= 1 && nota2 <= 10) {
                    break;
                } else {
                    System.out.println("\nponha um valor entre 1 e 10");
                }
            }

        } catch (Exception e) {
            System.out.println("Insira um valor valido\nex. 1 - 10");
        }
        
        double media = (nota1+nota2)/2.0 ;

        System.out.printf("a média aritmética é: %2.f%\n" , media);
        rd.close();
    }
}