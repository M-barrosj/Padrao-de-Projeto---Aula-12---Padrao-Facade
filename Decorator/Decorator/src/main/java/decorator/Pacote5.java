/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author Aluno
 */
public class Pacote5 extends AssinaturaDecorator{
    public Pacote5(IAssinatura assinaturaDecorada){
        super(assinaturaDecorada);
    }
    
    @Override
    public double calcularPreco() {
        return super.calcularPreco() + 19.99;
    }

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + ", Pacote 5: Compra com Cash Back";
    }
}
