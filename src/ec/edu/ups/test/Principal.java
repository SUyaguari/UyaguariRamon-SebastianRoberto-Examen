package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorElectrodomestico;
import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {
    public static void main(String[] args) {
        
        ElectrodomesticoDAO electrodomesticoDAO = new ElectrodomesticoDAO();
        VistaElectrodomestico vistaElectrodomestico = new VistaElectrodomestico();
        ControladorElectrodomestico controladorElectrodomestico = new ControladorElectrodomestico(vistaElectrodomestico, electrodomesticoDAO);
        
        int cont= 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Television "+(i+1));
            controladorElectrodomestico.ingresarTelevisor();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Lavadora "+(i+1));
            controladorElectrodomestico.ingresarLavadora();
        }
        
        controladorElectrodomestico.imprimir();
    }
}
