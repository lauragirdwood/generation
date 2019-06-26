package org.generation.brazil.gfood.cliente;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class ClienteController {

    //@ResponseBody
    //@RequestMapping("/index")  //antigo
    @GetMapping("/index") //novo
    public String index() {
        return "Uma mensagem de teste!";
    }

    @PostMapping("/post") //novo
    public String post() {
        return "Não dá pra fazer pelo navegador!";
    }

}
