package agendaTelefonica;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Oscar de la Cuesta - www.palentino.es
 */
public class Contacto implements Serializable, Comparable<Contacto>{
    /*aquí haremos unas modificaciones, concretamente en lugar de
    tener un int tendremos un ArrayList<TipoTelefono>*/
    private String nombre;
    private ArrayList<String> telefonos= new ArrayList<>();
 
   public Contacto(String nombre,String numero) {
        this.nombre = nombre.length()>=1?nombre:null;
        if(numero.length()>2){
        this.telefonos.add(numero);
        }
        else{
            System.out.println("Formato incorrecto, "
                + "tiene que tener mínimo 3 números");
    }
   }
   public Contacto(String numero) {
        this.nombre = null;
        if(numero.length()>2){
        this.telefonos.add(numero);
        }
        else{
            System.out.println("Formato incorrecto, "
                + "tiene que tener mínimo 3 números");
    }
   }
    public void set_nombre(String nomb){        
        this.nombre=nomb.toUpperCase();
    }

    public String getNombre() {
        return this.nombre;
    }   

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }
    
    @Override
    public int compareTo(Contacto o){
        return this.nombre.compareTo(o.nombre);
        
    }
    

    @Override
    public String toString() {
        String contacto= "Contacto:\n" + nombre +"\n";
               for(String telefono:this.telefonos){
                   String telefonos=telefono +"\n";
                   
               }
               return contacto + "Telefonos\n"+telefonos;
         
    }


}
