package org.example.punto2;

public class ConvesorMonedas {
    private Double dolares;
    private Double pesos;

    public ConvesorMonedas() {
        this.dolares = 0.0;
        this.pesos = 0.0;
    }

    public void setDolares(Double dolares) {
        this.dolares = dolares;
    }

    public void setPesos(Double pesos) {
        this.pesos = pesos;
    }

    public String coverserCoinToUSD() {

        Double resultCop = this.dolares * 4500;
        return "COP " + resultCop;

    }

    public String coverserCoinToCop() {

        Double resultCop = this.pesos * 0.00024;
        return "USD " + resultCop;

    }
}
