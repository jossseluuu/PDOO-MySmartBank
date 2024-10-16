//
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// 

package modelos;

/**
 * @author josel
 */

public class Tarjeta {
    
    /// ------------------------------------------------ ///
    ///       Atributos de Instancia y de la Clase       ///
    /// ------------------------------------------------ ///
    
    // Atributos de Clase
        /** Icono de la Tarjeta. Deberá de ser una dirección de memoria en la que se tenga almacenada un logotipo para determinar todas las tarjetas. */
        private static final String ICONOTARJETAS = "/img/tarjetaslogo.png";
        /** Numero de Tarjetas. Es el número total de objetos Tarjeta que se encuentran en nuestro programa. */
        private static int numeroTarjetas = 0;
        /** Numero Máximo de Tarjetas. Número máximo de tarjetas que un cliente puede tener en su propiedad, este número podrá ser modificable. */
        private static int numeroMaximoTarjetas = 0;
        /** Número Maximo de Fallo de Autenticaciones. Es el número máximo de veces que puede fallar la autenticación antes de ser bloqueada la tarjeta. */
        private int numeroMaximoFalloAutenticacion = 3; // Numero Entero modificable que establecerá el numero de fallos de autenticación.

    // Atributos de Instancia
        /** Numero de la Tarjta. Es una cadena de caracteres que debe de encontrarse en el siguiente formato: "XXXX XXXX XXXX XXXX" */
        private String numeroTarjeta;
        /** Fecha de Expiracion de la Tarjeta. Es la fecha en la que la tarjeta pasará a un estado de Vencido, [POR DETERMINAR] */
        private String fechaExpiracion;
        /** Numero CVV. Es uno de los número de verificacion de la tarjeta, puede ser modificable en casos muy concretos, pero siempre debe encontrarse entre 1 y 999 */
        private int numeroCVV;
        /** Estado de la Tarjeta. Es uno de los estados que se encuentran predefinidos en EstadoTarjeta.java, estos estados podran causar acciones. */
        private EstadoTarjeta estadoTarjeta; // Uno de los estados predefinidos en el enum TipoCuenta
    
    /// ------------------------------------------------ ///
    ///            Constructores de la Clase             ///
    /// ------------------------------------------------ ///
    
    /** Constructor Paramétrico.  Crea un objeto previa inserción de todos los parámetros o atributos requeridos para poder realizar todo el proceso de creación. */
    public Tarjeta(String numeroTarjeta, String fechaExpiracion, int numeroCVV, EstadoTarjeta estadoTarjeta){
        if(numeroTarjeta.length() >= 1 && numeroTarjeta.length() <= 19){
            this.numeroTarjeta = numeroTarjeta;
        }
        if(fechaExpiracion.length() >= 1 && fechaExpiracion.length() <= 10){
            this.fechaExpiracion = fechaExpiracion;
        }
        if(numeroCVV % 100 == 0){
            this.numeroCVV = numeroCVV;
        }
        this.estadoTarjeta = estadoTarjeta;
    }

    /** Constructor Vacío. Crea un objeto estableciéndole valores por defecto, no requiere de la introducción de ningún parámetro.*/
    public Tarjeta(){
        this("0000 0000 0000 0000", "+ 1 año", 0, EstadoTarjeta.SUSPENDIDA);
    }

    /** Constructor Copia. Crea una copia de un objeto Cuenta, es decir, crea un objeto con los mismos valores que el objeto que se toma como plantilla. */
    public Tarjeta(Tarjeta copia){
        this(copia.numeroTarjeta, copia.fechaExpiracion, copia.numeroCVV, copia.estadoTarjeta);
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
    public void setFechaExpiracion(String fechaExpiracion){
        // [POR DETERMINAR]
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
    public String getFechaExpiracion(){
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