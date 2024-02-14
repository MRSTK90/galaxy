package kr.co.galaxy.apis.user.app.web;

import kr.co.galaxy.apis.user.app.application.TicketService;
import kr.co.galaxy.apis.user.app.application.dto.TicketResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class Description 
 *
 *
 * @class TicketController
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-14      SungTae Kim	    최초 작성		
 * </pre>
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("ticket")
public class TicketController {

    private final TicketService ticketService;

    @GetMapping
    public ResponseEntity<TicketResponse> get(Long id){
        return ResponseEntity.ok(ticketService.findTicketResponseById(id));
    }
}
