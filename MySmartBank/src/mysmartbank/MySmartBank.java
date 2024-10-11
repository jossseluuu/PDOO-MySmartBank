/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mysmartbank;
import modelos.Cuenta;
import modelos.TipoCuenta;

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
        Cuenta Cuenta_Numero1 = new Cuenta("9714528692", TipoCuenta.REMUNERADA , true, "11-10-2024", 5);
        Cuenta Cuenta_Numero2 = new Cuenta();
        Cuenta Cuenta_Numero3 = new Cuenta(Cuenta_Numero1);
        
        // Mostramos por pantalla los valores de los tres objetos creados de la clase Cuenta.
        System.out.println("Primera Cuenta:");
        System.out.print(Cuenta_Numero1.getNumeroIdentificacion() + " ");
        System.out.print(Cuenta_Numero1.getSaldo() + " ");
        System.out.print(Cuenta_Numero1.getTipoCuentaBancaria() + " ");
        System.out.print(Cuenta_Numero1.getFechaAperturaCuenta() + " ");
        System.out.println(Cuenta_Numero1.getEstadoCuenta() + " ");
        
        System.out.println("Segunda Cuenta:");
        System.out.print(Cuenta_Numero2.getNumeroIdentificacion() + " ");
        System.out.print(Cuenta_Numero2.getSaldo() + " ");
        System.out.print(Cuenta_Numero2.getTipoCuentaBancaria() + " ");
        System.out.print(Cuenta_Numero2.getFechaAperturaCuenta() + " ");
        System.out.println(Cuenta_Numero2.getEstadoCuenta() + " ");
        
        System.out.println("Tercera Cuenta:");
        System.out.print(Cuenta_Numero3.getNumeroIdentificacion() + " ");
        System.out.print(Cuenta_Numero3.getSaldo() + " ");
        System.out.print(Cuenta_Numero3.getTipoCuentaBancaria() + " ");
        System.out.print(Cuenta_Numero3.getFechaAperturaCuenta() + " ");
        System.out.println(Cuenta_Numero3.getEstadoCuenta() + " ");
        
        // Realizamos las modificaciones de uno de los objetos creados.
        Cuenta_Numero3.setNumeroIdentificacion("12345");
        Cuenta_Numero3.setSaldo(100);
        Cuenta_Numero3.setTipoCuentaBancaria(TipoCuenta.ONLINE);
        Cuenta_Numero3.setFechaAperturaCuenta("Hace 10 dias");
        Cuenta_Numero3.setFechaAperturaCuenta("10-10-2024");
        Cuenta_Numero3.setEstadoCuenta(false);
       
        // Mostramos de nuevo por pantalla los atributos modificados.
        System.out.println("Tercera Cuenta ya Modificada Previamente:");
        System.out.print(Cuenta_Numero3.getNumeroIdentificacion() + " ");
        System.out.print(Cuenta_Numero3.getSaldo() + " ");
        System.out.print(Cuenta_Numero3.getTipoCuentaBancaria() + " ");
        System.out.print(Cuenta_Numero3.getFechaAperturaCuenta() + " ");
        System.out.println(Cuenta_Numero3.getEstadoCuenta() + " ");
        
        // Realizamos un toString para ver los atributos de un objeto.
        System.out.println(Cuenta_Numero2.toString());
        
        
    }
    
}
