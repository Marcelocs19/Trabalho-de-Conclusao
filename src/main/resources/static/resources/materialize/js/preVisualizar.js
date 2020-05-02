var lista = [[${pesquisa}]];
var pageMax = [[${pesquisa.secoes.size()}]];
var page; 

window.onload = function(){
    this.ini();
};

function getBefore(){
    page = document.getElementById('atual').firstChild.nodeValue;
    console.log(page);
    if(page==1){
        gerar(0,9);
        document.getElementById('atual').innerHTML = page;
    }else if(page==2){
        gerar(0,9);
        page = page - 1;
        document.getElementById('atual').innerHTML = page;
    }else if(page==3){
        gerar(10,19);
        page = page - 1;
        document.getElementById('atual').innerHTML = page;
    }else {
        gerar(20,29);
        page = page - 1;
        document.getElementById('atual').innerHTML = page;
    }
}
function getNext(){
    page = document.getElementById('atual').firstChild.nodeValue;
    console.log(page);
    if(page==1){
        gerar(10,19);
        page++;
        document.getElementById('atual').innerHTML = page;
    }else if(page==2){
        gerar(20,29);
        page++;
        document.getElementById('atual').innerHTML = page;
    }else if(page==3){
        gerar(30,39);
        page++; 
        document.getElementById('atual').innerHTML = page;
    }else {
        gerar(30,39);
        document.getElementById('atual').innerHTML = page;
    }
}
function ini(secoes){
    text = "<table id='customers'>";
    text += "<tr><th>Nomes</th><th>item</th></tr>"
    for (i = 0; i < 10; i++) {
        text += "<tr><td>" + names[i] + "</td><td>" + (i+1) + "</td></tr>";
    }
    text += "</table>";
    document.getElementById("lista").innerHTML = text;
    document.getElementById("atual").innerHTML = page;
}
function gerar(ant, limit){
    text = "<table id='customers'>";
    text += "<tr><th>Nomes</th><th>item</th></tr>"
    for (i = ant; i <= limit; i++) {
        text += "<tr><td>" + names[i] + "</td><td>" + (i+1) + "</td></tr>";
    }
    text += "</table>";
    document.getElementById("lista").innerHTML = text;
}