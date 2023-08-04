/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A 
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado 
de 20.*/

let a = [];

for (let i = 0; i < 50; i++) {
    a.push(Math.floor(Math.random()*1000));
}

console.log("Arreglo sin ordenar", a);

a.sort((a,b) => a > b ? 1 : a < b ? -1 : 0);

console.log("Arreglo ordenado", a);

let b = a.slice(0,10).concat(Array(10).fill(0.5));

console.log("Arreglo ordenado", a, "Arreglo combinado",b);