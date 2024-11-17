/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloTarjeta;

/**
 * @author josel
 * @version 1.0 (Update: 21.10.2024[NO TERMINADA LA UPDATE])
 */ 

public class TarjetaFisica {
        
    /// ------------------------------------------------ ///
    ///       Atributos de Instancia y de la Clase       ///
    /// ------------------------------------------------ ///
    
    // Atributos de Clase
        /** Icono de la Tarjeta Virtual. Será el icono por defecto de todas las tarjetas virtuales de una tarjeta. No hay imagenes concretas para cada una de las cuentas. */
        private static final String ICONOTARJETAFISICA = "/img/tarjetafisicalogo.png";
        /** Numero de Tarjetas. Es el número de este tipo de tarjetas que existen. */
        private static int numeroTarjetasFisicas= 0;

    // Atributos de Instancia
        /** Indicador de si el chip EMV es válido y/o funciona. Si el indicador es verdadero, la tarjeta de crédito puede realizar pagos con la tarjeta. */
        private boolean chipEMV;
        /** Indicador de si la banda Magnética es válida y/o funciona. Si el indicador es verdadero, la tarjeta de crédito puede realizar pagos con la tarjeta */
        private boolean bandaMagnetica;
        /** Numero Pin de la Tarjeta. Es el método de verificación de los pagos con tarjeta, en caso de introducirse uno erróneo, no se realiza el pago, cabe destacar que hay un número limitado de veces para equivocarse.*/
        private int numeroPIN;
        
    /// ------------------------------------------------ ///
    ///            Constructores de la Clase             ///
    /// ------------------------------------------------ ///
    
    /** Constructor Paramétrico.  Crea un objeto previa inserción de todos los parámetros o atributos requeridos para poder realizar todo el proceso de creación. */
    public TarjetaFisica(boolean chipEMV, boolean bandaMagnetica, int numeroPIN){
        this.chipEMV = chipEMV;
        this.bandaMagnetica = bandaMagnetica;
        this.numeroPIN = numeroPIN;
    }

    /** Constructor Vacío. Crea un objeto estableciéndole valores por defecto, no requiere de la introducción de ningún parámetro.*/
    public TarjetaFisica(){
        this(false, false, 0);
    }
    
    /** Constructor Copia. Crea una copia de un objeto Cuenta, es decir, crea un objeto con los mismos valores que el objeto que se toma como plantilla. */
    public TarjetaFisica(TarjetaFisica copia){
        this(copia.chipEMV, copia.bandaMagnetica, copia.numeroPIN);
    }
    
    /// ------------------------------------------------ ///
    ///               Métodos de la Clase                ///
    /// ------------------------------------------------ ///

    //Setters
    public void setChipEMV(boolean chipEMV){
        this.chipEMV = chipEMV;
    }
    public void setBandaMagnetica(boolean bandaMagnetica){
        this.bandaMagnetica = bandaMagnetica;
    }
    public void setNumeroPIN(int numeroPIN){
        this.numeroPIN = numeroPIN;
    }
    
    //Getters
    public boolean getChipEMV(){
        return chipEMV;
    }
    public boolean getBandaMagnetica(){
        return bandaMagnetica;
    }
    public int numeroPIN(){
        return numeroPIN;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "TarjetaFisica{" + "chipEMV='" + chipEMV + '\'' + ", bandaMagnetica='" + bandaMagnetica + '\'' + ", numeroPIN=" + numeroPIN + '}';
    }

    // Otros Métodos
    
}
