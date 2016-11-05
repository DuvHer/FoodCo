package foodco;

import foodco.Empleado;
import foodco.Linea;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DuvHer
 */
public class Supervisor extends Empleado {

    public Supervisor(String name, int id, String experiencias, Linea linea) {
        super(name, id, experiencias, linea);
    }

    
    public int AprobarSolicitudesEmpleados(){
        return 0;    
    }
    
}
