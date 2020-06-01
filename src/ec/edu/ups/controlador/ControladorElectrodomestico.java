package ec.edu.ups.controlador;

import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.SortedSet;

/**
 *
 * @author Estudiantes
 */
public class ControladorElectrodomestico {

    private VistaElectrodomestico vistaElectrodomestico;
    private Electrodomestico electrodomestico;
    private IElectrodomesticoDAO electrodomesticoDAO;
    
    private Television television;
    private Lavadora lavadora;
    
    public ControladorElectrodomestico(VistaElectrodomestico vistaElectrodomestico, ElectrodomesticoDAO electrodomesticoDAO) {
        this.vistaElectrodomestico = vistaElectrodomestico;
        this.electrodomesticoDAO = electrodomesticoDAO;
    }
    
    public void ingresarTelevisor(){
        television = vistaElectrodomestico.ingresarTelevision();
        electrodomesticoDAO.crearTelevision(television);
    }
    
    public void ingresarLavadora(){
        lavadora = vistaElectrodomestico.ingresarLavadora();
        electrodomesticoDAO.crearLavadora(lavadora);
    }
    
    
    public void imprimir(){
        SortedSet<Electrodomestico> lista = electrodomesticoDAO.imprimir();
        vistaElectrodomestico.mostrarTodo(lista);
    }
    
}
