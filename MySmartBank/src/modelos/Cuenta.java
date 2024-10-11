//
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// 

package modelos;
import modelos.TipoCuenta;

/// 
/// @author josel
/// 

public class Cuenta {
    
    /// ------------------------------------------------ ///
    ///       Atributos de Instancia y de la Clase       ///
    /// ------------------------------------------------ ///
    
    // Atributos de Clase
    private static String ICONOCUENTABANCARIA = "/img/cuentalogo.png";
    private static int numeroCuentasBancariasTotales = 0;
    private static double saldoTotal = 0;
    private static double interesesRecibidosBanco = 0;
    private static double TASAINTERESCUENTACORRIENTE = 0.35;
    private static double TASAINTERESCUENTAONLINE = 0.20;
    private static double TASAINTERESCUENTAREMUNERADA = -0.15;

    // Atributos de Instancia
    private String numeroIdentificacion;
    private TipoCuenta tipoCuentaBancaria;
    private boolean estadoCuenta;
    private String fechaAperturaCuenta;
    private double saldo;
    private double tasaInteresCuenta;

    
    /// ------------------------------------------------ ///
    ///            Constructores de la Clase             ///
    /// ------------------------------------------------ ///
    
    // Constructor Paramétrico
    public Cuenta(String numeroIdentificacion, TipoCuenta tipoCuentaBancaria, boolean estadoCuenta, String fechaAperturaCuenta, double saldo){
        // Asignación de los parámetros a las variables.
        if(numeroIdentificacion.length() >= 1 && numeroIdentificacion.length() <= 10){
            this.numeroIdentificacion = "ES25 4769 7891 36 " + numeroIdentificacion;
        }

        this.tipoCuentaBancaria = tipoCuentaBancaria;
        
        this.estadoCuenta = estadoCuenta;
        
        if(fechaAperturaCuenta.length() >= 1 && fechaAperturaCuenta.length() <= 10){
            this.fechaAperturaCuenta = fechaAperturaCuenta;
        }
        
        if(saldo >= 0){
            this.saldo = saldo;
        }
        
        // Operaciones tras la asignación de parámetros.
        numeroCuentasBancariasTotales++;
        saldoTotal += saldo;
        if(tipoCuentaBancaria == TipoCuenta.CORRIENTE){
            tasaInteresCuenta = TASAINTERESCUENTACORRIENTE;
        }
        else if(tipoCuentaBancaria == TipoCuenta.ONLINE){
            tasaInteresCuenta = TASAINTERESCUENTAONLINE;
        }
        else if(tipoCuentaBancaria == TipoCuenta.REMUNERADA){
            tasaInteresCuenta = TASAINTERESCUENTAREMUNERADA;
        }
        else{
            tasaInteresCuenta = 0;
        }
        
    }

    // Constructor Vacío
    public Cuenta(){
        this("0", TipoCuenta.POR_DETERMINAR, false, "Hoy", 0);
    }

    // Constructor Copia
    public Cuenta(Cuenta copia){
        this(copia.numeroIdentificacion, copia.tipoCuentaBancaria, copia.estadoCuenta, copia.fechaAperturaCuenta, copia.saldo);
    }
    
    /// ------------------------------------------------ ///
    ///               Métodos de la Clase                ///
    /// ------------------------------------------------ ///

    //Setters
    public void setNumeroIdentificacion(String numeroIdentificacion){
        if(numeroIdentificacion.length() >= 1 && numeroIdentificacion.length() <= 10){
            this.numeroIdentificacion = "ES25 4769 7891 36 " + numeroIdentificacion;
            System.out.println("El numero de cuenta ha sido creado de forma correcta.");
        }
        else{
            System.out.println("El numero de cuenta que desea ingresar es incorrecto. Tenga en cuenta que debe tener entre 1 y 10 digitos.");
        }
    }
    public void setTipoCuentaBancaria(TipoCuenta tipoCuentaBancaria){
        this.tipoCuentaBancaria = tipoCuentaBancaria;
        if(tipoCuentaBancaria == TipoCuenta.CORRIENTE){
            tasaInteresCuenta = TASAINTERESCUENTACORRIENTE;
        }
        else if(tipoCuentaBancaria == TipoCuenta.ONLINE){
            tasaInteresCuenta = TASAINTERESCUENTAONLINE;
        }
        else if(tipoCuentaBancaria == TipoCuenta.REMUNERADA){
            tasaInteresCuenta = TASAINTERESCUENTAREMUNERADA;
        }
        else{
            tasaInteresCuenta = 0;
        }
        
    }
    public void setEstadoCuenta(boolean estadoCuenta){
        if(estadoCuenta == true){
            this.estadoCuenta = true;
            System.out.println("La cuenta esta activada.");
        }
        else if (estadoCuenta == false){
            this.estadoCuenta = false;
            System.out.println("La cuenta esta desactivada.");
        } 
        else{
            System.out.println("El estado de cuenta introducido es incorrecto. ");
        }
    }
    public void setFechaAperturaCuenta(String fechaAperturaCuenta){
        if(fechaAperturaCuenta.length() == 10){
            this.fechaAperturaCuenta = fechaAperturaCuenta;
        }
        else{
            System.out.println("La fecha introducida se encuentra en el formato incorrecto.");
        }
        
    }
    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }
        else{
            System.out.println("No esta permitido abrir una cuenta bancaria teniendo deudas o un saldo inferior a cero.");
        };
    }
    
    //Getters
    public String getNumeroIdentificacion(){
        return numeroIdentificacion;
    }
    public TipoCuenta getTipoCuentaBancaria(){
        return tipoCuentaBancaria;
    }
    public boolean getEstadoCuenta(){
        return estadoCuenta;
    }
    public String getFechaAperturaCuenta(){
        return fechaAperturaCuenta;
    }
    public double getSaldo(){
        return saldo;
    }

    // Método toString
    public String toString() {
        return "Cuenta{" +
                "numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", tipoCuentaBancaria='" + tipoCuentaBancaria + '\'' +
                ", estadoCuenta=" + estadoCuenta +
                ", fechaAperturaCuenta=" + fechaAperturaCuenta +
                ", saldo=" + saldo +
                '}';
    }
    
    // Otros Métodos
     
}
