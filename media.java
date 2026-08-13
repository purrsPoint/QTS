import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        float nota1 = 0;
        float nota2 = 0;

        while (true) {
            try {
                System.out.print("Insira a 1° nota: ");
                nota1 = rd.nextFloat();

                if (nota1 >= 1 && nota1 <= 10) {
                    break;
                }

                System.out.println("Ponha um valor entre 1 e 10");

            } catch (Exception e) {
                System.out.println("Insira um valor válido. Ex: 1 - 10");
                rd.nextLine();
            }
        }

        while (true) {
            try {
                System.out.print("Insira a 2° nota: ");
                nota2 = rd.nextFloat();

                if (nota2 >= 1 && nota2 <= 10) {
                    break;
                }

                System.out.println("Ponha um valor entre 1 e 10");

            } catch (Exception e) {
                System.out.println("Insira um valor válido. Ex: 1 - 10");
                rd.nextLine();
            }
        }

        double media = (nota1 + nota2) / 2.0;

        System.out.printf("A média aritmética é: %.2f%n", media);

        rd.close();
    }
}