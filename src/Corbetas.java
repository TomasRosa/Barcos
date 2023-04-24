public class Corbetas extends Barco
{
    private int cantJaulas;

    public Corbetas ()
    {
        super();
    }

    public Corbetas(String marca, String modelo, int capacidadCombustible, int capacidadCarga, String patente, int capacidadRecoleccion, int cantJaulas)
    {
        super(marca, modelo, capacidadCombustible, capacidadCarga, patente, capacidadRecoleccion);
        this.cantJaulas = cantJaulas;
    }

    public int getCantJaulas() {
        return cantJaulas;
    }

    public void setCantJaulas(int cantJaulas) {
        this.cantJaulas = cantJaulas;
    }

    @Override
    public int administrarRecolecciones()
    {
        return this.cantJaulas * 10;
    }

    @Override
    public String toString()
    {
        return  super.toString() +
                "cantJaulas=" + cantJaulas +
                '}';
    }
}
