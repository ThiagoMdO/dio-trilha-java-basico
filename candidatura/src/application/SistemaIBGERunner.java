package application;

import enums.EstadosBrasileiros;

public class SistemaIBGERunner {

    public static void main(String[] args) {
        EstadosBrasileiros estadosBrasileiros = EstadosBrasileiros.CEARA;

//        System.out.println(estadosBrasileiros);

        for (EstadosBrasileiros eb : EstadosBrasileiros.values()){
            System.out.println(eb);
            System.out.println(eb.getSigla() + " - " + eb.getNome());
            System.out.println();
        }
    }
}
