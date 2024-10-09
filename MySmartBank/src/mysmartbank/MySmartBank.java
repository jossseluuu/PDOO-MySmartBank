/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mysmartbank;
import modelos.Cuenta;

/*
 * @author josel
*/

public class MySmartBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Construcción de tres cuentas diferentes, cada una con un constructor diferente.
        Cuenta Cuenta_Numero1 = new Cuenta("ES25 2563 7846 9756", "Alfredo Fernandez Alvarez", 36850, "Online", "09/10/2024", true);
        Cuenta Cuenta_Numero2 = new Cuenta();
        Cuenta Cuenta_Numero3 = new Cuenta(Cuenta_Numero1);
        
        // Mostramos por pantalla los valores de los tres objetos creados de la clase Cuenta.
        System.out.println("Primera Cuenta:");
        System.out.print(Cuenta_Numero1.getNumeroIdentificacion() + " ");
        System.out.print(Cuenta_Numero1.getNombreTitular() + " ");
        System.out.print(Cuenta_Numero1.getSaldo() + " ");
        System.out.print(Cuenta_Numero1.getTipoCuenta() + " ");
        System.out.print(Cuenta_Numero1.getFechaAperturaCuenta() + " ");
        System.out.print(Cuenta_Numero1.getEstadoCuenta() + " ");
        
        System.out.println("Segunda Cuenta:");
        System.out.print(Cuenta_Numero2.getNumeroIdentificacion() + " ");
        System.out.print(Cuenta_Numero2.getNombreTitular() + " ");
        System.out.print(Cuenta_Numero2.getSaldo() + " ");
        System.out.print(Cuenta_Numero2.getTipoCuenta() + " ");
        System.out.print(Cuenta_Numero2.getFechaAperturaCuenta() + " ");
        System.out.print(Cuenta_Numero2.getEstadoCuenta() + " ");
        
        System.out.println("Tercera Cuenta:");
        System.out.print(Cuenta_Numero3.getNumeroIdentificacion() + " ");
        System.out.print(Cuenta_Numero3.getNombreTitular() + " ");
        System.out.print(Cuenta_Numero3.getSaldo() + " ");
        System.out.print(Cuenta_Numero3.getTipoCuenta() + " ");
        System.out.print(Cuenta_Numero3.getFechaAperturaCuenta() + " ");
        System.out.print(Cuenta_Numero3.getEstadoCuenta() + " ");
        
        // Realizamos las modificaciones de uno de los objetos creados.
        Cuenta_Numero3.setNumeroIdentificacion("12345");
        Cuenta_Numero3.setNombreTitular("Mi Nombre Completo");
        Cuenta_Numero3.setSaldo(1);
        Cuenta_Numero3.setTipoCuenta("Remunerada");
        Cuenta_Numero3.setFechaAperturaCuenta("Hace 10 dias");
        Cuenta_Numero3.setEstadoCuenta(false);
       
        // Mostramos de nuevo por pantalla los atributos modificados.
        System.out.println("Tercera Cuenta ya Modificada Previamente:");
        System.out.print(Cuenta_Numero3.getNumeroIdentificacion() + " ");
        System.out.print(Cuenta_Numero3.getNombreTitular() + " ");
        System.out.print(Cuenta_Numero3.getSaldo() + " ");
        System.out.print(Cuenta_Numero3.getTipoCuenta() + " ");
        System.out.print(Cuenta_Numero3.getFechaAperturaCuenta() + " ");
        System.out.print(Cuenta_Numero3.getEstadoCuenta() + " ");
    }
    
}
