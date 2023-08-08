package org.example;

import org.example.punto1.Alumnos;
import org.example.punto1.SistemaAlumnos;
import org.example.punto2.ConvesorMonedas;
import org.example.punto3.Calculadora;
import org.example.punto4.Cliente;
import org.example.punto4.Habitacion;
import org.example.punto4.Hotel;
import org.example.punto4.Reservas;

import java.util.ArrayList;
import java.util.Scanner;

public class Options {
    Scanner input = new Scanner(System.in);


    public String option1() {

        SistemaAlumnos alumno = new SistemaAlumnos();

        System.out.println("1. Registro de Alumnos:\n" +
                "Crea una clase Alumno con propiedades como nombre, edad y calificaciones. \n" +
                "Luego, crea una clase SistemaAlumnos que permite agregar alumnos,\n" +
                "asignar calificaciones , calcular el promedio de sus calificaciones y mostrar la información de cada alumno.");
        boolean n = true;

        //Creamos tantos alumnos como queramos
        while (n == true) {

            System.out.println("Ingrese el nombre del alumno");
            String name = input.nextLine();
            System.out.println("Ingrese la edad del alumno");
            int age = input.nextInt();
            System.out.println("Ingrese la calificación del alumno");
            double score = input.nextDouble();
            alumno.addAlumn(name, age, score);
            input.nextLine();
            System.out.println("Desea agregar otro alumno? \n" +
                    "Si => 1\n" +
                    "No => 0");
            int answer = input.nextInt();
            input.nextLine();
            if (answer == 0) {
                n = false;
            }

        }

        ArrayList<Alumnos> showInfo = (ArrayList<Alumnos>) alumno.showAlumnInfo();
        for (Alumnos alumn : showInfo) {
            System.out.println("-----------------------------------------------");
            System.out.println("Nombre: " + alumn.getNombre());
            System.out.println("Edad: " + alumn.getEdad());
            System.out.println("Calificación: " + alumn.getCalificaciones());
            System.out.println("-----------------------------------------------");
        }
        System.out.println("El promedio de las calificaciones \n" +
                "de los alumnos ingresados es: " + alumno.promPon());
        System.out.println("-----------------------------------------------");
        return "";
    }

    public String option2() {
        System.out.println("1. Conversor de Monedas:\n" +
                "Crea una clase ConversorMonedas que contenga métodos para convertir una cantidad de  \n" +
                "dinero de una moneda a otra, por ejemplo, de dólares a euros o de pesos a dólares.");
        ConvesorMonedas moneda;
        boolean n = true;

        while (n == true) {
            System.out.println("Que tipo de conversión quiere hacer?\n" +
                    "COP - USD -- > 1\n" +
                    "USD - COP --> 2");
            int coin = input.nextInt();
            if (coin == 1) {
                System.out.println("Ingrese la cantidad de pesos a convertir: ");
                double coins = input.nextDouble();
                moneda = new ConvesorMonedas();
                moneda.setPesos(coins);
                return "COP " + coins + " equivale a: " + moneda.coverserCoinToCop();
            } else {
                System.out.println("Ingrese la cantidad de dolares a convertir: ");
                double coins = input.nextInt();
                moneda = new ConvesorMonedas();
                moneda.setDolares(coins);
                return "USD " + coins + " equivale a: " + moneda.coverserCoinToUSD();
            }


        }

        return "";

    }

    public String option3() {
        System.out.println("2. Calculadora Simple:\n" +
                "Crea una clase Calculadora que contenga métodos para realizar operaciones matemáticas básicas,\n" +
                " como suma, resta, multiplicación y división.");
        boolean n = true;
        Calculadora calculadora = new Calculadora();
        Double result = 0.0;
        while (n == true) {
            System.out.println("Que tipo de operación quiere hacer?\n" +
                    "suma -- > +\n" +
                    "resta -- > -\n" +
                    "multiplicación -- > *\n" +
                    "división --> /");
            String operator = input.nextLine();
            System.out.println("Ingrese el primer número");
            double num1 = input.nextDouble();
            System.out.println("Ingrese el segundo número");
            double num2 = input.nextDouble();
            result = calculadora.operation(operator, num1, num2);
            System.out.println("El resultado es " + result);
            System.out.println("Quiere realizar otra operación?\n" +
                    "SI --> 1\n" +
                    "NO --> 0");
            int option2 = input.nextInt();
            System.out.println(option2);
            if (option2 == 0) n = false;

        }
        return "";
    }

    public String option4() {
        Reservas sistema = new Reservas();
        Hotel hotel = new Hotel();
        Cliente cliente = new Cliente();
        int n = 1;

        //Creamos hoteles y 3 habitaciones por hotel
        while (n == 1) {
            System.out.println("Ingrese el nombre del Hotel");
            String nameHotel = input.nextLine();
            hotel.setNameHotel(nameHotel);
            hotel.addHabitacion(new Habitacion(1));
            hotel.addHabitacion(new Habitacion(2));
            hotel.addHabitacion(new Habitacion(3));
            sistema.agregarHotel(hotel);
            System.out.println("Quiere agregar otro hotel?\n" +
                    "Si --> 1\n" +
                    "No --> 2");
            int option = input.nextInt();
            if (option == 2) n = 2;
            if (option == 1) n = 1;
        }

        //Agregamos el cliente
        while (n == 2) {

            System.out.println("Agregar cliente\n" +
                    "Porfavor ingrese el nombre del cliente");
            String nameClient = input.nextLine();
            input.nextLine();
            System.out.println("Ingrese su ID");
            int idCliente = input.nextInt();
            cliente.setCliente(idCliente, nameClient);
            System.out.println("Desea agregar otro cliente?\n" +
                    "Si --> 2\n" +
                    "No --> 3");
            int option = input.nextInt();
            if (option == 3){
                n = 3;
            }else {
                n = 2;
            }

        }

        //Realizamos la reserva
        while (n == 3) {
            System.out.println("Por favor ingrese la empresa la cual está haciendo la reseva");
            input.nextLine();
            String companyName = input.nextLine();
            sistema.realizarReserva(companyName, hotel, 1, cliente);
            System.out.println("Desea realizar otra reserva?\n" +
                    "Si --> 3\n" +
                    "No --> 4");
            int option = input.nextInt();
            if (option == 4) n = 4;
            if (option == 3) n = 3;
        }
        //Cancelar reserva
        System.out.println("Desea cancelar la reserva?\n" +
                "Si ---> 1\n" +
                "No ---> 2");
        int cancelReser = input.nextInt();
        if(cancelReser == 1){
            System.out.println("Que habitacion desea cancelar?\n" +
                    "1\n" +
                    "2");
            int num = input.nextInt();
            sistema.cancelarReserva(hotel, num);
        }else{
            return "Graciasss";
        }
        return "Graciasss";
    }
}
