public class Lancha extends Barco
{
    private int horasTrabajadas;

    public Lancha ()
    {
        super();
    }

    public Lancha(String marca, String modelo, int capacidadCombustible, int capacidadCarga, String patente, int capacidadRecoleccion, int horasTrabajadas)
    {
        super(marca, modelo, capacidadCombustible, capacidadCarga, patente, capacidadRecoleccion);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas()
    {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "horasTrabajadas=" + horasTrabajadas +
                '}';
    }

    @Override
    public int administrarRecolecciones()
    {
        return 20 * (this.horasTrabajadas);
    }
}
