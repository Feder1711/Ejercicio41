package personas;

import java.math.BigDecimal;

public class MusicoRefuerzo extends Musico {
    public BigDecimal sueldo;

    public MusicoRefuerzo(String nombre, String instrumento, BigDecimal sueldo) {
        super(nombre, instrumento);
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + sueldo + " C";
    }
}