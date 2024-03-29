package kr.co.galaxy.apis.user.app.application.dto;

import kr.co.galaxy.core.domain.ticket.Ticket;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

/**
 * Class Description 
 *
 *
 * @class TicketResponse
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-14      SungTae Kim	    최초 작성		
 * </pre>
 */
@Getter
@AllArgsConstructor
public class TicketResponse {
    private UUID tid;
    private String type;
    private int count;

    public static TicketResponse of(Ticket ticket) {
        return new TicketResponse(ticket.getTid(), ticket.getType(), ticket.getCount());
    }
}
