import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double mesada = 50.0;

        while (mesada > 0){
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.printf("Doce do valor: %.2f, Adicionar a carrinho\n", valorDoce);
            mesada = mesada - valorDoce;
        }
        System.out.println("Doce do valor: " + mesada);
        System.out.println("Joa gastou toda sua mesada");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
