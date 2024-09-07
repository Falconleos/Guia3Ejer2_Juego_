
package Main;

import Enums.TipoAnimal;
import Interfaces.*;
import Model.*;



public class Main {

    
    public static void main(String[] args) {
      
        //(Integer salud, Integer puntosAtaque, String colorPlumaje, String nombre)
        Pato pt1 = new Pato(50,75,"Blanco","Lucas");
        //(Double alcanceVision, String nombre, Integer salud, Integer puntosAtaque)
        Murcielago m1 = new Murcielago(165.5,"Claudio",20,35);
        //(int velocidad,Double peso,Integer salud,Integer puntoAtaque)
        Pez pz1 = new Pez(150,2.5,10,15);
        
        
        pt1.comer();
        pz1.nadar();
        m1.tipoComunicacion();
        m1.dormir();
        
    }
    
}
