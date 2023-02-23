package mx.com.gm.mundopc;

public class Monitor {

    //atributos de la clase
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    //contructor
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    //constructor con 2 atributos
    public Monitor(String marca, double tamanio) {
        //inicializar atributos
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    public int getMonitor(){
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    @Override
    public String toString(){
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
}
