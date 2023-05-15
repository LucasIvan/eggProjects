function invertirPalabras(frase) {
    let resultado = "";
    let palabras = frase.split(" ");

    for (let i = 0; i < palabras.length; i++) {
        let palabra = palabras[i];
        for (let j = palabra.length - 1; j >= 0; j--) {
            resultado += palabra[j];
        }
        resultado += " ";
    }
    console.log(resultado);
}