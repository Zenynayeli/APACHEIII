
package operadores_atirmeticos;

public class OPERADORES_ATIRMETICOS {
    public static void main(String[] args) {
       int variableUno = 50;
       int variableDos = 20; 
       
       //variableUno =  variableUno + 1;
       variableUno ++;
       System.out.println("Incremento:" +variableUno);
       //Decremento
       //variableDos = variableDos -1;
       variableDos --;
        System.out.println("Decremento:" +variableDos);
         //SUMA
         // int resultadoSuma = VariableDos + VariableUno;
         // System.out.
       int suma = variableUno + variableDos;
       System.out.println("Resultado de la suma: " + suma);
       //Resta
       int resta = variableUno - variableDos;
       System.out.println("Resultado de la resta: " + resta);
      //Division
       int division = variableUno / variableDos;
        System.out.println("Resultado de la division:" + division);

       //Multiplicacion
       int multiplicacion = variableUno * variableDos;
        System.out.println("Resultado de la multiplicacion:" + multiplicacion);
       //Modulo
       int modulo = variableUno % variableDos;
        System.out.println("Resultado del modulo :" + modulo);
       
    }
  }
   


