var n1 = prompt("Digite um numero");
var n2 = prompt("Digite um numero");
function soma (a,b){
    return Number(a)+Number(b);
}
var n3 = soma(n1,n2);
if(n3<10){
    var a1="menor que 10";
} else{
    var a1="maior que 10";
}
if(n3<20){
    var a2="menor que 20";
}else{
    var a2="maior que 20";
}
if(n1==n2){
    var a3="Sao iguais";
}else{
    var a3="Sao diferentes";
}
console.log(a3, a2, a1);