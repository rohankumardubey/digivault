package org.digivault.services;

import io.jsonwebtoken.Claims;
import org.digivault.services.impl.JwtTokenServiceImpl;
import org.junit.Test;

public class TestJwtTokenServiceImpl {

  TokenService<Claims> tokenService = new JwtTokenServiceImpl();

  @Test
  public void testTokenGeneration() throws Exception {
    String token = tokenService.createToken("tempUser");
    System.out.println(token);

    Claims claims = tokenService.decodeToken(token);
    System.out.println(claims);
  }
}