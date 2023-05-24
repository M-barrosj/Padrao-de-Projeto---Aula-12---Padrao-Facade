/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author Aluno
 */
public class Pacote1 extends AssinaturaDecorator{
    public Pacote1(IAssinatura assinaturaDecorada) {
            super(assinaturaDecorada);
        }

        @Override
        public double calcularPreco() {
            return super.calcularPreco() + 19.99;
        }

        @Override
        public String obterDescricao() {
            return super.obterDescricao() + ", Pacote 1: Assistir vídeos em vários dispositivos";
        }
}