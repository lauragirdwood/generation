// Seletores #01
let esconder = document.getElementById("titular");
esconder.style.display = "none";
// Essa tira o elemento e reajusta sem o espaço que ele preenchia na tela
//document.getElementById("titular").style.display = "none";
// Essa deixa o espaço que o elemento preenchia na tela
//document.getElementById("titular").style.visibility = "hidden"; 


// Seletores #02
let coruja = document.querySelector("#lechuza");
coruja.style.filter = "grayscale(100%)";
// Jorge:
//document.querySelector("#lechuza").style.filter = "grayscale(100%)"



// Seletores #03
let campos = document.querySelectorAll("input");
for (let i = 0; i < campos.length; i++) {
    campos[i].style.background = "red";
}
let textArea = document.querySelector("textarea");
textArea.style.background = "red";
// Jorge:
// document.querySelectorAll("input").forEach(function(item){
//     item.style.background = "red";
// });



// DOM - Seletores e Atributos #01
let copy = document.getElementById("copyright");
console.log(copy.attributes);
// Jorge:
//console.log(document.getElementById("copyright").attributes);



// DOM - Seletores e Atributos #02
let twitter = document.querySelector("a.fa-twitter");
console.log(twitter.getAttribute("href"));
// Jorge:
//console.log(document.querySelector("a.fa-twitter").getAttribute("href"));



// DOM - Seletores e Atributos #03
let facebook = document.querySelector("a.fa-facebook");
console.log(facebook.getAttribute("href"));
//console.log(document.querySelector("a.fa-facebook").getAttribute("href"));



// DOM - Seletores e Atributos #04
let youtube = document.querySelector("a.fa-youtube");
youtube.setAttribute("href", "https://www.youtube.com/channel/UCRQdwmWMhTcqDFjPT4UPZYA");
youtube.setAttribute("target", "_blank");
// Karine
// let e = document.querySelectorAll("a");
// console.log(e[22].getAttribute("href")); 
// console.log(e[23].getAttribute("href")); 
// console.log(e[24].setAttribute("href", "https://www.youtube.com/channel/UCRQdwmWMhTcqDFjPT4UPZYA"));
// Jorge
// document.querySelector("a.fa-youtube").setAttribute("href", "https://www.youtube.com/channel/UCRQdwmWMhTcqDFjPT4UPZYA");



// DOM - Seletores e Atributos #05
let form = document.querySelector("form");
console.log(form.hasAttribute("action"));

// Jorge (preferível ser o mais específico possível nos seletores ;)
// console.log(document.querySelector(".formulario").hasAttribute("action"));



// DOM - Seletores e Atributos #06
 form.removeAttribute("url");
 form.setAttribute("action", "http://www.digitalhouse.com")

// Jorge v01
// let formulario = document.querySelector(".formulario");
// let url = formulario.getAttribute("url");
// formulario.removeAttribute("url");
// formulario.setAttribute("action", url);

// Jorge v02
// let formulario = document.querySelector(".formulario");
// formulario.setAttribute("action", formulario.getAttribute("url"));
// formulario.removeAttribute("url");



// DOM - Seletores e Atributos #07
let vermelhou = document.querySelectorAll("h2");
for (let i = 0; i < vermelhou.length; i++){
    vermelhou[i].style.color = "red";
}
// Jorge
// document.querySelectorAll("h2").forEach(function(h2){
//     h2.style.color = "red";
// });



// DOM - Seletores e Atributos #08
let amarelou = document.querySelectorAll(".icon");
for (let i = 0; i < amarelou.length; i++){
    amarelou[i].style.color = "yellow";
}
// Jorge
// document.querySelectorAll(".icon").forEach(function(icon){
//     icon.style.background = "yellow";
// })



// Elementos #01
let topo = document.querySelector("a#top");
topo.textContent = "Topo";
let trabalho = document.querySelector("a#work");
trabalho.textContent = "Trabalho";
let portfolio = document.querySelector("a#portfolio");
portfolio.textContent = "Portfólio";
let contato = document.querySelector("a#contact");
contato.textContent = "Contato";
// Jorge
// document.getElementById("top").textContent = "Topo";
// document.getElementById("work").textContent = "Trabalho";
// document.getElementById("portfolio").textContent = "Porfólio";
// document.getElementById("contact").textContent = "Contato";


// Elementos #02
let social = document.querySelector(".social");
let socialFilho = social.children.item(3);
social.removeChild(socialFilho);

// Jorge
// let pai = document.querySelector(".social");
// let filho = pai.children.item(3);
// pai.removeChild(filho);