package org.ptech081.parking.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nombre;
    public String Apellido;
    public long identificacion;
    public List<Carro> misCarros;

    
    public Cliente() {
        this.misCarros= new ArrayList<Carro>();
    }


    public Cliente(String nombre, String apellido, long identificacion) {
        this.nombre = nombre;
        Apellido = apellido;
        this.identificacion = identificacion;
        this.misCarros= new ArrayList<Carro>();
    }
    //primera sobre carga de addCar
    public void addCar(Carro Car){
    this.misCarros.add(Car);
    }
    
    //segunda sobrecarga de addCar
    public void addCar(String Placa, TipoVehiculo tv){
        Carro car = new Carro(Placa , tv);
        this.misCarros.add(car);
    }
}
