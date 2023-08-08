package org.example.punto3;

public class Calculadora {

//    private Double num1;
//    private Double num2;
//
//    public Calculadora() {
//        this.num1 = 0.0;
//        this.num2 = 0.0;
//    }

    public Double operation(String operator, Double num1, Double num2) {
        if (operator.contains("+")) return num1 + num2;
        if (operator.contains("-")) return num1 - num2;
        if (operator.contains("*")) return num1 * num2;
        return num1 / num2;
    }

}
