
package lab2p2_jafethou;

import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab2P2_JafetHou {

   static Scanner lea = new Scanner (System.in);
   static Scanner leer = new Scanner (System.in);
   public static int tipo = 0;
   
    public static void main(String[] args) throws ParseException {
        
        ArrayList <accesso> usuario  = new ArrayList();
        
        usuario.add(new accesso("hou","Hou1975",1));
        usuario.add(new accesso("profe","profex10",2));
        usuario.add(new accesso("jose","contra1234",3));
        
        boolean seguir = true;
        int TipoUsuario = login(usuario,tipo);
        
        while(seguir){
        
            switch(TipoUsuario){

                case 0:{

                    System.out.println("Usuario o Contrasenia incorrecta");
                    login(usuario, tipo);

                    break;
                }
                case 1:{

                    System.out.println("--Menu de Estudiante--");
                    System.out.println("1) Listar Recursos");
                    System.out.println("2) Cerrar sesion");
                    System.out.println("3) salir");
                    
                    int opcion = lea.nextInt();
                    
                    if(opcion == 1){
                        
                    }else if(opcion == 2){
                        
                        TipoUsuario = login(usuario,tipo);
                        
                    }else{
                        seguir = false;
                    }
                    
                    break;
                }
                case 2:{
                    
                    System.out.println("--Menu de Professor--");
                    System.out.println("1) Listar Recursos");
                    System.out.println("2) Crear Recurso");
                    System.out.println("3) Cerrar sesion");
                    System.out.println("4) salir");
                    
                    int opcion = lea.nextInt();
                    
                    switch(opcion){
                        
                        case 1:{
                            
                            break;
                        }
                        case 2:{
                            
                            break;
                        }
                        case 3:{
                            
                            TipoUsuario = login(usuario,tipo);
                            
                            break;
                        }
                        case 4:{
                            seguir = false;
                            break;
                        }
                    }
                    
                    break;
                }
                case 3:{
                    
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
