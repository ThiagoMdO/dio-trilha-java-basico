import model.entities.SmartTV;

public class Main {
    public static void main(String[] args) {


        // Forma de usar o args
//        String nome = args[0];
//        String sobreNome = args[1];
//        int idade = Integer.valueOf(args[2]);
//        double altura = Double.valueOf(args[3]);
//
//        System.out.println("Meu nome é " + nome + " " + sobreNome);
//        System.out.println("Tenho " + idade + " anos de idade");
//        System.out.println("Minha altura é " + altura + " m");

        SmartTV smartTV = new SmartTV(true, 10, 87);

        System.out.println("Tv ligada? " + smartTV.getLigada());
        System.out.println("Canal Tv? " + smartTV.getCanal());
        System.out.println("Volume Atual? " + smartTV.getVolume());

        smartTV.setVolume(55);
        System.out.println("Volume Atual? " + smartTV.getVolume());

        smartTV.setCanal(12);
        System.out.println("Canal Tv? " + smartTV.getCanal());

        System.out.println("\n" + smartTV);

        System.out.println("\n");

        smartTV.desligar();
        System.out.println("Tv ligada? " + smartTV.getLigada());

        System.out.println("\n" + smartTV);

        smartTV.aumentarVolume();
        System.out.println("Volume Atual? " + smartTV.getVolume());
        smartTV.aumentarVolume();
        System.out.println("Volume Atual? " + smartTV.getVolume());
        smartTV.diminuirVolume();
        System.out.println("Volume Atual? " + smartTV.getVolume());

    }
}
