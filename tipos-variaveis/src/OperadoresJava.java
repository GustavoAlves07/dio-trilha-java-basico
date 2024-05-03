public class OperadoresJava {

    public static void main(String[] args) {
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        //qual o resultado das expressoes abaixo?
        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);

        int a,b;

        a = 6;
        b = 9;

        String resultado = a==b ? "Verdadeiro" : "falso";

        System.out.println(resultado);

        int c,d;

        c = 9;
        d = 10;

        boolean teste = c!=d;

        if (c != d){
            System.out.println("c é diferente de d ? " + teste);
        }

        if (c <= d){
            System.out.println(d + "D é maior que C");
        }else {
            System.out.println(c + "C é maior que D");
        }

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && (8>3)){
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2){
            System.out.println("Pelo menos uma das condições são verdadeiras");
        }
    }
}
