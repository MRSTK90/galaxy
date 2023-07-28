package kr.co.galaxy.user.infra;

import kr.co.galaxy.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
