//
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// 

package modelos;
import java.util.Date;

/**
 * @author josel
 */ 

public class Cuenta {
    
    /// ------------------------------------------------ ///
    ///       Atributos de Instancia y de la Clase       ///
    /// ------------------------------------------------ ///
    
    // Atributos de Clase
        /** Icono de la Cuenta Bancaria. Deberá de ser una dirección de memoria en la que se tenga almacenada un logotipo para determinar todas las cuentas. */
        private static final String ICONOCUENTABANCARIA = "/img/cuentalogo.png";
        /** Número de Cuentas Bancarias de la Aplicacion. Es el número total de objetos Cuenta que se encuentran en nuestro programa. */
        private static int numeroCuentasBancariasTotales = 0;
        /** Saldo Total de todas las Cuentas Bancarias. Número total de dinero que estamos gestionando en el programa, siendo de diferentes cuentas y/o personas. */
        private static double saldoTotal = 0;
        /** Intereses Recibidos del Banco por parte de las Cuentas. Ingresos totales tras el cobro de los intereses por parte del banco. Hay que tener en cuenta que estos cobros son automáticos y no dependerán del cliente. */
        private static double interesesRecibidosBanco = 0;
        /** Tasa de Interes de la Cuenta Corriente. Porcentaje preestablecido de cobro por tener una cuenta corriente, preestablecido del 0.175. */
        private static final double TASAINTERESCUENTACORRIENTE = 0.175;
        /** Tasa de Interes de la Cuenta Online. Porcentaje preestablecido de cobro por tener una cuenta online, preestablecido del 0.125. */
        private static final double TASAINTERESCUENTAONLINE = 0.125;
        /** Tasa de Interes de la Cuenta Remunerada. Porcentaje preestablecido de cobro por tener una cuenta remunerada, preestablecido del -0.15. */
        private static final double TASAINTERESCUENTAREMUNERADA = -0.15;

    // Atributos de Instancia
        /** Numero de Identificación Completo de la Cuenta. Es el número de la Cuenta Bancaria, esta se encuentra en el siguiente formato: "ES25 4769 7891 36 " + numeroIdentificacionParcial. */
        private String numeroIdentificacionCompleto = "ES25 4769 7891 36 ";
        /** Numero de Identificación Parcial de la Cuenta. Son 10 dígitos numéricos en los que finaliza el número de cuenta. */
        private String numeroIdentificacionParcial;
        /** Tipo de Cuenta Bancaria. Es uno de los tipos preestablecidos de Cuentas bancarias, determinado por el archivo TipoCuenta.java del mismo modelo. */
        private TipoCuenta tipoCuentaBancaria;
        /** Estado de la Cuenta Bancaria. Indica el estado de la cuenta, únicamente determinará si se encuentra disponible(1) o no disponible (0). */
        private boolean estadoCuenta;
        /** Fecha de Apertura. [POR DETERMINAR]. */
        private Date fechaAperturaCuenta;
        /** Saldo de la Cuenta. Indica el saldo que tiene la propia cuenta, cabe destacar que cada cuenta tendrá su saldo y puede ser diferente en cada una de las cuentas. */
        private double saldo;
        /** Tasa de Interés de la Cuenta. Es la tasa de interés que tiene, depende del tipo de la cuenta y se realiza de forma automática. */
        private double tasaInteresCuenta;
        /** Indicador Ingreso Salario. Indicará si se realiza el ingreso del salario en esta cuenta o no, debemos tener en cuenta que solo puede haber una cuenta en la que se realice el ingreso del salario. */
        private boolean indicadorIngresoSalario;
    
    /// ------------------------------------------------ ///
    ///            Constructores de la Clase             ///
    /// ------------------------------------------------ ///
    
