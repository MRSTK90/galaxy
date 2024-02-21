package kr.co.galaxy.apis.user.app.application.dto;

import kr.co.galaxy.core.domain.member.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

/**
 * Class Description 
 *
 *
 * @class MemberResponse
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
@AllArgsConstructor
public class MemberResponse {
    private String type;
    private String name;
    private LocalDate birth;
    private String sex;

    public static MemberResponse of(Member member){
        return new MemberResponse(member.getType(), member.getName(), member.getBirth(), member.getSex());
    }

}
