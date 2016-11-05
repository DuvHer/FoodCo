/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;

import java.util.ArrayList;

/**
 *
 * @author faris
 */
public class Linea extends Fabrica {
    private int id;
    private String nombre;
    private ArrayList<RegistroProduccion> registro;
    private Supervisor supervisor;
    private Empleado[] empleadosL;

    public Linea(Empleado[] empleados, String nombre, String nombref,int id, String nombreL, ArrayList<RegistroProduccion> registro, Supervisor supervisor) {
        super(nombref);
        this.id = id;
        this.nombre = nombreL;
        this.registro = registro;
        this.supervisor = supervisor;
        this.empleadosL=new Empleado[20];
    }
    public int InicioTurno(){
        return 0;    
    }
    
    public int RegistroEmpleadoIn(){
        return 0;    
    }
    
    public int RegistroEmpleadoOut(){
        return 0;    
    }
    
    public int PausarLinea(){
        return 0;    
    }
    
    public int RegistroProblema(){
        return 0;    
    }
    
   
    
}
