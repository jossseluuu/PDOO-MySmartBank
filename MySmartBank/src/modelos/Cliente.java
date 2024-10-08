/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/*
 * @author josel
*/

public class Cliente{
    
    // Atributos
    private int numeroIdentificacionCliente;
    private String documentoNacionaldeIdentidad;
    private String nombreCompleto;
    private String genero;
    private String fechaNacimiento;    
    private int edadActual;
    private enum nacionalidadPrincipal{España, Francia, Portugal, Italia, Otro};
    private enum estadoCivil{Soltero, Casado, Divorciado, Viudo, Otro};
    private String ocupacionActual;
    private String direcciónDomicilio;
    private int numeroTelefono;
    private String correoElectronico;
    private String lugarNacimiento;
    public int numeroCuentasBancarias;
    public int numeroTarjetas;
    public int numeroTarjetasVirtuales;
    public int numeroTarjetasFisicas;
    
    //Constructores
    public Cliente(int numeroIdentificacionCliente, String documentoNacionaldeIdentidad, String nombreCompleto, String genero, String fechaNacimiento, int edadActual){
        this.numeroIdentificacionCliente = numeroIdentificacionCliente;
        this.documentoNacionaldeIdentidad = documentoNacionaldeIdentidad;
        this.nombreCompleto = nombreCompleto;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.edadActual = edadActual;
    }
    public Cliente(){
        this(numeroIdentificacionCliente, documentoNacionaldeIdentidad, nombreCompleto, genero);
    }
    public Cliente(Cliente otro){
        this(otro.numeroIdentificacionCliente, otro.documentoNacionaldeIdentidad, otro.nombreCompleto, otro.genero);
    }
    //Getters y Setters
    
    //Otros Métodos
    
}
