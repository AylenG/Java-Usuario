
package Clases;

public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private String hobbie;
    private String edCod;
    private String so;
    
    // CONTRUCTORES
    public Usuario(String nombre, String apellido, int edad, String hobbie, String edCod, String so) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.hobbie = hobbie;
        this.edCod = edCod;
        this.so = so;
    }

    public Usuario() {
    }
    
    // TOSTRING
    @Override
    public String toString()
    {
        String mensaje = "";
        
        mensaje += "Nombre: "+this.nombre+"\n";
        mensaje += "Apellido: "+this.apellido+"\n";
        mensaje += "Edad: "+this.edad+"\n";
        mensaje += "Hobbie: "+this.hobbie+"\n";
        mensaje += "Editor de código preferido: "+this.edCod+"\n";
        mensaje += "Sistema Operativo: "+this.so+"\n";

        return mensaje;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getEdCod() {
        return edCod;
    }

    public void setEdCod(String edCod) {
        this.edCod = edCod;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }
    
    
}
