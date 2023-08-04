/*Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y 
muestre el siguiente array [6, 9, 12, 15, 18].*/


let matriz = [[3], [6], [9], [12], [15]];
let result = [];

let conv = (matriz) => {
    result = matriz.map(element => element[0]);
    let a = result.shift();
    result.push(result[result.length - 1] + a);
    return result;
};

conv(matriz)
console.log(result)

