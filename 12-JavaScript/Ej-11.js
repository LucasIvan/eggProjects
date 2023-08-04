/*Escribir una función que reciba un String y devuelva la palabra más larga. 
String Ejemplo: “Guia de JavaScript”
Resultado esperado : “JavaScript”*/

function masLarga(frase) {
    const palabras = frase.split(" ");
    comp = palabras[0];
    for (let i = 1; i < palabras.length; i++) {
        if (palabras[i].length > comp.length) {
            comp = palabras[i];
        }
    }
    return comp
}