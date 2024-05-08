import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Qual o salário: ");
            analisarCandidato(scanner.nextDouble());
        }catch (Exception e){
            System.out.printf("Error: " + e.getMessage());
        }

    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.printf("Ligar para candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.printf("Ligar para candidato com contraproposta");
        } else {
            System.out.printf("Aguardando o resultado dos outros candidatos");
        }

    }
}
