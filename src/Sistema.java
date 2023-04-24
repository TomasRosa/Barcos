import java.util.ArrayList;

public class Sistema
{
    private ArrayList<Barco> barcos;

    public Sistema ()
    {
        this.barcos = new ArrayList<Barco>();
    }
    public int recoleccionDineroLanchas()
    {
        int totalLancha = 0;

        for(Barco barquito: this.barcos)
        {
            if(barquito instanceof Lancha)
            {
                totalLancha = totalLancha + barquito.administrarRecolecciones() * Barco.PRECIOMERLUZA;
            }
        }
        return totalLancha;
    }
    public int recoleccionDineroCorbetas()
    {
        int totalCorbetas = 0;

        for(Barco barquito: this.barcos)
        {
            if(barquito instanceof Corbetas)
            {
                totalCorbetas = totalCorbetas + barquito.administrarRecolecciones() * Barco.PRECIOMERLUZA;
            }
        }
        return totalCorbetas;
    }
    public int recoleccionTotal ()
    {
        return recoleccionDineroLanchas() + recoleccionDineroCorbetas();
    }
    public void agregarBarcos (Barco barco)
    {
        this.barcos.add(barco);
    }
    public void mostrarArrayListBarcos ()
    {
       for(Barco barquito: this.barcos)
       {
           System.out.println(barquito.toString());
       }
    }
    public void mostrarSoloLanchas ()
    {
        System.out.println("Lanchas...");
        for(Barco barquito: this.barcos)
        {
            if(barquito instanceof Lancha)
            {
                System.out.println(barquito.toString());
            }
        }
    }
    public void mostrarSoloCorbetas ()
    {
        System.out.println("Corbetas...");

        for(Barco barquito: this.barcos)
        {
            if(barquito instanceof Corbetas)
            {
                System.out.println(barquito.toString());
            }
        }
    }
    public void eliminarUnBarcoSegunPatente (String patente)
    {
        int i = 0;

        while(i < this.barcos.size())
        {
            if(this.barcos.get(i).getPatente().equalsIgnoreCase(patente))
            {
                this.barcos.remove(i);
            }
            else
            {
                i++;
            }
        }
    }
}
