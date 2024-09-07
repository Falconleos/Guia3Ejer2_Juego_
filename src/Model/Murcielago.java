
package Model;

import Interfaces.Volador;
import Enums.TipoAnimal;

public class Murcielago extends Animal implements Volador{
    
    private Double alcanceVision;
    private String nombre;
    private TipoAnimal tipoAnimal;

    public Murcielago(Double alcanceVision, String nombre, Integer salud, Integer puntosAtaque) {
        super(salud, puntosAtaque);
        this.alcanceVision = alcanceVision;
        this.nombre = nombre;
        this.tipoAnimal = TipoAnimal.MURCIELAGO;
    }

    public Double getAlcanceVision() {
        return alcanceVision;
    }

    public void setAlcanceVision(Double alcanceVision) {
        this.alcanceVision = alcanceVision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    
    
    @Override
    public void volar(){
        System.out.println("El murcielago esta volando en la oscuridad");
    }
    
    @Override
    public void comer(){
        System.out.println("El murcielago está comiendo insectos");
    }
    
    @Override
    public void dormir(){
        System.out.println("El murcielago esta durmiendo boca abajo");
    }
    
    @Override
    public String tipoComunicacion(){
        String comunicacion = "pulsos";
        System.out.println("Comunicacion:" + comunicacion);
        return comunicacion;
    }
    
    @Override
    public String sonidoComunicacion(){
        String sonido = "chic";
        System.out.println("Sonido:" + sonido);
        return sonido;
    }
}
