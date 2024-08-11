import java.util.Scanner;

class salario_1008 {
    public static void main(String[] args) {
        int numero, horas;
        double valorhora;
        Scanner s = new Scanner(System.in);

        numero = s.nextInt();
        horas = s.nextInt();
        valorhora = s.nextFloat();        

        System.out.printf("NUMBER = %d\n", numero);
        System.out.printf("SALARY = U$ %.2f\n", horas*valorhora);
    }
}