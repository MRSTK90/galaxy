package kr.co.galaxy.apis.user.app.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Class Description 
 *
 *
 * @class TicketRequest
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
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketRequest {

    private String type;
    private int count;

}
