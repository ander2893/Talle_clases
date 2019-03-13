package poo;

import java.util.Scanner;


public class interfaz {
    
    public void inter(){
        operaciones op=new operaciones();
        Scanner lector = new Scanner(System.in);
        String continuar;
        int opcion;
        
        System.out.println("OPERACIONES");
        do{
            System.out.println("Elegir tipo de operación"
                                + "\n1.Operaciones Trigonometricas"
                                + "\n2.Operaciones Algebraicas");
            opcion=lector.nextInt();
             
            switch (opcion){
                case 1:
                    op.OperacionesTrigonometricas();
                    break;
                
                case 2:
                    op.OperacionesAlgebraicas();
                    break;
                    default:
                    System.out.println(opcion+" no es una opcion valida");              
            }
            System.out.println("Desea continuar S/N");
            continuar = lector.next();
            continuar = continuar.toLowerCase();
        }while(continuar.equals("s"));    
    }
}