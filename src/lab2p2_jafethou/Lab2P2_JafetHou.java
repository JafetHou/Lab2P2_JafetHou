
package lab2p2_jafethou;

import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab2P2_JafetHou {

   static Scanner lea = new Scanner (System.in);
   static Scanner leer = new Scanner (System.in);
   static Scanner scanner = new Scanner (System.in);
   public static int tipo = 0;
   
    public static void main(String[] args) throws ParseException {
        
        ArrayList <accesso> usuario  = new ArrayList();
        ArrayList <Object> biblioteca  = new ArrayList();
        
        usuario.add(new accesso("hou","Hou1975",1));
        usuario.add(new accesso("profe","profex10",2));
        usuario.add(new accesso("jose","contra1234",3));
        
        boolean seguir = true;
        
        int TipoUsuario = login(usuario,tipo);
        
        while(seguir){
        
            switch(TipoUsuario){

                case 0:{

                    System.out.println("Usuario o Contrasenia incorrecta");
                    TipoUsuario = login(usuario, tipo);

                    break;
                }
                case 1:{

                    System.out.println("--Menu de Estudiante--");
                    System.out.println("1) Listar Recursos");
                    System.out.println("2) Cerrar sesion");
                    System.out.println("3) salir");
                    
                    int opcion = lea.nextInt();
                    
                    if(opcion == 1){
                        
                        listar(biblioteca);
                        
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
                            
                            listar(biblioteca);
                            
                            break;
                        }
                        case 2:{
                            
                            crear(biblioteca);
                            
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
                    
                    System.out.println("--Menu de bibliotecario--");
                    System.out.println("1) Listar Recursos");
                    System.out.println("2) Crear Recursos");
                    System.out.println("3) Eliminar Recurso");
                    System.out.println("4) Modificar Recurso");
                    System.out.println("5) Cerrar sesion");
                    System.out.println("Ingrese [6] para salir");
                    int opcion = lea.nextInt();
                    
                    switch(opcion){
                        
                        case 1:{
                            listar(biblioteca);
                            break;
                        }
                        case 2:{
                            crear(biblioteca);
                            break;
                        }
                        case 3:{
                            
                            break;
                        }
                        case 4:{
                            
                            break;
                        }
                        case 5:{
                            TipoUsuario = login(usuario,tipo);
                            break;
                        }
                        case 6:{
                            seguir = false;
                            break;
                        }
                        
                    }
                    
                    break;
                }
            }
        }    
        
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
        
        return tipo;
    }
    public static void crear(ArrayList <Object> biblioteca){
        System.out.println("Ingrese el recurso a crear: ");
        System.out.println("1) Libro");
        System.out.println("2) Articulos");
        System.out.println("3) Cursos en linea");
        System.out.println("4) Conferencias Virtuales");
        
        int opc = lea.nextInt();
        
        switch(opc){
            case 1:{
                
                System.out.println("Ingrese el titulo: ");
                String titulo = scanner.nextLine();
                
                System.out.println("Ingrese autor: ");
                String autor = scanner.nextLine();
                
                System.out.println("Ingrese genero del libro: ");
                String genero = scanner.nextLine();
                
                System.out.println("Ingrese anio de publicacion: ");
                int anio = lea.nextInt();
                
                biblioteca.add((Libro) new Libro(titulo, autor, genero, anio, "si"));
                
                break;
            }
            case 2:{
                
                System.out.println("Ingrese el titulo: ");
                String titulo = leer.nextLine();
                
                System.out.println("Ingrese autor: ");
                String autor = scanner.nextLine();
                
                System.out.println("Ingrese tema del articulo: ");
                String tema = leer.nextLine();
                
                System.out.println("Ingrese la fecha de publicacion: ");
                String fecha = lea.nextLine();
                
                biblioteca.add((Articulo) new Articulo(titulo, autor, tema, fecha, "si"));
                
                break;
            }
            case 3:{
                
                System.out.println("Ingrese el titulo: ");
                String titulo = leer.nextLine();
                
                System.out.println("Ingrese el instructor: ");
                String instructor = scanner.nextLine();
                
                System.out.println("Ingrese la duracion en semanas: ");
                int semanas = leer.nextInt();
                
                System.out.println("Ingrese la plataforma de ensenanza: ");
                String plataforma = lea.nextLine();
                
                biblioteca.add((Cursos) new Cursos(titulo, instructor, semanas, plataforma));
                
                break;
            }
            case 4:{
                
                System.out.println("Ingrese el titulo: ");
                String titulo = leer.nextLine();
                
                System.out.println("Ingrese el conferensista: ");
                String conferensista = scanner.nextLine();
                
                System.out.println("Ingrese la fecha de conferencia: ");
                String fecha = leer.nextLine();
                
                System.out.println("Ingrese la duracion: ");
                String duracion = scanner.nextLine();
                
                System.out.println("Ingrese el enlace de accesso: ");
                String enlace = lea.nextLine();
                
                biblioteca.add((Conferencia) new Conferencia(titulo, conferensista, fecha, duracion, enlace));
                
                break;
            }
        }
    }
    public static void listar(ArrayList <Object> biblioteca){
        
        for (Object s : biblioteca) {
            
            System.out.println(s.toString());
            
        }
        
    }
    
    
}
