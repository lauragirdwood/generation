let btnHello = document.querySelector("#btnHello");

btnHello.addEventListener("click", function(){
    setTimeout (function(){
        alert("Obrigada por esperar 10 segundos!");
    }, 10000);
});

// let corpo = document.querySelector("body");

// corpo.addEventListener("keypress", function(event){
//     let tecla = event.keyCode;
//     if (tecla == 13) {
//         alert("Você clicou enter")
//     } else if (tecla = 32) {
//         alert("Você clicou espaço")
//     }
// });


// elemento = document.querySelector("btnHello")
// document.querySelector("#btnHello").addEventListener("click", function() {
//     console.log(this);
// });

// let btnHello = document.getElementById("btnHello");

// btnHello.addEventListener("click", function(event) {
//     console.log(event.clientX);
//     console.log(event.clientY);
// });



// FORMAS DE USAR EVENTOS NO JS

//1ª forma onclick no javascript
//let btnHello = document.getElementById("btnHello");
//
// btnHello.onclick = function() {
//     alert("Hello!");
// }

//2ª forma addEventListener
// let funcao = function() {
//     alert("Salveeee");
// }
// document.getElementById("btnHello").addEventListener("click", funcao);

//3ª forma onclick no HTML 
// function clicar() {
//     alert("Salveeeeee");
// }
//      +
//  no html, adicionar o atributo onclick com o valor ref ao nome da função declarada no js

