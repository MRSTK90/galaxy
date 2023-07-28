package kr.co.galaxy.user.application.dto;

import java.util.Date;
import kr.co.galaxy.user.domain.Role;
import lombok.Getter;

@Getter
public class RoleResponse {

    private Long id;

    private String name;

    public RoleResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static RoleResponse of(Role role){
        return new RoleResponse(role.getId(), role.getName());
    }


}
