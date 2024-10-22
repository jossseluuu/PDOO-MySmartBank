/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package mysmartbank;

import java.time.LocalDate;
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
        
        // Clase Cuenta.
        ////
        Cuenta Cuenta_1 = new Cuenta("1475896215", TipoCuenta.CORRIENTE, true, LocalDate.of(2024, 10, 10), 1000, true);
        Cuenta Cuenta_2 = new Cuenta();
        Cuenta Cuenta_3 = new Cuenta(Cuenta_1);
        
        Cuenta_1.toString();
        Cuenta_2.toString();
        Cuenta_3.toString();
        
        Cuenta_3.setNumeroIdentificacionCompletoyParcial("1234567890");
        Cuenta_3.setTipoCuentaBancaria(TipoCuenta.REMUNERADA);
        Cuenta_3.setEstadoCuenta(false);
        Cuenta_3.setFechaAperturaCuenta(LocalDate.of(2024, 01, 01));
        Cuenta_3.setSaldo(1500);
        Cuenta_3.setIndicadorSalario(false);
        
        Cuenta_3.toString();
        
        Cuenta_3.defaultNumeroIdentificacionCompleto();
        Cuenta_3.defaultNumeroIdentificacionParcial();
        Cuenta_3.changeEstadoCuenta();
        Cuenta_3.changeIndicadorIngresoSalario(3);
        
        System.out.println("CUENTA NUMERO 3: "
                + "Numero identificacion parcial: " + Cuenta_3.getNumeroIdentificacionParcial()
                + "Numero identificacion completo: " + Cuenta_3.getNumeroIdentificacionCompleto()
                + "Tipo de Cuenta Bancaria: " + Cuenta_3.getTipoCuentaBancaria()
                + "Estado de la Cuenta: " + Cuenta_3.getEstadoCuenta()
                + "Fecha de Apertura de la Cuenta: " + Cuenta_3.getFechaAperturaCuenta()
                + "Saldo de la Cuenta: " + Cuenta_3.getSaldo()
                + "Tasa de Interes de la Cuenta: " + Cuenta_3.getTasaInteresCuenta()
                + "Indicador de Ingresos Salario: " + Cuenta_3.getIndicadorIngresoSalario());
        
        //Clase Tarjeta.
        ////
        
        // Clase TarjetaFisica.
        ////
       
        // Clase TarjetaVirtual.
        ////
        
    }
    
}
