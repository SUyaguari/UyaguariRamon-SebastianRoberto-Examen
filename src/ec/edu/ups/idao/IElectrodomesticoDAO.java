package ec.edu.ups.idao;

import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.SortedSet;

/**
 *
 * @author Estudiantes
 */
public interface IElectrodomesticoDAO {
    
    public void crearTelevision(Television television);
    public void crearLavadora(Lavadora lavadora);
    public List<Television> listarTelevision();
    public List<Lavadora> listarLavadora();
    public SortedSet<Electrodomestico> imprimir();
}
