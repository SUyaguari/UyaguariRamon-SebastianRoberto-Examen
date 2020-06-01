package ec.edu.ups.modelo;

/**
 *
 * @author Estudiantes
 */
public class Electrodomestico implements Comparable<Electrodomestico>{
    private int codigo;
    private String descripcion;
    protected double precioBase;
    private String color;
    private char consumoEnergetico;
    private  int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.codigo;
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
        final Electrodomestico other = (Electrodomestico) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    public double obtenertPrecioFinal(){
        if(consumoEnergetico=='A'){
            precioBase+=100;
        }else if(consumoEnergetico=='B'){
            precioBase+=80;
        }else if(consumoEnergetico=='C'){
            precioBase+=60;
        }else if(consumoEnergetico=='D'){
            precioBase+=50;
        }else if(consumoEnergetico=='E'){
            precioBase+=30;
        }else if(consumoEnergetico=='F'){
            precioBase+=10;
        }
        if(peso>=0 && peso<=19){
            precioBase+=10;
        }else if(peso >=20 && peso<=49){
            precioBase+=50;
        }else if(peso>=50 && peso<=79){
            precioBase+=80;
        }else if(peso>=80){
            precioBase+=100;
        }
        return precioBase;
    }

    @Override
    public int compareTo(Electrodomestico o) {
        if(precioBase>o.precioBase){
            return 1;
        }
        if(precioBase<o.precioBase){
            return -1;
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return "Electrodomesticos{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
    
}
