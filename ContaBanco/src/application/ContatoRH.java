package application;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ContatoRH {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean contituarTentando;
        boolean atendeu;
        do{
            atendeu = atender();
            contituarTentando = !atendeu;
            System.out.print("Chamando... ");
            if (contituarTentando) tentativasRealizadas++;
            else System.out.println("Contato realizado com sucesso!");
        }while (contituarTentando && tentativasRealizadas <= 3);

        if (atendeu) System.out.println("conseguimos contato com o candidato " + candidato + " Na " + tentativasRealizadas + " Tentativa");
        else System.out.println("Não conseguimos contato com o candidato " + candidato + ", número maximo de tentativas " + tentativasRealizadas);
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Gessica", "Maria", "Marcos", "Bob", "Patricia", "Debora"};

        for (String candidato : candidatos) {
            double salarioPretendido = valorPretendido();
            System.out.println(candidato + " quer ganhar R$" + String.format("%.2f", salarioPretendido));
            analisarCandidato(salarioPretendido, candidato);

            System.out.println("");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2500);
    }

    static void analisarCandidato(double salarioPretendido, String candidato) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato " + candidato + ". Pré selecionado");
            entrandoEmContato(candidato);
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para contra proposta " + candidato);
        } else {
            System.out.println(candidato + " Aguardando o resultado dos demais");
        }
    }
}
