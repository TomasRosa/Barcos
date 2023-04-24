import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Sistema sistema = generarSistema();

        System.out.println("Que funcionamiento del sistema desea ver?");
        System.out.println("1. Ver solo lanchas");
        System.out.println("2. Ver solo corbetas");
        System.out.println("3. Ver todos juntos");
        System.out.println("El metodo de agregar esta demostrado en la funcion generarSistema de abajo");
        System.out.println("4.Ver sistema de recoleccion de corbetas. ");
        System.out.println("5. Ver sistema de recoleccion de lanchas. ");
        System.out.println("6. Ver sistema de recoleccion general. ");
        System.out.println("7. Eliminar un barco segun patente.");

        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                sistema.mostrarSoloLanchas();
                break;
            }
            case 2:
            {
                sistema.mostrarSoloCorbetas();
                break;
            }
            case 3:
            {
                sistema.mostrarArrayListBarcos();
                break;
            }
            case 4:
            {
                int recoleccionCorbetas = sistema.recoleccionDineroCorbetas();
                System.out.println("El dinero que han recolectado los corbetas es: " + recoleccionCorbetas);
                break;
            }
            case 5:
            {
                int recoleccionLanchas = sistema.recoleccionDineroLanchas();
                System.out.println("El dinero que han recolectado las lanchas es: " + recoleccionLanchas);
                break;
            }
            case 6:
            {
                int recoleccionTotal = sistema.recoleccionTotal();
                System.out.println("El dinero que se ha recolectado total es de: " + recoleccionTotal);
                break;
            }
            case 7:
            {
                System.out.println("Barcos antes de eliminar uno: ");
                sistema.mostrarArrayListBarcos();

                System.out.printf("Ingrese la patente del barco que desea eliminar. ");
                scan.nextLine();
                String patente = scan.nextLine();

                sistema.eliminarUnBarcoSegunPatente(patente);

                System.out.println("Sistema luego de haber eliminado patente: ");

                sistema.mostrarArrayListBarcos();
            }

        }

    }
    public static Sistema generarSistema ()
    {
        ///Agregando Lanchas y Corbetas al sistema de barcos.
        Lancha lanchita1 = new Lancha("Scania","Nuevo",200,1000,"STV 214",50,20);
        Lancha lanchita2 = new Lancha("Duracell","Viejita",150,800,"BCL 777",40,17);
        Corbetas corbeta1 = new Corbetas("Volkswagen","Intermedio",120,700,"RPT 145",30,15);
        Corbetas corbeta2 = new Corbetas("Gol","Intermedio",150,600,"RBK 145",35,17);

        Sistema generarSistema = new Sistema();

        generarSistema.agregarBarcos(lanchita1);
        generarSistema.agregarBarcos(corbeta2);
        generarSistema.agregarBarcos(lanchita2);
        generarSistema.agregarBarcos(corbeta1);

        return generarSistema;
    }

}