package org.ptech081.parking;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

import org.ptech081.parking.entities.*;
public class Main {
    public static void main(String[] args) {
    //crear carros con los constructores:
    Carro carrito1 = new Carro("DDP 695",TipoVehiculo.MOTO);
    Carro carrito2 = new Carro("ASD 235",TipoVehiculo.CAMION);
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
    cliente2.addCar(carrito2);
    cliente2.addCar("AEB 223", TipoVehiculo.CAMION);
    
    //crear cupo
    Cupo cupo1 = new Cupo('A'); 
    Cupo cupo2 = new Cupo('B'); 
    
    //crear dos registros E/S
    LocalDate fechaInicio = LocalDate.now();
    LocalTime horaInicio = LocalTime.now();
    LocalDate fechaFin = LocalDate.of(2024, Month.MARCH, 24);
    LocalTime horaFin = LocalTime.of(10, 59, 50);
    List<Registro> misRegistros= new ArrayList<Registro>();

    LocalDate fechaInicio2 = LocalDate.now();
    LocalTime horaInicio2 = LocalTime.now();
    LocalDate fechaFin2 = LocalDate.of(2025, Month.MARCH, 29);
    LocalTime horaFin2 = LocalTime.of(20, 30, 00);

    //crear registro
    Registro registro1 = new Registro(fechaInicio, horaInicio, fechaFin,horaFin, 5000L,cupo1,cliente1.misCarros.get(1),cliente1);
    Registro registro2 = new Registro(fechaInicio2, horaInicio2, fechaFin2,horaFin2, 6000L,cupo1,cliente2.misCarros.get(1),cliente2);
    //Añadir el registro a la lista
    misRegistros.add(registro1);
    misRegistros.add(registro2);
    
    System.out.println("registros de entreda y salida para parking");
    
    for(Registro r:misRegistros){
        System.out.println("Cliente: " +r.cliente.nombre + " " +r.cliente.Apellido + "|" + r.carro.placa + " " + r.carro.tipoVehiculo + "|" + r.valor+ "|" + r.fechaInicio +" "+ r.horaInicio + "|" );
    }

    }
    
}

