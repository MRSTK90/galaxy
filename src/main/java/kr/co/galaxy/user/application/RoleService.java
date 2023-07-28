package kr.co.galaxy.user.application;

import java.util.List;
import java.util.stream.Collectors;
import kr.co.galaxy.user.application.dto.RoleResponse;
import kr.co.galaxy.user.domain.Role;
import kr.co.galaxy.user.infra.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public Role findById(Long id) {
        return roleRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public List<Role> findByName(String name) {
        return roleRepository.findByNameContains(name.strip());
    }

    public RoleResponse findRoleResponseById(Long id) {
        return RoleResponse.of(findById(id));
    }
    public List<RoleResponse> findRoleResponseByName(String name){
        return findByName(name).stream()
                .map(role -> RoleResponse.of(role))
                .collect(Collectors.toList());
    }

}
