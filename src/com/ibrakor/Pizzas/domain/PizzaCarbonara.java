package com.ibrakor.Pizzas.domain;

public class PizzaCarbonara extends Pizza{
    private boolean quesoAzul;
    private boolean quesoCabra;

    public boolean isQuesoAzul() {
        return quesoAzul;
    }

    public void setQuesoAzul(boolean quesoAzul) {
        this.quesoAzul = quesoAzul;
    }

    public boolean isQuesoCabra() {
        return quesoCabra;
    }

    public void setQuesoCabra(boolean quesoCabra) {
        this.quesoCabra = quesoCabra;
    }
}
