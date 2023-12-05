package personas;

public class MusicoSocio extends Musico {
    public int numeroSocio;

    public MusicoSocio(String nombre, String instrumento, int numeroSocio) {
        super(nombre, instrumento);
        this.numeroSocio = numeroSocio;
    }

    @Override
    public String toString() {
        return super.toString() + ", número de socio: " + numeroSocio;
    }
}
