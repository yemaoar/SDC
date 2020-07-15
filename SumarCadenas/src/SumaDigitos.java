
import java.util.Scanner;
import java.util.ArrayList;


public class SumaDigitos {

    
    public static void main(String[] args) {
   
        
        ArrayList<String> numeros;
        numeros = new ArrayList<>();
        
     
        Scanner scanner = new Scanner(System.in);
        
      
        String numero = scanner.next();
                 
      
        while (! numero.equals("-1")) {  
            
           
            numeros.add(numero);
            
           
             numero = scanner.next();
        }
        
     
        for (int i = 0; i < numeros.size(); i++) {
            sumaDeNumero(numeros.get(i));
        }     
        
        
    }
    
    
    private static void sumaDeNumero(String numero) {
        
        if(Integer.parseInt(numero) > 0 && 
           Integer.parseInt(numero) < Math.pow(10, 9)){
        
       
        int suma = 0;
        
      
        String resultado = "";
        
        for (int i = 0; i < numero.length(); i++) {
            
        
            suma += Character.getNumericValue(numero.charAt(i));
    
            if (i == numero.length() - 1) {
                resultado += numero.charAt(i) + " = ";
            } else{
              
                resultado += numero.charAt(i) + " + ";
            }                
            
        }
       
        resultado += suma;
        
        
    
        System.out.println(resultado);
        
        }
    }
    
}         
    