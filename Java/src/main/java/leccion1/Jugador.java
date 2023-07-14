package leccion1;

public class Jugador extends Persona {

    private int numeroCamiseta;
    private String[] posiciones;
    private String nacionalidad;

    public Jugador(String nombre, String apellido, int edad, String direccion, String telefono, String correo,
            int numeroCamiseta, String[] posiciones, String nacionalidad) {
        super(nombre, apellido, edad, direccion, telefono, correo);
        this.numeroCamiseta = numeroCamiseta;
        this.posiciones = posiciones;
        this.nacionalidad = nacionalidad;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setPosiciones(String[] posiciones) {
        this.posiciones = posiciones;
    }

    public String[] getPosiciones() {
        return posiciones;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de Camiseta=" + numeroCamiseta + ", Posicion=" + posiciones
                + ", Nacionalidad="
                + nacionalidad;
    }
}
