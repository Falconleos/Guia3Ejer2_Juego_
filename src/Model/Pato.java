
package Model;

import Enums.TipoAnimal;
import Interfaces.Volador;
import Interfaces.Nadador;
import Interfaces.Caminante;

public class Pato extends Animal implements Volador, Nadador, Caminante {
    
    private String colorPlumaje;
    private String nombre;
    private TipoAnimal tipoAnimal; //variable de enum

    public Pato(Integer salud, Integer puntosAtaque, String colorPlumaje, String nombre) {
        super(salud,puntosAtaque);//super va sin el tipo solo identificador
        this.colorPlumaje = colorPlumaje;
        this.nombre = nombre;
        this.tipoAnimal = TipoAnimal.PATO;//acordarse enum
    }

    
    
    @Override
    public String tipoComunicacion(){
        String comunicacion = "graznidos";
        System.out.println(comunicacion);
        return comunicacion;
    }
    
    @Override
    public String sonidoComunicacion(){
        String sonido = "Cuac";
        System.out.println(sonido);
    return sonido;
    }
    
    @Override
    public void comer(){
        System.out.println("El pato esta Comiendo maiz");
    }
    @Override
    public void dormir(){
        System.out.println("El pato esta Durmiendo en el granero");
    }
    
    @Override
    public void volar(){
        System.out.println("El pato esta volando");
    }
    
    @Override
    public void nadar(){
        System.out.println("El pato nada sobre y bajo el agua");
    }
    
    @Override
    public void caminar(){
        System.out.println("El pato camina sobre la tierra");
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
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
    
}
