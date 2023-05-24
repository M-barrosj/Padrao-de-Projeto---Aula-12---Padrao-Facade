/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author Aluno
 */
public class AssinaturaDecorator implements IAssinatura{
    
    protected IAssinatura assinaturaDecorada;

    public AssinaturaDecorator(IAssinatura assinaturaDecorada) {
        this.assinaturaDecorada = assinaturaDecorada;
    }

    @Override
    public double calcularPreco() {
        return assinaturaDecorada.calcularPreco();
    }

    @Override
    public String obterDescricao() {
        return assinaturaDecorada.obterDescricao();
    }
}
