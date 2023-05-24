/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author Aluno
 */
public class Pacote2 extends AssinaturaDecorator{
    public Pacote2(IAssinatura assinaturaDecorada) {
    super(assinaturaDecorada);
    }

    @Override
    public double calcularPreco() {
        return super.calcularPreco() + 9.99;
    }

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + ", Pacote 2: Frete Grátis em produtos";
    }
}