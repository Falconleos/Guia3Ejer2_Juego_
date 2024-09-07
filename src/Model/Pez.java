
package Model;

import Enums.TipoAnimal;
import Interfaces.Nadador;
        
public class Pez extends Animal implements Nadador{
    
    private Integer velocidad;
    private Double peso;
    private TipoAnimal tipoAnimal;
    
    public Pez(int velocidad,Double peso,Integer salud,Integer puntoAtaque){
        super(salud,puntoAtaque);
        this.velocidad = velocidad;
        this.peso = peso;
        this.tipoAnimal = TipoAnimal.PEZ;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    
    
    
    
    
    @Override 
    public void dormir(){
        System.out.println("El pez duerme bajo del agua");
    }
    @Override 
    public void comer(){
        System.out.println("El pez come placton");
    }
    
    @Override 
    public String tipoComunicacion(){
        String comunicacion = "vibraciones";
        System.out.println("El pez se comunica con " + comunicacion);
        return comunicacion;
    }
    @Override 
    public String sonidoComunicacion(){
        String comunicacion = "zum";
        System.out.println("El pez hace " + comunicacion);
        return comunicacion;
    }
    
    @Override 
    public void nadar(){
        System.out.println("El pez esta nadando");
    }
    
}
