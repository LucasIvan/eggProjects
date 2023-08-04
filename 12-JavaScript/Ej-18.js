/*A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
a) Determinar cual de los dos elementos de texto es mayor
b) Utilizando exclusivamente los dos valores booleanos del array, determinar los 
operadores necesarios para obtener un resultado true y otro resultado false
c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los 
dos elementos numéricos*/

var valores = [true, 5, false, "hola", "adios", 2];

let comp = valores[3].localeCompare(valores[4]);

let textoMayor = comp === 1 ? `'${valores[4]}' es mayor que '${valores[3]}'`
                    : comp === -1 ? `'${valores[3]}' es mayor que '${valores[4]}'`
                        : `'${valores[3]}' y '${valores[4]}' son iguales`;
console.log(textoMayor);

let resultadoTrue = valores[0] || valores[2];
let resultadoFalse = valores[0] && valores[2];

console.log(resultadoFalse, resultadoTrue);

let suma = valores[1] + valores[5];
let resta = valores[1] - valores[5];
let multiplicacion = valores[1] * valores[5];
let division = valores[1] / valores[5];
let modulo = valores[1] % valores[5];

console.log(suma,resta,multiplicacion,division,modulo);