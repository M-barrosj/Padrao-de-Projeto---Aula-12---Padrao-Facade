/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author Aluno
 */
public class Pacote3 extends AssinaturaDecorator{
    public Pacote3(IAssinatura assinaturaDecorada) {
        super(assinaturaDecorada);
    }

    @Override
    public double calcularPreco() {
        return super.calcularPreco() + 29.99;
    }

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + ", Pacote 3: Caixa surpresa com produtos relacionados a filmes e séries";
    }
}

