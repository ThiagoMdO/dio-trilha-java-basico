package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class ProcessoSeleticoRunner {
    public static void main(String[] args) {
        List<String> list = selecaoCandidatos();
        list.stream().map(x -> atender());
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static List<String> selecaoCandidatos() {
        Locale.setDefault(Locale.US);
        String[] candidatos = {"Maria", "Joao", "Marcio", "Izabel", "Bet", "Jonatas"};
        List<String> list = new ArrayList<>();
        double salarioBase = 2000.0;
        for (String candidato : candidatos) {
            double salarioPretendido = valorPretendido();
            //System.out.println("O candidato " + candidato + " solicitou um salario de " + String.format("%.2f",salarioPretendido));

            if (salarioBase >= salarioPretendido) {
//                    System.out.println("O candidato " + candidato + " foi selecionado para a proxima etapa");
                list.add(candidato + ", " + String.format("%.2f", salarioPretendido));
//                    analisarCandidato(salarioPretendido);
            }
//                System.out.println("");
        }
        return list;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2500);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contraproposta");
        } else {
            System.out.println("Aguardando o resultado dos outros candidatos");
        }

    }
}
