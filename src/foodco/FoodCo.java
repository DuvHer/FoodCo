package foodco;
//"PRUEBA"

import java.util.ArrayList;


//"Prueba DOS"
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DuvHer
 */
public class FoodCo {

    private Empleado empleados[];
    private String nombre;
    private Fabrica [] fabrica;
    private ArrayList<Empleado> supervisor;

    public FoodCo(Empleado[] empleados, String nombre) {
        this.empleados = empleados;
        this.nombre = nombre;
        this.fabrica= new Fabrica[3];
        this.supervisor=new ArrayList<Empleado>();
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
