package kr.co.galaxy.user.auth.security;

import kr.co.galaxy.user.domain.User;
import kr.co.galaxy.user.infra.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@RequiredArgsConstructor
public class GalaxyUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getReferenceById(username);
        GalaxyUserDetails userDetails = new GalaxyUserDetails();

        return userDetails;
    }
}
