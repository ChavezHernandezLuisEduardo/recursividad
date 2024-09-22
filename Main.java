
/**
 Chavez Hernández Luis Eduardo
 */
import java.util.Scanner;
public class Main
{
    public static void main(String args[]){
//objetos instanciados    
    Factorial objeto= new Factorial();
    Scanner Luis=  new Scanner(System.in);
    //impresion del dato
    System.out.println("numero al que se va sacar factorial:");
    System.out.println("factorial total "+objeto.recursivo(Luis.nextInt()));
        
    }
}