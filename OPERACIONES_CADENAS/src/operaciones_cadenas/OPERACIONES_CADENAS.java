
package operaciones_cadenas;

public class OPERACIONES_CADENAS {
    public static void main(String[] args) {
        //Declaracion y asignacion de cadenasd;
        String Nombre = "Zeny ";
        String Apellido = "Escalante Lopez";
        
        //Concatenar
        String nombreCompleto = Nombre + "" +Apellido;
        
        System.out.println("Nombre completo: " + nombreCompleto);
       
        //:    
        String nombreCompleto1 = Nombre + ""   +Apellido;
        
        System.out.println("Nombre Completo:" + nombreCompleto1.toUpperCase());
          
     //Mayusculas: 
        //String NombreCompleto = "Zeny Nayeli Ecslante lopez";
        //String enMayusculas = NombreCompleto.toUpperCase();
       // System.out.println("Nombre Completo:" + enMayusculas);
        
        //Minusculas
       String nombreCompleto2 = Nombre + ""   +Apellido;    
       System.out.println("Nombre Completo2: " + nombreCompleto2.toLowerCase());
       
         //Contar
       String nombreCompleto3 = Nombre + "" +Apellido;
       System.out.println("Nombre Completo3: " + nombreCompleto3.length());
       //Contar Cadena
        String NombreCompleto4 = Nombre + " "+ Apellido ;
        //["Pamela","ZENY","ESCALANTE","LOPEZ"]
        String[] NombreCortado = NombreCompleto4.split(" ");
        //System.out.println (NombreCortado[1]);
//        for(int i = 0 ; i < NombreCortado.length; i++){
//               System.out.println (NombreCortado[i]);
//        }
        for(String nombre : NombreCortado){
            System.out.println(nombre);
        }

       //boolean
      boolean comparacion = Nombre == Apellido;
       System.out.println("comparacion " +comparacion);
       
       
      //Interpolacion de variables
      String n = "Zeny";
      String a = "Escalante";
      int e = 18; 
      String mensaje = String.format("Mi nombre es %s y mi apellido es %s y tengo %d años", n , a, e);
        System.out.println(mensaje);
    }
}
      
 
          
          
          
          
          
          
       