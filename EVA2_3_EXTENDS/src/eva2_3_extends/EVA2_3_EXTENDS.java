/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_extends;

/**
 *
 * @author invitado
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estu1=new Estudiante();
        
        estu1.setNombre("Ruben");
        estu1.setApellido("Acosta");
        estu1.setEdad(18);
        estu1.setNoControl("22550342");
        
        System.out.println(estu1.getApellido());
        
        
        Proveedores prove1=new Proveedores();
        
        prove1.setNombre("Juan");
        prove1.setApellido("Nose");
        prove1.setEdad(40);
        prove1.setRfc("Juan2984972");
        
        
        System.out.println(prove1.getApellido());
    }
    
}
