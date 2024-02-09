package org.ptech081.parking;

import org.ptech081.parking.entities.*;
public class Main {
    public static void main(String[] args) {
    //crear carros con los constructores:
    Carro carrito1 = new Carro("DDP695",TipoVehiculo.MOTO);
    Carro carrito2 = new Carro("ASD235",TipoVehiculo.CAMION);
    Carro carrito3 = new Carro();
    carrito3.placa = "JHG654";
    carrito3.tipoVehiculo = TipoVehiculo.CAMIONETA;

    //crear cliente
    Cliente cliente1= new Cliente("JULIAN ", "BERMUDEZ", 567L);
    Cliente cliente2= new Cliente();
    cliente2.nombre="JUAN";
    cliente2.Apellido="GOMEX";
    cliente2.identificacion=631561L;

    //invocar el metodo addCar:
    cliente1.addCar(carrito1);
    cliente1.addCar("ASB 223", TipoVehiculo.BUS);
    //Recorrer los carros del cliente
    for( Carro c : cliente1.misCarros ){
        System.out.println(c.placa + " "+ c.tipoVehiculo);
        System.out.println("----------------");
    }
    }
}

