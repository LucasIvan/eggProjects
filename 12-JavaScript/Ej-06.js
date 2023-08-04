/*Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar. 
En caso de que el valor ingresado sea 0, se debe mostrar “el número no es par ni impar”.*/

document.addEventListener("DOMContentLoaded", ()=>{
    let num = parseInt(prompt("Ingrese un número"));
    if (num == 0) {
        document.body.innerHTML = "EL NUMERO ES CERO"
    } else if (num % 2 == 0) {
        document.body.innerHTML = "EL NUMERO ES PAR"
    } else {
        document.body.innerHTML = "EL NUMERO ES IMPAR"
    }
})