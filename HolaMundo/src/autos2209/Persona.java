/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author Viktor
 */
public class Persona {
    private String nombre;
    private int edad;
    
    //método constructor
    public Persona() {
    }

    //método constructor sobrecargado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void comer(String platillo){
        System.out.println( this.nombre + " está comiendo " + platillo);
        Automovil bocho = new Automovil();
        bocho.setMarca("VW");
        bocho.setSubmarca("Sedan Oval Window");
        bocho.setModelo(1956);
        bocho.setColor(Color.BLUE);
        System.out.println("Marca: " + bocho.getMarca()); 
        System.out.println("Modelo: "+ bocho.getModelo());
        System.out.println("Submarca: "+ bocho.getSubmarca());
        System.out.println("Color: "+ bocho.getColor());
        
        // Carro dos: Mustang
    
    Automovil Mustang = new Automovil();
        Mustang.setMarca("Ford");
        Mustang.setSubmarca("Ford Mustang");
        Mustang.setModelo(2021);
        Mustang.setColor(Color.YELLOW);
        System.out.println("Marca: " + Mustang.getMarca()); 
        System.out.println("Modelo: "+ Mustang.getModelo());
        System.out.println("Submarca: "+ Mustang.getSubmarca());
        System.out.println("Color: "+ Mustang.getColor());
//Carro tres: Acura
    
     Automovil Acura = new Automovil();
        Acura.setMarca("Acura");
        Acura.setSubmarca("Type-S");
        Acura.setModelo(2022);
        Acura.setColor(Color.BLACK);
        System.out.println("Marca: " + Acura.getMarca()); 
        System.out.println("Modelo: "+ Acura.getModelo());
        System.out.println("Submarca: "+ Acura.getSubmarca());
        System.out.println("Color: "+ Acura.getColor());
    
    
    }
    
          
}
