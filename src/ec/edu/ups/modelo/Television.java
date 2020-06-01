package ec.edu.ups.modelo;

/**
 *
 * @author Estudiantes
 */
public class Television extends Electrodomestico{
    private int resolucion;
    private boolean puertoHDMI;

    public Television() {
    }

    public Television(int resolucion, boolean puertoHDMI, int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.puertoHDMI = puertoHDMI;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.resolucion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Television other = (Television) obj;
        if (this.resolucion != other.resolucion) {
            return false;
        }
        return true;
    }

    @Override
    public double obtenertPrecioFinal() {
        if(resolucion>40){
            double porcentaje = (precioBase*30)/100;
            precioBase+=porcentaje;
        }
        if(puertoHDMI==true){
            precioBase+=50;
        }
        return precioBase; 
    }
    
    

    @Override
    public String toString() {
        return super.toString() + " Television{" + "resolucion=" + resolucion + ", puertoHDMI=" + puertoHDMI + '}';
    }
    
    
    
}
