package org.generation.brazil.artemis.usuario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.generation.brazil.artemis.ArtemisApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArtemisApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class UsuarioControllerIntegrationTest {

  @Autowired
  private TestRestTemplate testRestTemplate;

  @LocalServerPort
  private int port;

  /**
   * Monta a URL para a chamada de teste da API
   * @param path - caminho da API
   * @return String
   */
  private String getRootUrl(String path) {
    return "http://localhost:" + port + "/api/v1" + path;
  }

  @Before
  public void before(){
    // tudo o que eu precisar fazer antes de comecar os testes
  }

  @After
  public void after() {
    // tudo o que eu quiser que seja executado apos os testes
  }

  @Test
  public void testaCriacaoDeUmNovoUsuario() {

    // "Chamada da API"
    ResponseEntity<Usuario> postResponse =
        testRestTemplate.postForEntity(
            getRootUrl("/usuarios"),
            UsuarioMock.getUsuarioMock(),
            Usuario.class);

    assertNotNull(postResponse);
    assertEquals(201,
        postResponse.getStatusCodeValue());
  }

  @Test
  public void testaConsultaDeTodosOsUsuarios() {
    HttpHeaders headers = new HttpHeaders();
    HttpEntity<String> entity = new HttpEntity<String>(null, headers);
    ResponseEntity<String> response = testRestTemplate.exchange(getRootUrl("/usuarios"), HttpMethod.GET, entity, String.class);
    assertNotNull(response.getBody());
    assertEquals(200, response.getStatusCodeValue());
  }

  @Test
  public Usuario testaConsultaDeUsuarioPorId(int id) {
    id = 46;
    Usuario usuario = testRestTemplate.getForObject(getRootUrl("/usuarios/" + id), Usuario.class);
    try {
        System.out.println(usuario.getNome());
    } catch (Exception ex){
        System.out.println("Não existe usuario cadastrado com o id: " + id);
    }
    assertNotNull(usuario);
    //assertEquals();

  }

  @Test
  public void testaAtualizacaoDeUmUsuario() {

    // Buscar o usuario com o id = 1
    int id = 1;
    Usuario usuario = testRestTemplate.getForObject(
            getRootUrl("/usuarios/" + id),
            Usuario.class);
    String novoNome = UsuarioMock.getUsuarioMock().getNome();
    String novoEmail = UsuarioMock.getUsuarioMock().getEmail();

    usuario.setNome(novoNome);
    usuario.setEmail(novoEmail);

    // Atualizar usuario
    testRestTemplate.put(getRootUrl("/usuarios/" + id), usuario);

    Usuario usuarioAtualizadp = testRestTemplate.getForObject(getRootUrl("/usuarios/" + id), Usuario.class);
    assertEquals(novoNome, usuarioAtualizadp.getNome());
    assertEquals(novoEmail, usuarioAtualizadp.getEmail());

  }

//  @Test
//    public void testaExclusaoDeUmUsuario() {
//      int id = 1;
//      Usuario usuario = testRestTemplate.getForObject(getRootUrl("/usuarios/") + id, Usuario.class);
//      assertNotNull(usuario);
//      testRestTemplate.delete(getRootUrl("/usuarios/") + id);
//      try {
//        usuario = testRestTemplate.getForObject(getRootUrl("/usuarios/") + id), Usuario.class);
//      } catch (HttpClientErrorException e){
//        assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
//      }
  }



}