public class Main {


    public static void main(String[] args) {
        int numero= 5, numeroWhile = 1 , contador = 1, cont = 1;
        String estacion = "invierno";

        if(numero == 5)
        System.out.println("Es positivo" + " Ejercicio if");

        while(numeroWhile < 10){
            System.out.println(numeroWhile + " Bucle While");
            numeroWhile = numeroWhile + 1;
        }

        do{
            System.out.println(contador + " Bucle do while");
            contador = contador + 1;
        }while(contador < 2);

        for(cont = 1; cont <= 10; cont = cont +1)
            System.out.println(cont +  " Bulce For");

        if (estacion == "primavera"){
            System.out.println("Es primavera");
        }else if (estacion == "verano"){
            System.out.println("Es varano");
        }else {
            System.out.println("Es otra estacion...");
        }
    }
}