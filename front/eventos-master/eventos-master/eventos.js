let btnclick = document.querySelector("#clique");
let btnclick02 = document.querySelector("#clique02");
let btnclick03 = document.querySelector("#clique03");
let inputTxt = document.querySelector("#texto");

btnclick.onclick = function() {
    //alert("Eu fui clicado!");   
    // inputTxt.style.borderColor = "red";
    // inputTxt.style.background = "yellow";
    if(btnclick03.style.display == "none"){
        btnclick03.style.display = "inline";
    } else {
        btnclick03.style.display = "none";
    }    
}

inputTxt.onkeydown = function(event) {
    let keycode = event.keyCode;
    // 13 É A TECLA ENTER 
    if(keycode == 13){
        alert("teclei uma tecla kkk");
    }
}

