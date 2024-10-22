/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.time.LocalDate;

/**
 * @author josel
 * @version 1.0 (Update: 21.10.2024[NO TERMINADA LA UPDATE])
 */ 

public class TarjetaVirtual {
    
    /// ------------------------------------------------ ///
    ///       Atributos de Instancia y de la Clase       ///
    /// ------------------------------------------------ ///
    
    // Atributos de Clase
        /** Icono de la Tarjeta Virtual. Será el icono por defecto de todas las tarjetas virtuales de una tarjeta. No hay imagenes concretas para cada una de las cuentas. */
        private static final String ICONOTARJETAVIRTUAL = "/img/tarjetavirtuallogo.png";
        /** Numero de Tarjetas. Es el número de este tipo de tarjetas que existen. */
        private static int numeroTarjetasVirtuales = 0;

    // Atributos de Instancia
        /** Indicador de si el CVV es dinámico. Si el indicador es verdadero, cada movimiento realizado producirá un cambio en el CVV de la clase Tarjeta */
        private boolean dinamicoCVV;
        /** Indicador de Expiración Temporal de la Tarjeta. */
        private boolean expiracionTemporal;
        /** Fecha de Expiracion de la Tarjeta. */
        private LocalDate fechaExpiracion;
        /** Indicador de Límite de Transacción. */
        private boolean limitadorTransaccion;
        /** Límite de la Transacción. */
        private double cantidadLimite;
        /** Autenticación Multifactor */
        private boolean autenticacionMultifactor;
        /** Tipo de Autenticación Multifactor. */
        private String tipoAutenticacionMultifactor;
        /** Estado de la Autenticación Multifactor. */
        private boolean estadoAutenticacionMultifactor;
        
        
    /// ------------------------------------------------ ///
    ///            Constructores de la Clase             ///
    /// ------------------------------------------------ ///
    
    /** Constructor Paramétrico.  Crea un objeto previa inserción de todos los parámetros o atributos requeridos para poder realizar todo el proceso de creación. */
    public TarjetaVirtual(boolean dinamicoCVV, boolean expiracionTemporal, LocalDate fechaExpiracion, boolean limitadorTransaccion, double cantidadLimite, boolean autenticacionMultifactor, String tipoAutenticacionMultifactor, boolean estadoAutenticacionMultifactor){
        this.dinamicoCVV = dinamicoCVV;
        this.expiracionTemporal = expiracionTemporal;
        this.fechaExpiracion = fechaExpiracion;
        this.limitadorTransaccion = limitadorTransaccion;
        this.cantidadLimite = cantidadLimite;
        this.autenticacionMultifactor = autenticacionMultifactor;
        this.tipoAutenticacionMultifactor = tipoAutenticacionMultifactor;
        this.estadoAutenticacionMultifactor = estadoAutenticacionMultifactor;
    }

    /** Constructor Vacío. Crea un objeto estableciéndole valores por defecto, no requiere de la introducción de ningún parámetro.*/
    public TarjetaVirtual(){
        this(false, false, LocalDate.of(2024, 12, 31), false, 0, false, "Ninguna", false);
    }
    
    /** Constructor Copia. Crea una copia de un objeto Cuenta, es decir, crea un objeto con los mismos valores que el objeto que se toma como plantilla. */
    public TarjetaVirtual(TarjetaVirtual copia){
        this(copia.dinamicoCVV, copia.expiracionTemporal, copia.fechaExpiracion, copia.limitadorTransaccion, copia.cantidadLimite, copia.autenticacionMultifactor, copia.tipoAutenticacionMultifactor, copia.estadoAutenticacionMultifactor);
    }
    
    /// ------------------------------------------------ ///
    ///               Métodos de la Clase                ///
    /// ------------------------------------------------ ///

    //Setters
    public void setDinamicoCVV(boolean dinamicoCVV){
        this.dinamicoCVV = dinamicoCVV;
    }
    public void setExpiracionTemporal(boolean expiracionTemporal, LocalDate fechaExpiracion){
        this.expiracionTemporal = expiracionTemporal;
        if(expiracionTemporal == true){
            this.fechaExpiracion = fechaExpiracion;
        }
    }
    public void setLimitadorYCantidadTransacción(boolean limitadorTransaccion, double cantidadLimite){
        if(limitadorTransaccion == true){
            this.limitadorTransaccion = limitadorTransaccion;
            if(limitadorTransaccion == true){
                this.cantidadLimite = cantidadLimite;
            }
        }
    }
    public void setAutenticacionYTipoYEstadoAutenticacionMultifactor(boolean autenticacionMultifactor, String tipoAutenticacionMultifactor, boolean estadoAutenticacionMultifactor){
        this.autenticacionMultifactor = autenticacionMultifactor;
        if(autenticacionMultifactor){
            this.tipoAutenticacionMultifactor = tipoAutenticacionMultifactor;
            this.estadoAutenticacionMultifactor = estadoAutenticacionMultifactor;
        }
    }
    
    //Getters
    public boolean getDinamicoCVV(){
        return dinamicoCVV;
    }
    public boolean getExpiracionTemporal(){
        return expiracionTemporal;
    }
    public LocalDate geFechaExpiracion(){
        return fechaExpiracion;
    }
    public boolean getLimitadorTransacción(){
        return limitadorTransaccion;
    }
    public double getCantidadLimite(){
        return cantidadLimite;
    }
    public boolean getAutenticacionMultifactor(){
        return autenticacionMultifactor;
    }
    public String getTipoAutenticacionMultifactor(){
        return tipoAutenticacionMultifactor;
    }
    public boolean getEstadoAutenticacionMultifactor(){
        return estadoAutenticacionMultifactor;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "TarjetaVirtual{" + "dinamicoCVV='" + dinamicoCVV + '\'' + ", expiracionTemporal='" + expiracionTemporal + '\'' + ", fechaExpiracion=" + fechaExpiracion + '\'' + ", limitadorTransaccion=" + limitadorTransaccion + '\'' + ", cantidadLimite=" + cantidadLimite + '\'' + ", autenticacionMultifactor=" + autenticacionMultifactor + '\'' + ", tipoAutenticacionMultifactor=" + tipoAutenticacionMultifactor + '\'' + ", estadoAutenticacionMultifactor=" + estadoAutenticacionMultifactor + '}';
    }

    // Otros Métodos
    
}
