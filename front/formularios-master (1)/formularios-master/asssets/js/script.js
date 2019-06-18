// function obrigatorio(oQueOUsuarioEscreveu, oNomeQueEuDeiProElemento){
//     if(oQueUsuarioEscreveu, )
// }

// LISTA DE EXERCÍCIOS FORMULÁRIOS E AJAX

//#01a. Validação dos campos do form
let formulario = document.querySelector("form");
formulario.onsubmit = function() {

    if (formulario.nome.value == ""){
        alert("Por favor, digite seu nome!");
        formulario.nome.focus();
        return false;
    }
    if (formulario.idade.value == ""){
        alert("Por favor, digite sua idade!");
        formulario.idade.focus();
        return false;
    }
    if (formulario.senha.value == ""){
        alert("Por favor, digite sua senha!");
        formulario.senha.focus();
        return false;
    }
    if (formulario.senha02.value == ""){
        alert("Por favor, digite novamente a sua senha!");
        formulario.senha02.focus();
        return false;
    }
    //#01b validar se campos senha e senha02 são diferentes
    if (senhasForemDiferentes(formulario.senha.value !== formulario.senha02.value)) {
        alert("Erro! As senhas digitadas são diferentes");
        return false;
    }
    // jeitinho de função
    function senhasForemDiferentes(senhaUm, senhaDois) {
        return senhaUm !== senhaDois;
    }
}

   //#02 pegar conteudo enviado pelo form e armazenar numa string via js
    //var forminho = document.querySelector("#form1");
    
    function getFormvalue(forminho) {  
        let nomeCompleto = forminho.nome1.value + " " + forminho.sobrenome.value;        
        return alert(nomeCompleto);
   }

   //#03 Tirar atributo do form JS "required" 
   // Form é enviado mesmo sem value nos campos.

   //#03 Ocultar e mostrar <ul> com dados inseridos no form
   let cliqueOcultar = document.querySelector("#ocultar");
   cliqueOcultar.onclick = function() {
        alert("Ocultar");

        let formulario = document.querySelector("#form1");
        let lista = "<ul>";

        for (let i = 0; i < formulario.elements.length; i++){
            console.log(formulario.elements[i].value);

            if(formulario.elements[i].type == "text"){
                lista += "<li>Nome: " + formulario.elements[i].name + 
                " - Valor: " + formulario.elements[i].value + "</li>";
            }            
        }

        lista += "</ul>";
        formulario.innerHTML = lista;   
   }
   
   //#03

   function mudaCor() {
       let corpo = document.querySelector("body");

       if (document.getElementById("feminino").checked == true) {
           corpo.style.backgroundColor = "red";
       } else if (document.getElementById("masculino").checked == true) {
            corpo.style.backgroundColor = "green";
       }
   }


  function outrosEspecifique() {
      if (document.getElementById("outros").checked == true) {
        document.getElementById("especifique").style.display = "inline";
      } else {
        document.getElementById("especifique").style.display = "none";
      }
  }
   

// function validaFormulario(formulario){

//     if (formulario.nome.value == ""){

//         // caso o campo esteja vazio
//         alert("Digite seu nome!");

//         // define um focus no campo
//         formulario.nome.focus();

//         // form não é enviado
//         return false;

//     }
// }