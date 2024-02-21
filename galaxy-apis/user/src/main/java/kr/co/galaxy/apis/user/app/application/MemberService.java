package kr.co.galaxy.apis.user.app.application;

import kr.co.galaxy.apis.user.app.application.dto.MemberRequest;
import kr.co.galaxy.apis.user.app.application.dto.MemberResponse;
import kr.co.galaxy.core.domain.member.Member;
import kr.co.galaxy.core.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Class Description 
 *
 *
 * @class MemberService
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-20      SungTae Kim	    최초 작성		
 * </pre>
 */

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberResponse findMemberResponseById(UUID mid){
        Member member = memberRepository.findMemberByMid(mid);
        return MemberResponse.of(member);
    }

    public void update(UUID mid, MemberRequest memberRequest){
        Member member = memberRepository.findMemberByMid(mid);

    }
}
