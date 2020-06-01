package ec.edu.ups.vista;

import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;

/**
 *
 * @author Estudiantes
 */
public class VistaElectrodomestico {
    
    private Scanner leer;
    
    public Television ingresarTelevision(){
        leer = new Scanner(System.in);
        System.out.println("*****Crear Television*****");
        System.out.print("Ingrese el codigo de la television: ");
        int codigo = leer.nextInt();
        System.out.print("Ingrese la descripcion del televisor: ");
        String descripcion = leer.next();
        System.out.print("Ingrese el precio base del televisor: ");
        double precioBase = leer.nextDouble();
        System.out.print("Ingrese el color del televisor: ");
        String color = leer.next();
        System.out.print("Ingrese el consumo energetico del televisor: ");
        char consumoEnergetico = leer.next().charAt(0);
        System.out.print("Ingrese el peso del televisor: ");
        int peso = leer.nextInt();
        System.out.print("Ingrese la resolucion del televisor: ");
        int resolucion = leer.nextInt();
        System.out.print("Ingrese si tiene puerto HDMI el televisor: ");
        boolean puertoHDMI = leer.nextBoolean();
        return new Television(resolucion, puertoHDMI, codigo, descripcion, precioBase, color, consumoEnergetico, peso);
    }
    
    public Lavadora ingresarLavadora(){
        leer = new Scanner(System.in);
        System.out.println("*****Crear Television*****");
        System.out.print("Ingrese el codigo de la lavadora: ");
        int codigo = leer.nextInt();
        System.out.print("Ingrese la descripcion del lavador: ");
        String descripcion = leer.next();
        System.out.print("Ingrese el precio base del lavador: ");
        double precioBase = leer.nextDouble();
        System.out.print("Ingrese el color del televisor: ");
        String color = leer.next();
        System.out.print("Ingrese el consumo energetico del lavador: ");
        char consumoEnergetico = leer.next().charAt(0);
        System.out.print("Ingrese el peso del lavador: ");
        int peso = leer.nextInt();
        System.out.print("Ingrese la resolucion del lavador: ");
        int carga = leer.nextInt();
        return new Lavadora(carga, codigo, descripcion, precioBase, color, consumoEnergetico, peso);
    }
    
    public void mostrarLavadoras(List<Lavadora> listaLavadora){
        for (Lavadora lavadora : listaLavadora) {
            System.out.println("Datos lavadora: "+lavadora);
        }
    }
    
    public void mostrarTelevisores(List<Television> listateTelevisions){
        for (Television television : listateTelevisions) {
            System.out.println("Datos lavadora: "+television);
        }
    }
    
    public void mostrarTodo(SortedSet<Electrodomestico> lista){
        for (Electrodomestico electrodomestico : lista) {
            System.out.println("eletrodomesticos: "+electrodomestico);
        }
        
    }
}
