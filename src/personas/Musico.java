package personas;

public class Musico {
    public String nombre;
    public String instrumento;

    public Musico(String nombre, String instrumento) {
        this.nombre = nombre;
        this.instrumento = instrumento;
    }

    @Override
    public String toString() {
        return nombre + ", " + instrumento;
    }
}