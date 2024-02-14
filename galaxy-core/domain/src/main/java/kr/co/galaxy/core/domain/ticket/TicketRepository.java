package kr.co.galaxy.core.domain.ticket;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Class Description 
 *
 *
 * @class TicketRepository
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-14      SungTae Kim	    최초 작성		
 * </pre>
 */
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
