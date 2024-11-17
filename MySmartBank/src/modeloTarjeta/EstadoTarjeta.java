//
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// 

package modeloTarjeta;

/**
 * @author josel
 * @version 1.0 (Update: 21.10.2024)
 * @brief Son diferentes estados en los que podemos encontrar nuestros objetos tarjeta. La denominación establecida por defecto es "SUSPENDIDA".
 */ 

public enum EstadoTarjeta {
    SUSPENDIDA,
    BLOQUEADA,
    CANCELADA,
    VENCIDA,
    ACTIVADA
}
