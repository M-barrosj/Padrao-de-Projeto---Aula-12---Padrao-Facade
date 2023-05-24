/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author Aluno
 */
public class Pacote4 extends AssinaturaDecorator{
public Pacote4(IAssinatura assinaturaDecorada) {
        super(assinaturaDecorada);
    }

    @Override
    public double calcularPreco() {
        return super.calcularPreco() + 49.99;
    }

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + ", Pacote 4: Cartão de crédito Platinum";
    }
}