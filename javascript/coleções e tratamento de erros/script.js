
// Coleções

// function getAdmins(map) {
//     let admins = [];
//     for ([key, value] of map) {
//         if (value === 'Admin') {
//             admins.push(key);
//         }
//     }
//     return admins;
// }

// const usuarios = new Map();

// usuarios.set('Luiz','Admin');
// usuarios.set('Stephany','Admin');
// usuarios.set('Jorge','User');
// usuarios.set('Natália','Admin');

// console.log(getAdmins(usuarios));

// const meuArray = [30,30,40,5,223,2049,3034,5];

// function valoresUnicos(arr){
//     const mySet = new Set(arr);

//     return [...mySet];
// }

// console.log(valoresUnicos(meuArray));

// Tratamento de erros

function validaArray(arr, num) {
    try {
        if(!arr && !num) 
        throw new ReferenceError("Envie os parämetros");

        if(typeof arr !== 'object') 
        throw new TypeError("Array precisa ser do tipo object");
    
        if(typeof num !== 'number') 
        throw new TypeError("Array precisa ser do tipo number");

        if(arr.length !== num) 
        throw new RangeError("Tamanho inválido!")

        return arr;

    } catch (e) {
        if(e instanceof ReferenceError){
            console.log("Erro do tipo ReferenceError!")
            console.log(e.message)
        }else if(e instanceof TypeError){
            console.log("Erro do tipo TypeError")
            console.log(e.message)
        }else if(e instanceof RangeError){
            console.log("Erro do tipo RangeError!")
            console.log(e.message)
        }else{
            console.log("Tipo de erro nao esperado: " + e)
        }

    }
}

console.log(validaArray([1,2,3,4,5], 5));