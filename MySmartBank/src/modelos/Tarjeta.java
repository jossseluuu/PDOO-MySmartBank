//
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// 

package modelos;
import java.time.LocalDate;

/**
 * @author josel
 * @version 1.0 (Update: 21.10.2024[NO TERMINADA LA UPDATE])
 */ 

public class Tarjeta {
    
    /// ------------------------------------------------ ///
    ///       Atributos de Instancia y de la Clase       ///
    /// ------------------------------------------------ ///
    
    // Atributos de Clase
        /** Icono de la Tarjeta. Deberá de ser una dirección de memoria en la que se encuentre almacenada y/o guardado un logotipo generalizado de una tarjeta bancaria. */
        private static final String ICONOTARJETAS = "/img/tarjetaslogo.png";
        /** Numero de Tarjetas. Es el número total de objetos Tarjeta que se encuentran de forma simultánea operando. */
        private static int numeroTarjetas = 0;
        /** Numero Máximo de Tarjetas. Es el número máximo de tarjetas que un cliente puede tener en su propiedad en cada una de sus cuentas asociadas, este número es modificable. */
        private static int numeroMaximoTarjetas = 5;
        /** Número Maximo de Fallo de Autenticaciones. Es el número máximo de veces que puede ser errónea la autenticación utilizada antes de ser bloqueada. Este número es modificable. */
        private int numeroMaximoFalloAutenticacion = 3;
        /** Numero por Defecto de Fallos de Autenticación. Es el número por defecto de número de fallos de autenticación que se pueden tener en una tarjeta. */
        private static final int NUMERODEFECTOFALLOSAUTENTICACION = 3;

    // Atributos de Instancia
        /** Numero de la Tarjeta. Es una cadena de caracteres que debe de encontrarse en el siguiente formato: "XXXX XXXX XXXX XXXX". El usuario introducirá todos los valores juntos y seremos nosotros los que gestionemos dicho formato. */
        private String numeroTarjeta;
        /** Fecha de Expiracion de la Tarjeta. Es la fecha en la que la tarjeta pasará de un estado a otro, concretamente a un estado de VENCIDO, preestablecido por las clases LocalDate, en el caso de la fecha y VENCIDO en el caso del archivo EstadoTarjeta.java. */
        private LocalDate fechaExpiracion;
        /** Numero CVV. Es uno de los número de verificacion de la tarjeta, en el caso en el que la tarjeta sea virtual puede ser modificable, pero siempre debe encontrarse entre los números 1 y 999 */
        private int numeroCVV;
        /** Estado de la Tarjeta. Es uno de los estados que se encuentran predefinidos en el archivo EstadoTarjeta.java, estos estados causarán diferentes acciones sobre los atributos del objeto Tarjeta. */
        private EstadoTarjeta estadoTarjeta;
        /** Tipo de Tarjeta Bancaria. Es un indicador del tipo de tarjeta bancaria en la que nos encontramos, se encontrará en el archivo TiposTarjetas.java, hay diferentes tipos y encontraremos una subclase con cada uno de dichos tipos. */
        private TiposTarjetas tipoTarjetaBancaria;
        
    /// ------------------------------------------------ ///
    ///            Constructores de la Clase             ///
    /// ------------------------------------------------ ///
    
    /** Constructor Paramétrico.  Crea un objeto previa inserción de todos los parámetros o atributos requeridos para poder realizar todo el proceso de creación. */
    public Tarjeta(String numeroTarjeta, LocalDate fechaExpiracion, int numeroCVV, EstadoTarjeta estadoTarjeta, TiposTarjetas tipoTarjetaBancaria){
        if(numeroTarjeta.length() >= 1 && numeroTarjeta.length() <= 16){
            if(numeroTarjeta.length() < 16){
                do{
                    numeroTarjeta = "0" + numeroTarjeta;
                    this.numeroTarjeta = numeroTarjeta;
                }while(numeroTarjeta.length() < 16);
            }
            // REORGANIZAR PARA TENER EL FORMATO QUE QUEREMOS
        }
        else{
            this.numeroTarjeta = "0000 0000 0000 0000";
        }
        
        this.fechaExpiracion = fechaExpiracion;
        
        if(numeroCVV >= 1 && numeroCVV <= 999){
            this.numeroCVV = numeroCVV;
        }
        else{
            this.numeroCVV = 0;
        }
        
        if(estadoTarjeta == EstadoTarjeta.ACTIVADA || estadoTarjeta == EstadoTarjeta.BLOQUEADA || estadoTarjeta == EstadoTarjeta.CANCELADA || estadoTarjeta == EstadoTarjeta.SUSPENDIDA || estadoTarjeta == EstadoTarjeta.VENCIDA){
            this.estadoTarjeta = estadoTarjeta;
        }
        else{
            this.estadoTarjeta = EstadoTarjeta.SUSPENDIDA;
        }
        
        if(tipoTarjetaBancaria == TiposTarjetas.FISICA ||tipoTarjetaBancaria == TiposTarjetas.VIRTUAL){
            this.tipoTarjetaBancaria = tipoTarjetaBancaria;
        }
    }

    /** Constructor Vacío. Crea un objeto estableciéndole valores por defecto, no requiere de la introducción de ningún parámetro.*/
    public Tarjeta(){
        this("0000 0000 0000 0000", LocalDate.of(2024, 12, 31), 0, EstadoTarjeta.SUSPENDIDA, TiposTarjetas.DEFECTO);
    }

    /** Constructor Copia. Crea una copia de un objeto Cuenta, es decir, crea un objeto con los mismos valores que el objeto que se toma como plantilla. */
    public Tarjeta(Tarjeta copia){
        this(copia.numeroTarjeta, copia.fechaExpiracion, copia.numeroCVV, copia.estadoTarjeta, copia.tipoTarjetaBancaria);
    }
    
    /// ------------------------------------------------ ///
    ///               Métodos de la Clase                ///
    /// ------------------------------------------------ ///

    //Setters
    public void setNumeroTarjeta(String numeroTarjeta){
        if(numeroTarjeta.matches("\\d{4} \\d{4} \\d{4} \\d{4}")){
            this.numeroTarjeta = numeroTarjeta;
        }
        else{
            this.numeroTarjeta = "XXXX XXXX XXXX XXXX";
        }
    }
    public void setFechaExpiracion(LocalDate fechaExpiracion){
        this.fechaExpiracion = fechaExpiracion;
    }
    public void setNumeroCVV(int numeroCVV){
        if(numeroCVV >= 1 && numeroCVV <= 999){
            this.numeroCVV = numeroCVV;
        }
        else{
            this.numeroCVV = 000;
        }
    }
    public void setEstadoTarjeta(EstadoTarjeta estadoTarjeta){
        this.estadoTarjeta = estadoTarjeta;
    }
    
    
    //Getters
    public String getNumeroTarjeta(){
        return numeroTarjeta;
    }
    public LocalDate getFechaExpiracion(){
        return fechaExpiracion;
    }
    public int getNumeroCVV(){
        return numeroCVV;
    }
    public EstadoTarjeta getEstadoTarjeta(){
        return estadoTarjeta;
    }

    // Método toString
    @Override
    public String toString() {
        return "Tarjeta{" + "numeroTarjeta='" + numeroTarjeta + '\'' + ", fechaExpiracion='" + fechaExpiracion + '\'' + ", numeroCVV=" + numeroCVV + ", estadoTarjeta=" + estadoTarjeta + '}';
    }
    
    // Otros Métodos

}