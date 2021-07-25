
package Main;

import Clases.Usuario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Usuario user = new Usuario();
        
        System.out.println("Ingrese su nombre: ");
        user.setNombre(entrada.nextLine());
        
        System.out.println("Ingrese su apellido: ");
        user.setApellido(entrada.nextLine());
        
        System.out.println("Ingrese su edad: ");
        user.setEdad(Integer.valueOf(entrada.nextLine()));
        
        System.out.println("Ingrese su hobbie: ");
        user.setHobbie(entrada.nextLine());
        
        System.out.println("Ingrese su editor de codigo preferido: ");
        user.setEdCod(entrada.nextLine());
        
        System.out.println("Ingrese su sistema operativo: ");
        user.setSo(entrada.nextLine());
        
        System.out.println(user.toString());
    }
}
