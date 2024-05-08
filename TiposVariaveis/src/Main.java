public class Main {
    public static void main(String[] args) {

        int numero = 4;

        numero ++;

        System.out.println(-- numero);
        System.out.println(numero++);
        System.out.println(numero);

        try {
            numero = numero /0;
            System.out.println(numero);

        }catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
