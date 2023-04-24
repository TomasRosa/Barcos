import java.util.Objects;

public abstract class Barco
{
    public static final int PRECIOMERLUZA =  11;
    private String marca;
    private String modelo;
    private int capacidadCombustible;
    private int capacidadCarga;
    private String patente;
    private int capacidadRecoleccion;
    public Barco ()
    {

    }
    public Barco(String marca, String modelo, int capacidadCombustible, int capacidadCarga, String patente, int capacidadRecoleccion)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadCombustible = capacidadCombustible;
        this.capacidadCarga = capacidadCarga;
        this.patente = patente;
        this.capacidadRecoleccion = capacidadRecoleccion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapacidadRecoleccion() {
        return capacidadRecoleccion;
    }

    public void setCapacidadRecoleccion(int capacidadRecoleccion) {
        this.capacidadRecoleccion = capacidadRecoleccion;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", capacidadCarga=" + capacidadCarga +
                ", patente='" + patente + '\'' +
                ", capacidadRecoleccion=" + capacidadRecoleccion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Barco barco = (Barco) o;
        return Objects.equals(patente, barco.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patente);
    }

    public abstract int administrarRecolecciones();
}
