/*Escribir una función flecha que reciba una palabra y la devuelva al revés*/

let flecha = (frase) => frase.split("").reverse().join("");

document.addEventListener("DOMContentLoaded", () => {
    let reversa = flecha(prompt("Ingrese una palabra/frase"))
    document.body.innerHTML = `<h1>${reversa}</h1>`
})