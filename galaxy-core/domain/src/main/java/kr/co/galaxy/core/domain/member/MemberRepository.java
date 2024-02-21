package kr.co.galaxy.core.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Class Description 
 *
 *
 * @class MemberRepository
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-20      SungTae Kim	    최초 작성		
 * </pre>
 */
public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findMemberByMid(UUID mid);
}
