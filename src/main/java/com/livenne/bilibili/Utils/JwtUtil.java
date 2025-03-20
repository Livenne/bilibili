package com.livenne.bilibili.Utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.Map;

public class JwtUtil {
    private static final String SIGNATURE = "@#%GFx";
    private static final Long EXPIRE_TIME = 5 * 60 * 60 * 1000L;

    public static String createToken(Map<String, String> claims) {
        JWTCreator.Builder builder = JWT.create();
        claims.forEach(builder::withClaim);
        return builder.withExpiresAt(new Date(System.currentTimeMillis() + EXPIRE_TIME))
                .withIssuedAt(new Date())
                .sign(Algorithm.HMAC256(SIGNATURE));
    }

    public static Map<String , Claim> verifyToken(String token) {
        DecodedJWT jwt = JWT.require(Algorithm.HMAC256(SIGNATURE)).build().verify(token);
        return jwt.getClaims();
    }

}
