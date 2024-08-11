import java.util.Scanner;

class salariobonus_1009 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String nome;
        double salario, montante;
        
        nome = s.next();
        salario = s.nextDouble();
        montante = s.nextDouble();

        System.out.printf("TOTAL = R$ %.2f\n", salario + montante * 0.15);
    }
}