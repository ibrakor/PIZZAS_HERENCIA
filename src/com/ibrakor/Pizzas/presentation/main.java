package com.ibrakor.Pizzas.presentation;

import com.ibrakor.Pizzas.domain.Horno;
import com.ibrakor.Pizzas.domain.PizzaBarbacoa;
import com.ibrakor.Pizzas.domain.PizzaCarbonara;

public class main {
    public static void main(String[] args) {
    //Creo una instancia de un horno normal
        Horno hornoNormal = new Horno();
        hornoNormal.setId("927F");
        hornoNormal.setNombre("Horno Normal");
        hornoNormal.setMarca("Brand X");
        hornoNormal.setTemperatura(450);

    //Creo un horno para celiacos
        Horno hornoSinGluten = new Horno();
        hornoSinGluten.setId("78G");
        hornoSinGluten.setNombre("Horno Celiacos");
        hornoSinGluten.setMarca("Brand X");
        hornoSinGluten.setTemperatura(350);

    //Creo una pizza barbacoa
        PizzaBarbacoa pizzaBarbacoa = new PizzaBarbacoa();
        pizzaBarbacoa.setId("pb3");
        pizzaBarbacoa.setNombre("Pizza Barbacoa");
        pizzaBarbacoa.setSalsa("Tomate, barbacoa");
        pizzaBarbacoa.setExtras("maiz");
        pizzaBarbacoa.setPicante(false);
        pizzaBarbacoa.setHorno(hornoNormal);

    //Creo una pizza barbacoa para celiacos

        PizzaBarbacoa barbacoaSinGluten = new PizzaBarbacoa();
        barbacoaSinGluten.setId("pbsg");
        barbacoaSinGluten.setNombre("Pizza Barbacoa Sin Gluten");
        barbacoaSinGluten.setSalsa("Barboca");
        barbacoaSinGluten.setExtras("Cebolla");
        barbacoaSinGluten.setPicante(true);
        pizzaBarbacoa.setHorno(hornoSinGluten);



    }

}
