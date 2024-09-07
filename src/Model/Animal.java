
package Model;


public abstract class Animal {
    
    private Integer salud;
    private Integer puntosAtaque;

    public Animal(Integer salud, Integer puntosAtaque) {
        this.salud = salud;
        this.puntosAtaque = puntosAtaque;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Integer getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(Integer puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }
    
    
    
    
    
    public abstract void comer();
    public abstract void dormir();
    public abstract String tipoComunicacion();
    public abstract String sonidoComunicacion();    
    
}
