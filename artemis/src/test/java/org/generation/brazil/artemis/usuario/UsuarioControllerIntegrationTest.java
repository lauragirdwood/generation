package org.generation.brazil.artemis.usuario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.generation.brazil.artemis.ArtemisApplication;
import org.generation.brazil.artemis.usuario.Usuario;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArtemisApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UsuarioControllerIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;


    @LocalServerPort
    private int port;

    private String getRootUrl (String path) {
        return "http://localhost:" + port + "/api/vl" + path;
    }



    @Test
    public void testaCriacaoDeUmNovoUsuario() {

        //Cria um novo usuario
        Usuario usuario = new Usuario();
        usuario.setNome("Jorge Ferreira");
        usuario.setEmail("jorgeferreira@gmail.com");
        usuario.setLogin("jorge.ferreira");
        usuario.setSenha("@Jf12345");

        //Chamada da API - (getroot "passa a url", objeto "usuario criado", Usuario.class = nome da classe que esta sendo usada)
        ResponseEntity<Usuario> postResponse =
                testRestTemplate.postForEntity(getRootUrl("/usuarios"),usuario,Usuario.class);

        assertNotNull(postResponse);
        assertEquals(201,postResponse.getStatusCodeValue());
    }
}