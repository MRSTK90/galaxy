package kr.co.galaxy.apis.user.app.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Class Description 
 *
 *
 * @class MemberRequest
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-20      SungTae Kim	    최초 작성		
 * </pre>
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberRequest {
    private String type;
    private String name;
    private LocalDate birth;
    private String sex;
}
