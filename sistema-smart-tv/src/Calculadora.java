/**
* <h1> Calculadora </h1>
*
* A calculadora realiza operações matemáticas entre números inteiros
*
* <b>Note:</b> Leia atentamente a documentação desta classe
* para desfrutar dos recursos oferecidos pelo autor
*
* @author Thiago Mendes
* @version 1.0
* @since 29/04/2024
* */

//javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
public class Calculadora {

    public static void main(String[] args) {
        System.out.println(somar(1,8));
    }


    /**
    * Este método é utilizado para somar dois números inteiros
    * @param numeroUm este é o primeiro parâmetro do método
    * @param numeroDois este é o segundo parâmetro do método
    * @return int o resultado deste método é a soma dos dois números.
    * */
    public static int somar(int numeroUm, int numeroDois){
        return numeroUm + numeroDois;
    }


}
