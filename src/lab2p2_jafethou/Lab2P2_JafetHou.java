
package lab2p2_jafethou;

import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab2P2_JafetHou {

   static Scanner lea = new Scanner (System.in);
   static Scanner leer = new Scanner (System.in);
   
    public static void main(String[] args) throws ParseException {
        
        ArrayList <accesso> usuario  = new ArrayList();
        
        usuario.add(new accesso("hou","Hou1975",1));
        usuario.add(new accesso("xirui","profex10",2));
        usuario.add(new accesso("papa","contra1234",3));
        
        int tipo = 0;
        login(usuario,tipo);
        
        boolean seguir = true;
        
        while(seguir){
        
            switch(tipo){

                case 0:{

                    System.out.println("Usuario o Contrasenia incorrecta");
                    login(usuario, tipo);

                    break;
                }
                case 1:{

                    System.out.println("funsiona");
                    break;
                }
            }
        }    
        
        /*boolean seguir = true;
        
        while(seguir){
            
            System.out.println("--Menu--");
            System.out.println("1) Listar Recursos");
            System.out.println("2) Crear Recursos");
            System.out.println("3) Eliminar Recurso");
            System.out.println("4) Modificar Recurso");
            System.out.println("Ingrese [5] para salir");
            
            int opc = lea.nextInt();
            
            switch(opc){
                
                case 1:{
                    
                    break;
                }
                
                case 2:{
                    
                    
                    break;
                }
                
                
                
                
                case 5:{
                    seguir = false;
                    break;
                }
                
            }
            
        }*/
        
    }
    public static int login(ArrayList <accesso> usuario, int tipo) throws ParseException{
        
        System.out.println("Ingrese su usuario: ");
        String user = leer.next();
        
        System.out.println("Ingrese su contrasenia: ");
        String contra = leer.next();
        
        for (accesso k : usuario) {
            if(user.equals(k.getUser())){
                if(contra.equals(k.getContra())){
                    tipo = k.getTipo();
                }
            }
        }
        System.out.println(tipo);
        return tipo;
    }
    
}
