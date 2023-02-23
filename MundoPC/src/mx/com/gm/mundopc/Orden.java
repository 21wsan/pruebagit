package mx.com.gm.mundopc;

public class Orden {

    //estos son atributos
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;

    //esto es un constructor
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    //esto es un metodo
    public void agragarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Has superado el limite: " + Orden.MAX_COMPUTADORAS);
        }
    }
    //esto es un metodo
    public void mostarOrden(){
        System.out.println("Orden #:" + this.idOrden);
        System.out.println("computadoras de la orden #: " + this.idOrden);
        for(int i = 0; i < this.contadorComputadoras; i++){
            System.out.println(this.computadoras[i]);
        }
    }
}
