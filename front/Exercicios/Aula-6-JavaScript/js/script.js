/*
var diaDaSemana = "Sexta-Feira";

if (diaDaSemana == "Domingo") {
	console.log("Dia do churrasco");
}else if (diaDaSemana == "Quarta-feira") {
	console.log("Dia de feijoada");	
}else if (diaDaSemana == "Sexta-Feira") {
	console.log("Decreto");	
}else{
	console.log("Hoje não é dia de churrasco");
}
console.log("Programa finalizado");

(diaDaSemana == "Sexta-Feira") ? console.log("Dia de ping-pong") : console.log("Dia de estudar");
*/


/*
var sintomas = prompt("Qual o sintoma? Tosse ou febre: ")
switch (sintomas){
	case "tosse":
		alert("Turbeculose");
		break;
	case "febre":
		alert("Dengue");
		break;
	default:
		alert("Virose");
}
*/

/*
var cnh = true;
var idade = 18;

if (idade >= 18 && cnh == false){
	console.log("Pode tirar CNH");
}else{
	console.log("Complete a idade minima ou você já possui CNH")
}
console.log("Programa finalizado")
*/

/*
var colorOne = "green";
var colorTwo = "yellow";

if (colorOne == "green" || colorTwo == "yellow"){
	console.log("Maybe this is a Brazil flag")
}else{
	console.log("This is another flag")
}
*/

/*
var diasDaSemana = ["Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"]

for (let i=0; i < diasDaSemana.length; i++){
	console.log(i);
	console.log(diasDaSemana[i]);
}
*/

/*
var diasDaSemana = ["Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"]

for (let i=0; i < diasDaSemana.length; i++){
	console.log(diasDaSemana[i]);
	if (diasDaSemana[i] == "Quarta") {
		break;
	}
}
*/

/*
var senha = true
while (senha) {
    console.log("Entrou");
    senha = false;
}
*/
/*
senha = true;
i = 0;

do {
	console.log(i)

} while {

}
*/

function imprimir (valor){
	console.log(valor);
}
 imprimir('Seja bem-vindo, meu consagrado');

//
function produto(a, b) {
	return a * b;
}
console.log("A multiplicação dos produtos é "+produto(10, 2));
//
let nomeFuncao = function (){
	console.log('Olá');
}
nomeFuncao();
// Função aninhada
// function circunferencia(raio) {
// 	function diametro(){
// 		return raio*2;
// 	}
// }

/*-----------------------------------*/

// function a(callback){
// 		console.log('a vem primeiro');
// 	setTimeout(function(){
// 		callback();
// 	}, 3000);
// }
/*-----------------------------------

// function b() {
// 	console.log("b vem depois");
// }
// a(b);*/

/*-----------------------------------*/

//
// var numeros = [1,2,3,4,5];

// numeros.forEach(function(value, index){
// 	console.log("No indice: " + index + " tem o valor: " + value);
// 	console.log(index+" = "+value)
// });
/*-----------------------------------*/
// var numeros = [1,2,3,4,5];

// let nums = numeros.map(function(numero){
// 	return numero * 2;
// });
// console.log(nums);
/*-----------------------------------*/

// let array = [10,20,30];

// let numeros = array.filter(function(numero){
// 	return numero >= 18;
// });

// console.log(numeros);

/*-----------------------------------*/

// let array = [10,20,30];

// let numeros = array.reduce(function(a, b){
// 	return a * b;
// });

// console.log(numeros);

/*-----------------------------------*/
let carro = {
	marca: "chevrolet",
	modelo: "corsa",
	km: 65000,
	cor: "azul",
	ligar:function(nome){console.log("vrum vrum")},
	motorista: function(nome) {console.log(nome + " está dirigindo")},
	donos: ["Pedro", "Clara", "João"]
}
console.log(carro.ligar());
console.log(carro.motorista("Rachador"));
