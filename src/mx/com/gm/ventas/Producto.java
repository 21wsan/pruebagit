package mx.com.gm.ventas;

public class Producto {

    //atributos de la clase
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //contructor vacio
    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    //constructor con 2 argumentos
    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }
    //getters and setters
    public int getIdProducto(){
        return idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    @Override
    public String toString(){
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre +
                ", precio=" + precio + '}';
    }
}
