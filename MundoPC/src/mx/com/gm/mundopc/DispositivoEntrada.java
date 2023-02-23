package mx.com.gm.mundopc;

public class DispositivoEntrada {

    //estos son atributos
    private String tipoEntrada;
    private String marca;

    //esto es un constructor
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Dispositivo entrada {" + "tipoEntrada= " + tipoEntrada + ", marca" + marca + '}';
    }

}
