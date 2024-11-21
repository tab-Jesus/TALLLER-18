/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller18.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class Mantenimiento {
    
    public interface Empleado{
        
        void limpiar();
        
        void reparar();

        
        
    }
    
    public interface Reparador{
        
        void reparar ();
        
    }
   
    
    public interface Limpiador{
        
        void limpiar();
        
    }
    
    public class NanaEmpleado implements Empleado {
        
        @Override
        
        public void limpiar(){
            
            System.out.println("LA NANA LIMPIA");
              
        }
        
        @Override
        public void reparar(){
            
            
            
        }
        
    }
            
    public class mecanicoEmpleado implements Empleado{
        
        @Override 
        
        public void limpiar(){
            
            
            
        }
        
        @Override
        
        public void reparar(){
            
            System.out.println("EL MECANICO TIENE QUE REPARAR");
            
        }
        
        
    }
    
    
}
