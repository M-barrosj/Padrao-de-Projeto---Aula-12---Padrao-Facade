/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class PacoteViagemFacade {
    private SistemaDePagamento sistemaDePagamento;
    private SistemaReservaPassagem sistemaReservaPassagem;
    private SistemaReservaHotel sistemaReservaHotel;
    private SistemaAluguelCarro sistemaAluguelCarro;
    
    public PacoteViagemFacade(){
        sistemaDePagamento = new SistemaDePagamento();
        sistemaReservaPassagem = new SistemaReservaPassagem();
        sistemaReservaHotel = new SistemaReservaHotel();
        sistemaAluguelCarro = new SistemaAluguelCarro();
    }
    
    public boolean pacoteViagem(String origem, String destino, Date dataPartida, Date DateRetorno, String nomeHotel, int quarto, Date dataCheckin, Date dataCheckout, String carro, int qtdDias, double precoPacote){
        boolean pagamentoOk = sistemaDePagamento.pagamento(precoPacote);
        
        if (pagamentoOk){
            boolean reservaViagemOk = sistemaReservaPassagem.reservaVoo(origem, destino, dataPartida, DateRetorno);
            boolean reservaHotelOk = sistemaReservaHotel.reservaHotel(nomeHotel, quarto, dataCheckin, dataCheckout);
            boolean aluguelCarroOk = sistemaAluguelCarro.aluguelCarro(carro, qtdDias);
            
            return reservaViagemOk && reservaHotelOk && aluguelCarroOk;
        }else{
            return false;
        }
        
    }
}
