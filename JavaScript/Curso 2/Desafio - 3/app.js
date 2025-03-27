// function imc(){
//     let altura = parseFloat(prompt('Qual a sua altura?'));
//     let peso = parseFloat(prompt('Qual o seu peso?'));

//     let imc = peso / (altura * altura);
//     alert('Seu IMC é ' + imc.toFixed(2));
// }

// imc();

// function calcularFatorial() {
//     let numero = parseInt(prompt("Digite um número para calcular o fatorial:"));
//     if (numero < 0) {
//         return alert("Fatorial não é definido para números negativos.");
//     }

//     let resultado = 1;
//     let contador = numero;

//     while (contador > 1) {
//         resultado *= contador;
//         contador--;
//     }
//     alert(`O fatorial de ${numero} é ${resultado}`);
// }

// calcularFatorial();

function dolar(){
    let dolar = parseFloat(4.80);
    let real = parseFloat(prompt('Quantos reais vocé tem?'));
    let conversao = real / dolar;
    alert('Vocé tem ' + conversao.toFixed(2) + ' dolares');
}

dolar();

