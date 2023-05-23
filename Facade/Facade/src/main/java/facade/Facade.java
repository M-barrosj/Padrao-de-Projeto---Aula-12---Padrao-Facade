/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package facade;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Facade {

    public static void main(String[] args) {
        PacoteViagemFacade facade = new PacoteViagemFacade();
        
        boolean pacoteReservado = facade.pacoteViagem("São Paulo", "Rio de Janeiro", new Date(), new Date(), "Hotel unit", 2, new Date(), new Date(), "Ford Focus", 3, 1000.00);
                
                if (pacoteReservado) {
            System.out.println("Pacote de viagem reservado com sucesso!");
        } else {
            System.out.println("Erro ao reservar pacote de viagem.");
        }
    }
    
}