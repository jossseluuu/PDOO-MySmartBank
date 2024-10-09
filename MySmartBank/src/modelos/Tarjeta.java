/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

//
// @author Jose Luis
// @see cliente.java, cuenta.java
// @version 1.0
//

public class Tarjeta{
    
    /// ------------------------------------------------ ///
    ///       Atributos de Instancia y de la Clase       ///
    /// ------------------------------------------------ ///
    
    // Atributos de Instancia
    private static String imagenTarjetaVirtual = "/img/tarjetavirtual.jpg";
    private static String imagenTarjetaFisica = "/img/tarjetafisica.jpg";
    private static int numeroTarjetasVirtuales = 0;
    private static int numeroTarjetasFisicas = 0;
    private static int numeroIntentosPIN = 5;
    
    // Atributos de la Clase
    private String imagenPropia;
    private int numeroTarjetaIdentificacion;
    private String tipoTarjeta;
    private String categoriaTarjeta;
    private String nombreTitular;
    private boolean tarjetaActiva;
    private String estadoTarjeta;
    private String fechaCreacion;
    private String fechaExpiracion;
    private int numeroCVV;
    private int numeroPIN;
    private int numeroMovimientos;
    
    
    /// ------------------------------------------------ ///
    ///            Constructores de la Clase             ///
    /// ------------------------------------------------ ///
    
    // Constructor Paramétrico TODO
/*
    public Tarjeta(String imagenPropia, int numeroTarjetaIdentificacion, String tipoTarjeta, String categoriaTarjeta, String nombreTitular, boolean tarjetaActiva, String estadoTarjeta, String fechaCreacion, String fechaExpiracion, int numeroCVV, int numeroMovimientos, int numeroPIN, int numeroMovimientos){
        this.imagenPropia = imagenPropia;
        this.numeroTarjetaIdentificacion = numeroTarjetaIdentificacion;
        this.tipoTarjeta = tipoTarjeta;
        this.categoriaTarjeta = categoriaTarjeta;
        this.nombreTitular = nombreTitular;
        this.tarjetaActiva = tarjetaActiva;
        this.estadoTarjeta = estadoTarjeta;
        this.fechaCreacion = fechaCreacion;
        this.fechaExpiracion = fechaExpiracion;
        this.numeroCVV = numeroCVV;
        this.numeroPIN = numeroPIN;
        this.numeroMovimientos = numeroMovimientos;
    }
    
    // Constructor Vacío
    public Tarjeta(){
        this(0, "NONE", "NONE", "NONE", false, "NONE", "NONE", "NONE", 0, 0, 0);
    }
    
    // Constructor Copia
    public Tarjeta(Tarjeta copia){
        this(copia.imagenPropia, copia.numeroTarjetaIdentificacion, copia.tipoTarjeta, copia.categoriaTarjeta,  );
    }
*/
    /// ------------------------------------------------ ///
    ///                Getters y Setters                 ///
    /// ------------------------------------------------ ///
    
    //Setters de la Clase
    public void setImagenPropia(String imagenPropia){
        this.imagenPropia = imagenPropia;
    }
    public void setNumeroTarjetaIdentificacion(int numeroTarjetaIdentificacion){
        this.numeroTarjetaIdentificacion = numeroTarjetaIdentificacion;
    }
    public void setTipoTarjeta(String tipoTarjeta){
        this.tipoTarjeta = tipoTarjeta;
    }
    public void setCategoriaTarjeta(String categoriaTarjeta){
        this.categoriaTarjeta = categoriaTarjeta;
    }
    public void setNombreTitular(String nombreTitular){
        this.nombreTitular = nombreTitular;
    }
    public void setTarjetaActiva(boolean tarjetaActiva){
        this.tarjetaActiva = tarjetaActiva;
    }
    public void setEstadoTarjeta(String estadoTarjeta){
        this.estadoTarjeta = estadoTarjeta;
    }
    public void setFechaCreacion(String fechaCreacion){
        this.fechaCreacion = fechaCreacion;
    }
    public void setFechaExpiracion(String fechaExpiracion){
        this.fechaExpiracion = fechaExpiracion;
    }
    public void setNumeroCVV(int numeroCVV){
        this.numeroCVV = numeroCVV;
    }
    public void setNumeroPIN(int numeroPIN){
        this.numeroPIN = numeroPIN;
    }
    public void setNumeroMovimientos(int numeroMovimientos){
        this.numeroMovimientos = numeroMovimientos;
    }
    
    //Setters de la Instancia
    public void setnumeroIntentosPIN(int  nuevo_numeroIntentosPIN){
        numeroIntentosPIN = nuevo_numeroIntentosPIN;
    }
    public int getnumeroIntentosPIN(){
        return numeroIntentosPIN;
    }
    
    //Getters de la Clase
    public String getImagenPropia(){
        return imagenPropia;
    }
    public int getNumeroTarjetaIdentificacion(){
        return numeroTarjetaIdentificacion;
    }
    public String getTipoTarjeta(){
        return tipoTarjeta;
    }
    public String getCategoriaTarjeta(){
        return categoriaTarjeta;
    }
    public String getNombreTitular(){
        return nombreTitular;
    }
    public boolean getTarjetaActiva(){
        return tarjetaActiva;
    }
    public String getEstadoTarjeta(){
        return estadoTarjeta;
    }
    public String getFechaCreacion(){
        return fechaCreacion;
    }
    public String getFechaExpiracion(){
        return fechaExpiracion;
    }
    public int getNumeroCVV(){
        return numeroCVV;
    }
    public int getNumeroPIN(){
        return numeroPIN;
    }
    public int getNumeroMovimientos(){
        return numeroMovimientos;
    }
    
    /// ------------------------------------------------ ///
    ///               Métodos de la Clase                ///
    /// ------------------------------------------------ ///

    // Metodos Publicos
    
    // Metodos Privados
    

    /// ------------------------------------------------ ///
    ///              Métodos de Instancia                ///
    /// ------------------------------------------------ ///
    
    //Metodos Públicos
    public void addTarjetasVirtuales(){
        if(numeroTarjetasVirtuales >= 0){
            numeroTarjetasVirtuales++;   
        }
        else{
            System.out.println("No hay tarjetas virtutales que crear.");
        }
    }
    public void addTarjetasFisicas(){
                if(numeroTarjetasFisicas >= 0){
            numeroTarjetasFisicas++;
        }
        else{
            System.out.println("No hay tarjetas fisicas que crear.");
        }
    }
    public void reduceTarjetasVirtuales(){
        if(numeroTarjetasVirtuales >= 1){
            numeroTarjetasVirtuales--;   
        }
        else{
            System.out.println("No hay tarjetas virtutales que eliminar.");
        }
    }
    public void reduceTarjetasFisicas(){
        if(numeroTarjetasFisicas >= 1){
            numeroTarjetasFisicas--;   
        }
        else{
            System.out.println("No hay tarjetas fisicas que eliminar.");
        }
    }
    
    //Metodos Privados
    
}
