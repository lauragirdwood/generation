package org.generation.brazil.gfood.security;

import lombok.Data;

@Data
public class JwtAuthenticationRequest {

    //classe para fazer a conversão do Json pra objeto com segurança

    private String username;
    private String password;

}
