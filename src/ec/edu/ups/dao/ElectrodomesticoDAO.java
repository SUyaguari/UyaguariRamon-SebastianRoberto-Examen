package ec.edu.ups.dao;

import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Estudiantes
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO{

    private SortedSet<Electrodomestico> lista;

    public ElectrodomesticoDAO() {
        lista = new  TreeSet<>();
    }
    
    
            
    @Override
    public void crearTelevision(Television television) {
        lista.add(television);
    }

    @Override
    public void crearLavadora(Lavadora lavadora) {
        lista.add(lavadora);
    }

    @Override
    public List<Television> listarTelevision() {;
        for (Iterator<Electrodomestico> iterator = lista.iterator(); iterator.hasNext();) {
            Electrodomestico next = iterator.next();
            
                
            
            
        }
        return null;
    }

    @Override
    public List<Lavadora> listarLavadora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public SortedSet<Electrodomestico> imprimir(){
        return lista;
    }
    
}
