/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package decorator;

/**
 *
 * @author Aluno
 */
public class Decorator {

    public static void main(String[] args) {
        // Cria uma assinatura base
        IAssinatura assinatura = new AssinaturaBase();
        
        // Adiciona pacotes opcionais à assinatura
        assinatura = new Pacote1(assinatura);
        assinatura = new Pacote2(assinatura);
        assinatura = new Pacote3(assinatura);
        assinatura = new Pacote4(assinatura);
        assinatura = new Pacote5(assinatura);

        // Calcula o preço total da assinatura
        double precoTotal = assinatura.calcularPreco();

        // Obtém a descrição completa da assinatura
        String descricaoCompleta = assinatura.obterDescricao();

        // Imprime o preço total e a descrição completa
        System.out.println("Preço Total: R$" + precoTotal);
        System.out.println("Descrição: " + descricaoCompleta);
    }
}
