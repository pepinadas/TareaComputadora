/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composiciontarea;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
import ico.fes.computadora.Computadora;

/**
 *
 * @author Personal
 */
public class ComposicionTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Computadora computadoraNueva = new Computadora();
        computadoraNueva.setCpu(new CPU("Intel", "I5", 3));
        computadoraNueva.setMonitor(new Monitor("Samsung", "UN46B600VFXZA", 24));
        computadoraNueva.setMouse(new Mouse("Logitech", "G502", "Gamer"));
        computadoraNueva.setTeclado(new Teclado("Logitech", "G213", 101, 1));
        
        System.out.println(computadoraNueva);
        
    }
    
}
