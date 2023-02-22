package mx.com.gm.ventas;

public class Orden {
    //atributos de la clase
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    //constructor sin argumentos
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superad el maxímo de productos " + Orden.MAX_PRODUCTOS);
        }
    }
    public double calcularTotal(){
            double total = 0;
            for(int i = 0; i<this.contadorProductos; i++){
                //Producto producto = this.productos[i];
                //total += producto.getPrecio(); // esto es igual a -- total = total + producto.getPrecio();
                total += this.productos[i].getPrecio(); //esta linea es igual a las 2 de arriba
            }
            return total;
        }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $" + totalOrden);
        System.out.println("Productos de la orden: ");
        for(int i = 0; i < this.contadorProductos; i++){
            System.out.println(this.productos[i]);
        }
    }
}
