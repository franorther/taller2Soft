package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido a la resolución del taller2\n " +
                "por favor indique de cual inciso quiere ver la respuesta\n" +
                "las opciones son desde el 1 hasta el 4\n" +
                "Si dese salir presione 0");
        boolean n = true;
        while(n == true){
            int point= input.nextInt();
            switch (point){
                //punto1
                case 1:
                    Options punto1  = new Options();
                    punto1.option1();
                    break;
                //punto2
                case 2:
                    String punto2  = new Options().option2();
                    System.out.println(punto2);
                    break;
                //punto3
                case 3:
                    String punto3  = new Options().option3();
                    System.out.println(punto3);
                    break;
                //punto4
                case 4:
                    String punto4  = new Options().option4();
                    System.out.println(punto4);
                    break;
                //Salir
                case 0:
                    n = false;
                    break;


            }
            if(n == true){
                System.out.println("Quiere seguir viendo más respuestas ? por favor indique de cual inciso quiere ver la respuesta\n" +
                        "las opciones son desde el 1 hasta el 4\n" +
                        "Si quiere salir del programa ingrese 0");

            }else{
                System.out.println("Graciasss");
            }

        }
    }
}