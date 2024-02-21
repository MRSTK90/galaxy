package kr.co.galaxy.apis.user.app.application;

import kr.co.galaxy.apis.user.app.application.dto.TicketRequest;
import kr.co.galaxy.apis.user.app.application.dto.TicketResponse;
import kr.co.galaxy.core.domain.ticket.Ticket;
import kr.co.galaxy.core.domain.ticket.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

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
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;

    @Transactional(readOnly = false)
    public TicketResponse create(TicketRequest ticketRequest) {

        Ticket createdTicket = ticketRepository.save(Ticket.builder()
                .type(ticketRequest.getType())
                .count(ticketRequest.getCount())
                .build());

        return TicketResponse.of(createdTicket);

    }

    @Transactional(readOnly = false)
    public void update(UUID tid, int count) {
        Ticket targetTicket = ticketRepository.findTicketByTid(tid);
        targetTicket.update(count);
    }

    @Transactional(readOnly = false)
    public void delete(UUID tid) {
        ticketRepository.deleteTicketByTid(tid);
    }


    public TicketResponse findTicketResponseById(Long id) {
        return TicketResponse.of(findById(id));
    }

    public Ticket findById(Long id) {
        return ticketRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
    }
}
