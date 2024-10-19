package Biclioteca;
public class Pais {
    private String nombre;
    private int codigo;
    
    /**
     * @param nombre
     * @param codigo
     */
    public Pais(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "nombre del pais =" + nombre + ", codigo =" + codigo;
    }
    
}
