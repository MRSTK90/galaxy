package kr.co.galaxy.user.auth.token;

import io.jsonwebtoken.Jwts;
import java.util.Date;
import lombok.RequiredArgsConstructor;

public class JwtProvider {

    private String secretKey;

    public String create(){
        return Jwts.builder()
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + 999999999))
                .compact();
    }

    public boolean validation(){
        return false;
    }


}
