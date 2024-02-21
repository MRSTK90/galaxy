package kr.co.galaxy.apis.user.app.web;

import kr.co.galaxy.apis.user.app.application.TicketService;
import kr.co.galaxy.apis.user.app.application.dto.TicketRequest;
import kr.co.galaxy.apis.user.app.application.dto.TicketResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

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
    public ResponseEntity<TicketResponse> get(@RequestParam(name = "id") Long id){
        return ResponseEntity.ok(ticketService.findTicketResponseById(id));
    }

    @PostMapping("create")
    public ResponseEntity<TicketResponse> create(@RequestBody TicketRequest request){
        TicketResponse response = ticketService.create(request);
        return ResponseEntity.created(URI.create("/ticket/"+response.getTid())).body(response);
    }

    @PatchMapping("update/{id}")
    public ResponseEntity<TicketResponse> update(@PathVariable UUID id, @RequestParam(name = "count") int count){
        ticketService.update(id, count);
        return ResponseEntity.ok().build();
    }



    @DeleteMapping("delete/{id}")
    public ResponseEntity<TicketResponse> delete(@PathVariable UUID id){
        ticketService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
