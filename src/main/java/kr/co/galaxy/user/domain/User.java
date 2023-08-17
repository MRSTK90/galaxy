package kr.co.galaxy.user.domain;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import lombok.Getter;

@Entity
@Getter
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String email;
    private String name;
    private String password;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(
            name ="USER_ROLE",
            joinColumns = @JoinColumn(name = "email", referencedColumnName = "email")
    )
    @Column(name = "role")
    private Collection<String> roles;

}
