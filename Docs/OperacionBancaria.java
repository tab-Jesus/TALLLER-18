/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller18.Docs;

/**
 *
 * @author JESUS DAVID
 */
public interface OperacionBancaria {
    
    void transferir();
    
    void retirar();
      
   void pagarFactura();
 
    
}

public class Transferencia implements Transferencia{
    
    
    public void transferir(){
        
        System.out.println("TRANSFERIR DINERO");
        
    }
    
    public class MetodoRetiro implements Retiro{
        
        @Override
        public void retirar(){
            
            
            System.out.println("Retirar dinero");
        }
        
    }
       
public class MetodoPagoFactura implements PagoFactura{
    
    
    @Override
    
    public void pagarFactura(){
        
        
        
    }
    
            } 
    
 
        
   public interface Transferencia {
    void transferir();
}

public interface Retiro {
    void retirar();
}

public interface PagoFactura {
    void pagarFactura();
}
 
        
    
} 