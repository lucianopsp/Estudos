// const maca = {value: 2,}
// const laranja = {value: 3,}

// function mapComThis(arr, thisArg){
//     return arr.map(function(item){
//         return item * this.value;
//     }, thisArg);
// }

// const nums = [1, 2];

// console.log('this -> maçã', mapComThis(nums, maca));
// console.log('this -> laranja', mapComThis(nums, laranja));

// function mapSemThis(arr){
//     return arr.map(function(item){
//         return item * 2;
//     });
// }

// const nums = [2, 4, 6, 8, 10];

// console.log(mapSemThis(nums));

// function filtraPares(arr, par){
//     return arr.filter(function(item){
//         return par !== 's' ? item % 2 !== 0 : item % 2 === 0;
//     });
// }

// const valores = [1, 2, 3 , 4, 5, 6, 7, 8];

// console.log(filtraPares(valores, 'n'));

// function somaNumeros(arr){
//     return arr.reduce(function(prev, current){
//         return prev + current;
//     });
// }

// const arr = [1, 2, 16];

// console.log(somaNumeros(arr));

const lista = [
    {name: 'arroz', preco: 15},
    {name: 'estr.tomate', preco: 8},
    {name: 'sal', preco: 12}
]

saldoDisponivel = 100;

function calculaSaldo(saldoDisponivel, lista){
    return lista.reduce(function(prev, current, index){
        console.log('rodada ', index + 1);
        console.log({ prev});
        console.log({current});
        return prev - current.preco;
    }, saldoDisponivel);
}

console.log(calculaSaldo(saldoDisponivel, lista));