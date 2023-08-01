package kr.co.galaxy.user.auth.security;

import java.util.Collection;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class GalaxyAuthenticationToken extends AbstractAuthenticationToken {

    private String email;
    private String credentials;


    /**
     * Creates a token with the supplied array of authorities.
     *
     * @param authorities the collection of <tt>GrantedAuthority</tt>s for the principal
     *                    represented by this authentication object.
     */
    public GalaxyAuthenticationToken(
            Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
    }

    public GalaxyAuthenticationToken(String email, String credentials) {
        super(null);
        this.email = email;
        this.credentials = credentials;
        setAuthenticated(false);
    }

    public GalaxyAuthenticationToken(Collection<? extends GrantedAuthority> authorities,
            String email,
            String credentials) {
        super(authorities);
        this.email = email;
        this.credentials = credentials;
    }

    @Override
    public Object getCredentials() {
        return this.credentials;
    }

    @Override
    public Object getPrincipal() {
        return this.email;
    }
}
