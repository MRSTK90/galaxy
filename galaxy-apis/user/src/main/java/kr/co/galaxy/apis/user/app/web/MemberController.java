package kr.co.galaxy.apis.user.app.web;

import kr.co.galaxy.apis.user.app.application.MemberService;
import kr.co.galaxy.apis.user.app.application.dto.MemberRequest;
import kr.co.galaxy.apis.user.app.application.dto.MemberResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Class Description 
 *
 *
 * @class MemberController
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-20      SungTae Kim	    최초 작성		
 * </pre>
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("{id}")
    public ResponseEntity<MemberResponse> get(@PathVariable UUID id){
        return ResponseEntity.ok(memberService.findMemberResponseById(id));
    }

    @PatchMapping("update/{id}")
    public ResponseEntity<Void> update(@PathVariable UUID id, @RequestBody MemberRequest request){
        memberService.update(id, request);
        return ResponseEntity.ok().build();
    }

}
