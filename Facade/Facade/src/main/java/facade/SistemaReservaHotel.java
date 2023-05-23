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
public class SistemaReservaHotel {
    public boolean reservaHotel(String nomeHotel, int quarto, Date dataCheckin, Date dataCheckou){
        boolean reservaHotel = false;
        
        // Lógica para reservar o hotel
        if (isValidHotel(nomeHotel, quarto, dataCheckin, dataCheckou)){
            // Aqui poderia ser utilizado algum serviço externo de reserva de hotéis, como Booking.com ou Expedia
            // Por exemplo, poderíamos ter o código a seguir:
            // hotelBooked = BookingService.bookHotel(city, checkInDate, checkOutDate, numRooms);
            // Onde BookingService é uma classe que encapsula o serviço de reserva de hotéis do Booking.com
            
            // Mas como é apenas um exemplo, vamos considerar que a reserva sempre é bem sucedida
            reservaHotel = true;
        }
        
        return reservaHotel;
    }
    
    private boolean isValidHotel(String nomeHotel, int quarto, Date dataCheckin, Date dataCheckou) {
        // Lógica para verificar se o hotel é válido
        // Por exemplo, poderíamos verificar se a cidade é válida, se as datas são válidas, se há quartos disponíveis, etc.
        // Aqui, vamos apenas verificar se a data de check-in é antes da data de check-out
        return dataCheckin.before(dataCheckou);
    }
}