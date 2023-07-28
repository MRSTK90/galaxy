package kr.co.galaxy.user.application.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RoleRequest {

    private Long id;
    private String name;
}
