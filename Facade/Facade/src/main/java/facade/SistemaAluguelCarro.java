/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author Aluno
 */
public class SistemaAluguelCarro {
    public boolean aluguelCarro(String carro, int qtdDias){
        boolean aluguelCarro = false;
        
        // Lógica para alugar o carro
        if (isValidCarRental(carro, qtdDias)) {
            // Aqui poderia ser utilizado algum serviço externo de aluguel de carros, como Hertz ou Avis
            // Por exemplo, poderíamos ter o código a seguir:
            // carRented = HertzService.rentCar(carType, numDays);
            // Onde HertzService é uma classe que encapsula o serviço de aluguel de carros da Hertz
            
            // Mas como é apenas um exemplo, vamos considerar que o aluguel sempre é bem sucedido
            aluguelCarro = true;
        }
        
        return aluguelCarro;
    }
    
    private boolean isValidCarRental(String carro, int qtdDias) {
        // Lógica para verificar se o aluguel de carro é válido
        // Por exemplo, poderíamos verificar se o tipo de carro é válido, se o número de dias é válido, etc.
        // Aqui, vamos apenas verificar se o número de dias é positivo
        return qtdDias > 0;
    }
}