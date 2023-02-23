package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args){
        //las siguientes 3 lineas son objetos
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP,
                tecladoHP, ratonHP); //objeto de tipo computadora
        
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer,
                tecladoHP, ratonGamer); //objeto de tipo computadora
        
        //objeto de tipo orden
        Orden orden1 = new Orden();
        orden1.agragarComputadora(computadoraHP);
        orden1.agragarComputadora(computadoraGamer);
        
        orden1.mostarOrden();
    }
}
