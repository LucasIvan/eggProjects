/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere el 
límite inicial. */

document.addEventListener("DOMContentLoaded",()=>{
    let limite = parseInt(prompt("Ingrese el límite"));
    let num = 0;
    do {
        num += parseInt(prompt("Ingrese un número"));
    } while (num <= limite);
    document.querySelector("body").innerHTML = `<h1>Limite superado<h1>`
});