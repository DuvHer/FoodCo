/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;

import java.util.*;



/**
 *
 * @author faris
 */
public class Empresa {
    private Empleado empleados[];
    private String nombre;
    private Fabrica [] fabrica;
    private ArrayList<Supervisor > supervisor;

    public Empresa(Empleado[] empleados, String nombre) {
        this.empleados = empleados;
        this.nombre = nombre;
        this.fabrica= new Fabrica[3];
        this.supervisor=new ArrayList<Supervisor>();
    }
    public void agregarSupervisor (Supervisor supervisora){
        supervisor.add(supervisora);
    }
    public Empleado[] AsignarEmpleadosFabrica(){
        return null;
    }
    public String RegistroEmpleadosDisponibles(){
        return null;    
    }
    
    public String RegistroEmpleadosNoDisponibles(){
        return null;    
    }
    
    public String RegistroEmpleadosProbablementeDisponibles(){
        return null;    
    }
    
    public String AlmacenarSolicitudesVacaciones(){
        return null;    
    }
    
    public String AlmacenarSolicitudesEnfermedad(){
        return null;    
    }
    
    
}