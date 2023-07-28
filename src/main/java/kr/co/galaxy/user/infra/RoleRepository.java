package kr.co.galaxy.user.infra;

import java.util.List;
import kr.co.galaxy.user.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    List<Role> findByNameContains(String name);

}
