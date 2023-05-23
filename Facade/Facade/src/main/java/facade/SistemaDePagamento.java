/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author Aluno
 */
public class SistemaDePagamento {
    public boolean pagamento(double quantia){
        boolean pagamento = false;
        
        if (quantia > 0) {
            pagamento = true;
        }
        
        return pagamento;
    }
        
}
