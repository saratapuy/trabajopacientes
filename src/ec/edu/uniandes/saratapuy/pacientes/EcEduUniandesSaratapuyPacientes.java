/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.saratapuy.pacientes;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class EcEduUniandesSaratapuyPacientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<clsPacientes> pacientes =new ArrayList<clsPacientes>();
               clsPacientes pa0 = new clsPacientes(1,"David",150,false,clsPacientes.sexo.masculino);
               clsPacientes pa1 = new clsPacientes(2,"Diana",125,true,clsPacientes.sexo.femenino);
               clsPacientes pa2 = new clsPacientes(3,"Andres",159,false,clsPacientes.sexo.masculino);
               clsPacientes pa3 = new clsPacientes(4,"Dario",170,false,clsPacientes.sexo.masculino);
               clsPacientes pa4 = new clsPacientes(5,"Anabel",130,true,clsPacientes.sexo.femenino);
               clsPacientes pa5 = new clsPacientes(6,"Marco",134,false,clsPacientes.sexo.masculino);
               clsPacientes pa6 = new clsPacientes(7,"Juan",145,false,clsPacientes.sexo.masculino);
               clsPacientes pa7 = new clsPacientes(8,"Elizabeth",129,true,clsPacientes.sexo.femenino);
               clsPacientes pa8 = new clsPacientes(9,"Julio",180,false,clsPacientes.sexo.masculino);
               clsPacientes pa9 = new clsPacientes(10,"Marcelo",190,false,clsPacientes.sexo.masculino);
              
     pacientes.add(pa0);
     pacientes.add(pa1);
     pacientes.add(pa2);
     pacientes.add(pa3);
     pacientes.add(pa4);
     pacientes.add(pa5);
     pacientes.add(pa6);
     pacientes.add(pa7);
     pacientes.add(pa8);
     pacientes.add(pa9);
     imprimir(pacientes);
    }
    public static void imprimir(ArrayList<clsPacientes> pac)
    {
        for (clsPacientes pacientes :pac){
      System.out.println("*****************");
      System.out.println("ID:"+ pacientes.ID());
      System.out.println("Nombre:"+pacientes.Nombre());
      System.out.println("Peso:"+ pacientes.Peso());
      System.out.println("Tiene seguro:"+ pacientes.Seguro());
      System.out.println("Sexo:"+ pacientes.Sexo());
        }
  }
}
