package kr.co.galaxy.apis.user.app.application;

import kr.co.galaxy.apis.user.app.application.dto.TicketResponse;
import kr.co.galaxy.core.domain.ticket.Ticket;
import kr.co.galaxy.core.domain.ticket.TicketRepository;
import org.springframework.stereotype.Service;

/**
 * Class Description 
 *
 *
 * @class TicketService
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-14      SungTae Kim	    최초 작성		
 * </pre>
 */

@Service
public class TicketService {

    private TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
    public TicketResponse findTicketResponseById(Long id){
        return TicketResponse.of(findById(id));
    }
    public Ticket findById(Long id){
        return ticketRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }
}
