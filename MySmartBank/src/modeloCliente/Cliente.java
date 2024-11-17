/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modeloCliente;
import java.time.LocalDate;

import java.util.ArrayList;
import modeloCuenta.Cuenta;

/**
 * @author josel
 * @version 1.0 (Update: 01.11.2024)
 * @brief Clase Cliente.
 *  
*/

public class Cliente {
    
    /// ------------------------------------------------ ///
    ///       Atributos de Instancia y de la Clase       ///
    /// ------------------------------------------------ ///
    
    // Atributos de Clase
        /** Icono del Cliente. Deberá de ser una dirección de memoria en la que se encuentre almacenada y/o guardado un logotipo generalizado del cliente. */
        private static final String ICONOCLIENTE = "/img/clientelogo.png";
        /** Numero de Clientes. Indicador que contará todos y cada uno de los clientes existentes. */
        private static int numeroClientes = 0;
        /** Dinero Total Gestionado. Dinero total que es gestionado por la aplicacion. */
        private static double dineroGestionado = 0;
        /** */
        private static int numeroMaximoCuentasPorCliente;
        
    // Atributos de Instancia
        private ArrayList<Cuenta> listadoCuentasdelCliente = new ArrayList<>();
        private String documentoNacionalIdentidad;
        private String nombreCompletoCliente;
        private GenerosClientes generoCliente;
        private LocalDate fechaNacimiento;
        private int edadActual;
        private String nacionalidadPrincipal;
        private EstadoCivil estadoCivilCliente;
        private String ocupacionActual;
        private double salarioActual;
        private String direccionDomicilio;
        private int numeroTelefonico;
        private String correoElectronico;
        private String lugarNacimiento;
        private int cantidadCuentaBancariaCliente;
        private double saldoTotalCliente;
    
    /// ------------------------------------------------ ///
    ///            Constructores de la Clase             ///
    /// ------------------------------------------------ ///
    
    /** Constructor Paramétrico. Crea un objeto previa inserción de todos los parámetros o atributos requeridos para poder realizar todo el proceso de creación.*/
    public Cliente(String documentoNacionalIdentidad, String nombreCompletoCliente, GenerosClientes generoCliente, LocalDate fechaNacimiento, String nacionalidadPrincipal, EstadoCivil estadoCivilCliente, String ocupacionActual, double salarioActual, String direccionDomicilio, int numeroTelefonico, String correoElectronico, String lugarNacimiento, int cantidadCuentaBancariaCliente, double saldoTotalCliente){
        this.documentoNacionalIdentidad = documentoNacionalIdentidad;
        this.nombreCompletoCliente = nombreCompletoCliente;
        this.generoCliente = generoCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.edadActual = 2024 - fechaNacimiento.getYear();
        this.nacionalidadPrincipal = nacionalidadPrincipal;
        this.estadoCivilCliente = estadoCivilCliente;
        this.ocupacionActual = ocupacionActual;
        this.salarioActual = salarioActual;
        this.direccionDomicilio = direccionDomicilio;
        this.numeroTelefonico = numeroTelefonico;
        this.correoElectronico = correoElectronico;
        this.lugarNacimiento = lugarNacimiento;
        this.cantidadCuentaBancariaCliente = cantidadCuentaBancariaCliente;
        this.saldoTotalCliente = saldoTotalCliente;      
    }
            
    /** Constructor Vacío. Crea un objeto estableciéndole valores por defecto, no requiere de la introducción de ningún parámetro.*/
    public Cliente (){
        this(null);
    }
    
    /** Constructor Copia. Crea una copia de un objeto Cuenta, es decir, crea un objeto con los mismos valores que el objeto que se toma como plantilla. */
    public Cliente(Cliente copiaCliente){
        this(copiaCliente.documentoNacionalIdentidad, copiaCliente.nombreCompletoCliente, copiaCliente.generoCliente, copiaCliente.fechaNacimiento, copiaCliente.nacionalidadPrincipal, copiaCliente.estadoCivilCliente, copiaCliente.ocupacionActual, copiaCliente.salarioActual, copiaCliente.direccionDomicilio, copiaCliente.numeroTelefonico, copiaCliente.correoElectronico, copiaCliente.lugarNacimiento, copiaCliente.cantidadCuentaBancariaCliente, copiaCliente.saldoTotalCliente);
    }
    
    /// ------------------------------------------------ ///
    ///               Métodos de la Clase                ///
    /// ------------------------------------------------ ///

    //Setters
    public void setDocumentoNacionalIdentidad(String documentoNacionalIdentidad){
        this.documentoNacionalIdentidad = documentoNacionalIdentidad;
    }
    public void setNombreCompleto(String nombreCompletoCliente){
        this.nombreCompletoCliente = nombreCompletoCliente;
    }
    public void setGeneroCliente(GenerosClientes generoCliente){
        this.generoCliente = generoCliente;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setNacionalidadPrincipal(String nacionalidadPrincipal){
        this.nacionalidadPrincipal = nacionalidadPrincipal;
    }
    public void setEstadoCivil(EstadoCivil estadoCivilCliente){
        this.estadoCivilCliente = estadoCivilCliente;
    }
    public void setOcupacionActual(String ocupacionActual){
        this.ocupacionActual = ocupacionActual;
    }
    public void setSalarioActual(double salarioActual){
        this.salarioActual = salarioActual;
    }
    public void setDireccionDomicilio(String direccionDomicilio){
        this.direccionDomicilio = direccionDomicilio;
    }
    public void setNumeroTelefonico(int numeroTelefonico){
        this.numeroTelefonico = numeroTelefonico;
    }
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    public void setLugarNacimiento(String lugarNacimiento){
        this.lugarNacimiento = lugarNacimiento;
    }
            
    //Getters
    public String getDocumentoNacionalIdentidad(){
        return documentoNacionalIdentidad;
    }
    public String getNombreCompleto(){
        return nombreCompletoCliente;
    }
    public GenerosClientes getGeneroCliente(){
        return generoCliente;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    public String getNacionalidadPrincipal(){
        return nacionalidadPrincipal;
    }
    public EstadoCivil getEstadoCivil(){
        return estadoCivilCliente;
    }
    public String getOcupacionActual(){
        return ocupacionActual;
    }
    public double getSalarioActual(){
        return salarioActual;
    }
    public String getDireccionDomicilio(){
        return direccionDomicilio;
    }
    public int getNumeroTelefonico(){
        return numeroTelefonico;
    }
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    public String getLugarNacimiento(){
        return lugarNacimiento;
    }
    
    // Método toString
    @Override
    public String toString(){
        return "Cliente{" + '}';
    }   
    
    // Otros Métodos
    public void createNewCliente(){
        
    }
    public void modifyCliente(){
        
    }
    public boolean checkCliente(){
        if(true){
            return true;
        }
        else{
            return false;
        }
    }
    
}
