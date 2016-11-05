/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;

/**
 *
 * @author faris
 */
public class Fabrica extends FoodCo{
    private String nombref;

    public Fabrica(Empleado[] empleados, String nombre,String nombref) {
        super(empleados, nombre);
        this.nombref=nombref;
        
    }

    public Empleado[] AsignarLineaEmpleadosSemana(){
        return null;    
    }
}
