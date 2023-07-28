package kr.co.galaxy.user.ui;

import java.util.List;
import kr.co.galaxy.user.application.RoleService;
import kr.co.galaxy.user.application.dto.RoleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RoleController {

    private final RoleService service;

    @GetMapping("roles/{id}")
    public ResponseEntity<RoleResponse> findRole(@PathVariable Long id){
        RoleResponse role = service.findRoleResponseById(id);
        return ResponseEntity.ok().body(role);
    }
    @GetMapping("roles/name")
    public ResponseEntity<List<RoleResponse>> findByName(@RequestParam String name){
        return ResponseEntity.ok().body(service.findRoleResponseByName(name));
    }

}
