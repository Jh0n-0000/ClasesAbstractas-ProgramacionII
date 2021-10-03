package pojos;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        /*
        //producto
        Producto producto = new Producto("C001", "Teclado retroiluminado");
        System.out.println(producto);

        //Alquilable
        Alquilable alquilable = new Alquilable("A005", "Monitor 19",10.5);
        System.out.println(alquilable);

        //Tecnologico
        Empresa empresa = new Empresa("DELL", "Av. Principal #35", 2000);
        Tecnologico tecnologico = new Tecnologico("T100", "Vostro 100", "Suiza", Calendar.getInstance().getTime(), empresa);
        System.out.println(tecnologico);

        //Monitor
        Monitor monitor = new Monitor("M111", "Monitor 21", 12.5, "FULL HD");
        System.out.println(monitor);

        // CPU
        Empresa MSI = new Empresa("MSI", "Av. America #35", 3000);
        Cpu cpu = new Cpu("Z123", "MSI", "China",Calendar.getInstance().getTime(), MSI, 16);
        System.out.println(cpu);

        */
        /*
        //Polimorfismo

        Producto producto = new Producto("G120", "Genius g120");

        Producto lj750 = new Impresora("lj750", "Canonlaser 750", 30);
        //System.out.println(lj750);
        Producto s200 = new Monitor("s200+","Samsung s200 plus", 15, "fulhd");
        //System.out.println(s200);
        Producto m500 = new DiscoDuro("m500", "Maxtor m500", 10, 500);
        System.out.println(m500);

        Impresora impresora = (Impresora) lj750;
        //System.out.println(impresora);
        Monitor monitor = (Monitor) s200;
        //System.out.println(monitor);
        DiscoDuro discoDuro = (DiscoDuro) m500;
        //System.out.println(discoDuro);

        Producto [] productos = new Producto[3];
        productos[0] = impresora;
        productos[1] = monitor;
        productos[2] = discoDuro;

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }

         */

        Monitor lg1080 = new Monitor("lg1080", "Monitor LG 1080+", 10, "HD");
       lg1080.reset();
       lg1080.estado();

       DiscoDuro s1000 = new DiscoDuro("s1000", "Samsung", 10, 1000);
       s1000.reset();
       s1000.estado();
    }
}
