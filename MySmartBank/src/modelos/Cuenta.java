/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/*
 * @author josel
*/

public class Cuenta {
    
    /// ------------------------------------------------ ///
    ///       Atributos de Instancia y de la Clase       ///
    /// ------------------------------------------------ ///
    
    // Atributos de Instancia
    private static int numeroCuentasBancarias = 0;
    private static double saldoTotal = 0;
    private static double interesesRecibidos = 0;
    private static double tasaInteresCuentaCorriente = 0.35;
    private static double tasaInteresCuentaOnline = 0.20;
    private static double tasaInteresCuentaRemunerada = -0.15;
    
    // Atributos de la Clase
    private String numeroIdentificacion;
    private String nombreTitular;
    private int saldo;
    private String tipoCuenta;
    private String fechaAperturaCuenta;
    private boolean estadoCuenta;

    
    /// ------------------------------------------------ ///
    ///            Constructores de la Clase             ///
    /// ------------------------------------------------ ///
    
    // Constructor Paramétrico
    public Cuenta(String numeroIdentificacion, String nombreTitular, int saldo, String tipoCuenta, String fechaAperturaCuenta, boolean estadoCuenta){
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.fechaAperturaCuenta = fechaAperturaCuenta;
        this.estadoCuenta = estadoCuenta;
        numeroCuentasBancarias++;
        saldoTotal += saldo;
        
    }
    
    // Constructor Vacío
    public Cuenta(){
        this("NONE", "NONE", 0, "NONE", "NONE", false);
    }
    
    // Constructor Copia
    public Cuenta(Cuenta copia){
        this(copia.numeroIdentificacion, copia.nombreTitular, copia.saldo, copia.tipoCuenta, copia.fechaAperturaCuenta, copia.estadoCuenta);
    }
    
    /// ------------------------------------------------ ///
    ///               Métodos de la Clase                ///
    /// ------------------------------------------------ ///

    //Setters
    public void setNumeroIdentificacion(String numeroIdentificacion){
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public void setNombreTitular(String nombreTitular){
        this.nombreTitular = nombreTitular;
    }
    public void setSaldo(int saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }
        else{
            System.out.println("El saldo no puede ser negativo.");
        }
    }
    public void setTipoCuenta(String tipoCuenta){
        if(tipoCuenta.equals("Corriente") || tipoCuenta.equals("Online") || tipoCuenta.equals("Remunerada")){
            this.tipoCuenta = tipoCuenta;
        }
        else{
            System.out.println("El tipo de cuenta no es correcto.");
        }
    }
    public void setfechaAperturaCuenta(String fechaAperturaCuenta){
        this.fechaAperturaCuenta = fechaAperturaCuenta;
    }
    public void setEstadoCuenta(boolean estadoCuenta){
        this.estadoCuenta = estadoCuenta;
    }
    
    //Getters
    public String getNumeroIdentificacion(){
        return numeroIdentificacion;
    }
    public String getNombreTitular(){
        return nombreTitular;
    }
    public int getSaldo(){
        return saldo;
    }
    public String getTipoCuenta(){
        return tipoCuenta;
    }
    public String getfechaAperturaCuenta(){
        return fechaAperturaCuenta;
    }
    public boolean getEstadoCuenta(){
        return estadoCuenta;
    }

    //Otros Métodos
     
}
