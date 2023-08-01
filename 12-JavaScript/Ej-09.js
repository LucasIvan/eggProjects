/*Realizar un programa que pida una frase y el programa deberá mostrar la frase con un 
espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el 
funcionamiento de la función Substring(). */
let frase = "";
let result = "";

function espaciarFrase(frase) {
    for (let i = 0; i < frase.length; i++) {
        result += frase.substring(i,i+1) + " ";
    }
    return result
}

document.addEventListener("DOMContentLoaded", ()=>{
    frase = prompt("Ingrese una frase");
    let fraseEspaciada = espaciarFrase(frase);
    document.querySelector("body").innerHTML = `<h1>${fraseEspaciada}</h1>`
});