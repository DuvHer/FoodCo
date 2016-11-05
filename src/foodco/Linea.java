/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author faris
 */
public class Linea extends Fabrica implements Registros{
    private int id;
    private String nombre;
    private ArrayList<RegistroProduccion> registro;
    private Empleado[] empleadosL;

    public Linea(Empleado[] empleados, String nombre, String nombref,int id, String nombreL, ArrayList<RegistroProduccion> registro) {
        super(empleados, nombre, nombref);
        this.id = id;
        this.nombre = nombreL;
        this.registro = registro;
        this.empleadosL=new Empleado[20];
    
    }

    


    @Override
    public void inicioTurno() {
       JOptionPane.showMessageDialog(null,"inicia trabajo");
    }

    @Override
    public void registroEmpleadoIn() {
        JOptionPane.showMessageDialog(null,"Empleado ingresa");
    }

    @Override
    public void registroEmpleadoOut() {
        JOptionPane.showMessageDialog(null,"Empleado sale");
    }

    @Override
    public void pausarLínea() {
        JOptionPane.showMessageDialog(null,"Linea pausada");
    }

    @Override
    public void registroProblema() {
        JOptionPane.showMessageDialog(null,"problema");
    }

    @Override
    public void registroProduccion() {
        JOptionPane.showMessageDialog(null,"registro produccion");
    }
    
   
    
}
