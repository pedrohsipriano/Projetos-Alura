let numeroDeVendas = 50;
let saldoDisponivel = 1000;
let mensagemDeErro = "Erro! Preencha todos os campos!";

alert ("Boas Vindas ao site!");
alert (mensagemDeErro);

let nome = prompt ("Qual seu nome?");
let idade = prompt ("Qual sua idade?");

if (idade >= 18) {
    alert ("voce é maior de idade, pode tirar a carteira de habilitação")
}else{
    alert (" voce é menor de idade, não pode tirar a habilitação")
}