    /** Constructor Paramétrico. Crea un objeto previa inserción de todos los parámetros o atributos requeridos para poder realizar todo el proceso de creación.*/
    public Cuenta(String numeroIdentificacionParcial, TipoCuenta tipoCuentaBancaria, boolean estadoCuenta, Date fechaAperturaCuenta, double saldo, boolean indicadorIngresoSalario){
        if(numeroIdentificacionParcial.length() == 10){
            this.numeroIdentificacionParcial = numeroIdentificacionParcial;
            this.numeroIdentificacionCompleto = "ES25 4769 7891 36 " + numeroIdentificacionParcial;
        }
        if(tipoCuentaBancaria == TipoCuenta.CORRIENTE){
            this.tipoCuentaBancaria = tipoCuentaBancaria;
            this.tasaInteresCuenta = TASAINTERESCUENTACORRIENTE;
        }
        else if(tipoCuentaBancaria == TipoCuenta.ONLINE){
            this.tipoCuentaBancaria = tipoCuentaBancaria;
            this.tasaInteresCuenta = TASAINTERESCUENTAONLINE;
        }
        else if(tipoCuentaBancaria == TipoCuenta.POR_DETERMINAR){
            this.tipoCuentaBancaria = tipoCuentaBancaria;
            this.tasaInteresCuenta = 0;
        }
        else if(tipoCuentaBancaria == TipoCuenta.REMUNERADA){
            this.tipoCuentaBancaria = tipoCuentaBancaria;
            this.tasaInteresCuenta = TASAINTERESCUENTAREMUNERADA;
        }
        this.estadoCuenta = estadoCuenta;
        this.fechaAperturaCuenta = fechaAperturaCuenta;
        this.saldo = saldo;
        this.saldoTotal +=+ saldo;
        if(true/*comprobar que no se encuentra activo en otro*/){
           this.indicadorIngresoSalario = indicadorIngresoSalario;
        }
        numeroCuentasBancariasTotales++;
    }
            
    /** Constructor Vacío. Crea un objeto estableciéndole valores por defecto, no requiere de la introducción de ningún parámetro.*/
    public Cuenta(){
        this("0000000000", TipoCuenta.POR_DETERMINAR, false, new Date(2024, 12, 31), 0, false);
    }

    /** Constructor Copia. Crea una copia de un objeto Cuenta, es decir, crea un objeto con los mismos valores que el objeto que se toma como plantilla. */
    public Cuenta(Cuenta copia){
        this(copia.numeroIdentificacionParcial, copia.tipoCuentaBancaria, copia.estadoCuenta, copia.fechaAperturaCuenta, copia.saldo, copia.indicadorIngresoSalario);
    }
    
    /// ------------------------------------------------ ///
    ///               Métodos de la Clase                ///
    /// ------------------------------------------------ ///

    //Setters
    public void setNumeroIdentificacionCompleto(String numeroIdentificacionParcial){
        if(numeroIdentificacionParcial.length() == 10){
            this.numeroIdentificacionParcial = numeroIdentificacionParcial;
            this.numeroIdentificacionCompleto += numeroIdentificacionCompleto;
        }
        else{
            this.numeroIdentificacionParcial = numeroIdentificacionParcial;
            this.numeroIdentificacionCompleto = "0000000000";
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
        this.estadoCuenta = estadoCuenta;
    }
    public void setFechaAperturaCuenta(Date fechaAperturaCuenta){
        this.fechaAperturaCuenta = fechaAperturaCuenta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    //Getters
    public String getNumeroIdentificacionParcial(){
        return numeroIdentificacionParcial;
    }
    public String getNumeroIdentificacionCompleto(){
        return numeroIdentificacionCompleto;
    }
    public TipoCuenta getTipoCuentaBancaria(){
        return tipoCuentaBancaria;
    }
    public boolean getEstadoCuenta(){
        return estadoCuenta;
    }
    public Date getFechaAperturaCuenta(){
        return fechaAperturaCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public double getTasaInteresCuenta(){
        return tasaInteresCuenta;
    }
    public boolean getIndicadorIngresoSalario(){
        return indicadorIngresoSalario;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Cuenta{" + "numeroIdentificacionCompleto='" + numeroIdentificacionCompleto + '\'' + ", numeroIdentificacionParcial='" + numeroIdentificacionParcial + '\'' + ", tipoCuentaBancaria=" + tipoCuentaBancaria + '\'' + ", estadoCuenta=" + estadoCuenta + '\'' + ", fechaAperturaCuenta=" + fechaAperturaCuenta + '\'' + ", saldo=" + saldo + '\'' + ", tasaInteresesCuenta=" + tasaInteresCuenta + '\'' + ", indicadorIngresoSalario=" + indicadorIngresoSalario + '}';
    }
    
    // Otros Métodos
    
}
