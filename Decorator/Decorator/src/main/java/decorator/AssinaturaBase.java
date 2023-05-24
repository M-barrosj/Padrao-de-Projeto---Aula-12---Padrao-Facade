/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author Aluno
 */
public class AssinaturaBase implements IAssinatura {
    @Override
    public double calcularPreco() {
        return 9.99;
    }

    @Override
    public String obterDescricao() {
        return "Assinatura Base: Assistir vídeos num único dispositivo";
    }
}
