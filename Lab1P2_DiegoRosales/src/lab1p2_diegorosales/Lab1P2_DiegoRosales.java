
package lab1p2_diegorosales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab1P2_DiegoRosales {
    
public static Scanner mcgregor = new Scanner(System.in);
public static Scanner mcgregorString = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        ArrayList<Usuarios> usuariosLista = new ArrayList<>();
        
        int a=1;
        
        while(a==1){
            System.out.println("1. Registro de Usuario");
            System.out.println("2. Salir");
            int b=1;
            
            int opcionmenu1 = mcgregor.nextInt();
            
            if(opcionmenu1==1){
                
                while(b==1){
                System.out.println("1. Iniciar sesion");
                System.out.println("2. Ver lista ");
                System.out.println("3. Ver lista sorteada por dominios");
                System.out.println("4. Volver a la pagina de inicio");
                int opcionmenu2 = mcgregor.nextInt();
                
                if(opcionmenu2==1){
                    // parte completada
            System.out.println("Pagina de Inicio de Sesion");
            System.out.println("");
            System.out.println("Ingrese su nombre:");
            String nombreUsuario = mcgregorString.nextLine();
            
            System.out.println("Ingrese su apellido:");
            String apellidoUsuario = mcgregorString.nextLine();
            
            System.out.println(" Ingrese su fecha de nacimient en formato dd/mm/yyyy");
            String nacimientoUsuarioString = mcgregorString.nextLine();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date nacimientoUsuarioDate = df.parse(nacimientoUsuarioString);
            
            if(VerificarEdad(nacimientoUsuarioString)==true){
                //parte pendiente: 
                // dividir en nombre de correo y dominio
            
                
                
            boolean verificacionCorreo =false;
            String nombreCorreo="";
            String dominio = "";
            String correoUsuario="";
            while(verificacionCorreo == false){
            int contador=0;
            
            System.out.println("Ingrese su correo: ");
            correoUsuario = mcgregorString.nextLine();
            // Creacion de domino y nombre de correo
            
            
            String separador [] = correoUsuario.split("@");
            nombreCorreo = separador[0];
            dominio = separador [1];
            
           
            if (VerificarNombreCorreoValido(correoUsuario) == true){
                contador++;
                
            }
            if(VerificarDominioCorreoValido(dominio)==true){
                contador++;    
                
            }
            int cont2=0;
                for (int i = 0; i < usuariosLista.size(); i++) {
                    if(usuariosLista.get(i).getNombrecorreo().equals(nombreCorreo)){
                        cont2++;
                                
                    }
                    if(usuariosLista.get(i).getDominio().equals(dominio)){
                                    cont2++;
                                }
                }
                
            
                if(contador==2 && cont2<2){
                verificacionCorreo = true;
                break;
                
            }
                
               
            else{
                    System.out.println("Correo invalido");
            }
            
            }
            
            
            
            
            
            
            // Terminado
            Boolean verificacionContra = false;
            String contrasenaUsuario="";
            while(verificacionContra== false){
              System.out.println("Ingrese su contraseña: ");
                contrasenaUsuario = mcgregorString.nextLine();  
                verificacionContra = VerificarContrasena(contrasenaUsuario);
                
                if(verificacionContra == false ){
                    System.out.println("Error, la contraseña no incluye todos los caracteres solicitados, porfavor re ingrese su contraseña.");
                }
                else{
                    
                }
            }
            
            
           
            String edadExacta = ConseguirEdadExacta(nacimientoUsuarioString);
            Usuarios usuarios = new Usuarios(nombreUsuario, apellidoUsuario, edadExacta, contrasenaUsuario, nombreCorreo, dominio , correoUsuario );
            usuariosLista.add(usuarios);  
            } // fin de la permision de edad
            
            
            else if(VerificarEdad(nacimientoUsuarioString)==false){
                System.out.println("Es menor de 13");
                break;
            } // no permision de edad
            
            
            
            
            
                }// Iniciar sesion
                
                
                
                
                
                
                
                else if(opcionmenu2==2){
                    for (int i = 0; i < usuariosLista.size(); i++) {
                        System.out.println("Nombre: "+usuariosLista.get(i).getNombre() + "Apellido: "+usuariosLista.get(i).getApellido()+"Fecha de nacimiento :"+usuariosLista.get(i).getFecha()+" Correo: "+usuariosLista.get(i).getCorreo() + "Contraseña: "+usuariosLista.get(i).getContrasena());
                    }
                    
                }
                
                else if(opcionmenu2==3){
                    ArrayList<String> gmail = new ArrayList<>();
                    ArrayList<String> outlook = new ArrayList<>();
                    ArrayList<String> yahoo = new ArrayList<>();
                    ArrayList<String> icloud = new ArrayList<>();
                    ArrayList<String> protonmail = new ArrayList<>();
                    ArrayList<String> fastmail = new ArrayList<>();
                    
                    for (int i = 0; i < usuariosLista.size(); i++) {
                        if(usuariosLista.get(i).getDominio().equals("gmail.com")){
                            gmail.add("Nombre: "+usuariosLista.get(i).getNombre() + "Apellido: "+usuariosLista.get(i).getApellido()+"Fecha de nacimiento :"+usuariosLista.get(i).getFecha()+" Correo: "+usuariosLista.get(i).getCorreo() + "Contraseña: "+usuariosLista.get(i).getContrasena());
                        
                        }
                        else if (usuariosLista.get(i).getDominio().equals("outlook.com")){
                            outlook.add("Nombre: "+usuariosLista.get(i).getNombre() + "Apellido: "+usuariosLista.get(i).getApellido()+"Fecha de nacimiento :"+usuariosLista.get(i).getFecha()+" Correo: "+usuariosLista.get(i).getCorreo() + "Contraseña: "+usuariosLista.get(i).getContrasena());
                            
                        }
                        else if (usuariosLista.get(i).getDominio().equals("yahoo.es")){
                            yahoo.add("Nombre: "+usuariosLista.get(i).getNombre() + "Apellido: "+usuariosLista.get(i).getApellido()+" Fecha de nacimiento :"+usuariosLista.get(i).getFecha()+" Correo: "+usuariosLista.get(i).getCorreo() + " Contraseña: "+usuariosLista.get(i).getContrasena());
                            
                        }
                        else if (usuariosLista.get(i).getDominio().equals("icloud.com")){
                            icloud.add("Nombre: "+usuariosLista.get(i).getNombre() + "Apellido: "+usuariosLista.get(i).getApellido()+" Fecha de nacimiento :"+usuariosLista.get(i).getFecha()+" Correo: "+usuariosLista.get(i).getCorreo() + " Contraseña: "+usuariosLista.get(i).getContrasena());
                            
                        }
                        else if (usuariosLista.get(i).getDominio().equals("protonmail.com")){
                            protonmail.add("Nombre: "+usuariosLista.get(i).getNombre() + "Apellido: "+usuariosLista.get(i).getApellido()+" Fecha de nacimiento :"+usuariosLista.get(i).getFecha()+" Correo: "+usuariosLista.get(i).getCorreo() + "Contraseña: "+usuariosLista.get(i).getContrasena());
                            
                        }
                        else if (usuariosLista.get(i).getDominio().equals("fastmail.com")){
                            fastmail.add("Nombre: "+usuariosLista.get(i).getNombre() + "Apellido: "+usuariosLista.get(i).getApellido()+" Fecha de nacimiento :"+usuariosLista.get(i).getFecha()+" Correo: "+usuariosLista.get(i).getCorreo() + "Contraseña: "+usuariosLista.get(i).getContrasena());
                            
                        }
                        
                        
                    }
                    
                    
                    System.out.println("Dominio gmail: ");
                    for (int i = 0; i < gmail.size(); i++) {
                        System.out.println(gmail.get(i));
                    }
                    System.out.println("");
                    System.out.println("Dominio outlook");
                    for (int i = 0; i < outlook.size(); i++) {
                        System.out.println(outlook.get(i));
                    }
                    System.out.println("");
                    System.out.println("Dominio yahoo");
                    for (int i = 0; i < yahoo.size(); i++) {
                        System.out.println(yahoo.get(i));
                    }
                    System.out.println("");
                    System.out.println("Dominio icloud");
                    for (int i = 0; i < icloud.size(); i++) {
                        System.out.println(icloud.get(i));
                    }
                    System.out.println("");
                    System.out.println("Domino protonmail");
                    for (int i = 0; i < protonmail.size(); i++) {
                        System.out.println(protonmail.get(i));
                    }
                    System.out.println("");
                    System.out.println("Dominio fastmail");
                    for (int i = 0; i < fastmail.size(); i++) {
                        System.out.println(fastmail.get(i));
                    }
                    
                    
                    
                    
                }
                else if(opcionmenu2==4){
                    b=4;
                    
                }
                
                }
                
                
                
                
            
            
            } //Fin Opcion 1
            
            else if(opcionmenu1 == 2){
                System.out.println("El programa ha finalizado :( ");
                a=0;
            }
            
            else{
                System.out.println("Error, opcion invalida");
                System.out.println("");
            }
            
        }// Fin While del menu
        
        
        
        
    }
    
    public static String ConseguirEdadExacta(String edad){
        String edadusuario [] = edad.split("/");
        Date fechaactualdate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActualString = df.format(fechaactualdate);
        String fechaActual[] = fechaActualString.split("/");
        
        int año = Integer.parseInt(fechaActual[2])-Integer.parseInt(edadusuario[2]);
        int meses = Integer.parseInt(fechaActual[1])-Integer.parseInt(edadusuario[1]);
        int dias = Integer.parseInt(fechaActual[0])-Integer.parseInt(edadusuario[0]);
        
        
        String fechaFinal = "";
        fechaFinal += año +": Años "+meses+": Meses y "+dias+": dias.";
        
       return fechaFinal;
        
    }
    public static boolean VerificarEdad(String edad) {
        String edadusuario[] = edad.split("/");

        Date fechaActualDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActualString = df.format(fechaActualDate);
        String fechaActual[] = fechaActualString.split("/");
        boolean mes = false;
        
        if (Integer.parseInt(edadusuario[2]) < (Integer.parseInt(fechaActual[2]) - 13)) {
            
            return true;
            
        } 
        else if (Integer.parseInt(edadusuario[1]) < (Integer.parseInt(fechaActual[1]) )){
            mes = true;
           
            return true;
                
        } 
        else if (Integer.parseInt(edadusuario[0]) <= Integer.parseInt(fechaActual[0]) ) {
          
                return true;
            
        }
        
       else {
            return false;

        }

    }
    
    public static boolean VerificarContrasena(String contrasena){
        String regex = "^[a-zA-Z0-9._%&$+-?<>!]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contrasena);
        return matcher.matches();
    }
    
    public static boolean VerificarNombreCorreoValido(String usname){
        String regex = "^[a-zA-Z0-9._%&$+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(usname);
        return matcher.matches();
    }
    
    public static boolean VerificarDominioCorreoValido(String dominio){
        int contador=0;
        ArrayList<String> posiblesDominios = new ArrayList<>();
        posiblesDominios.add("gmail.com");
        posiblesDominios.add("yahoo.es");
        posiblesDominios.add("outlook.com");
        posiblesDominios.add("icloud.com");
        posiblesDominios.add("protonmail.com");
        posiblesDominios.add("fastmail.com");
         
        for (int i = 0; i < posiblesDominios.size(); i++) {
            
            if(posiblesDominios.get(i).equals(dominio))   {
                contador++;
            }
            else{
                
            }
            
        }
        
        if(contador ==1){
            return true;
        }
        else {
            System.out.println("Error, dominio invalido");
            return false;
        }
    }
    
    
    } 
