/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/**
 *
 * @author walmart
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  System.out.println("Hola Mundo");
        Persona per1 = new Persona();
        per1.setNombre("Viktor");
        System.out.println("Nombre:" + per1.getNombre());
        per1.comer("Quesadilla!!!");
        
        Persona per2 = new Persona();
        per2.setNombre("Vik");
        per2.comer("Pizza Hawaiiana");
        System.out.println("Nombre:" + per2.getNombre());
    
        
   
    }
    
}
