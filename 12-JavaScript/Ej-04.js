/*Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. Si el usuario 
ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla 
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”*/

document.addEventListener("DOMContentLoaded", () => {
    let flag = true;
    let input;
    while (flag) {
        input = prompt("Ingrese S o N").toUpperCase();
        if (input == "S" || input == "N") {
            alert("CORRECTO")
            flag = false;
        } else {
            alert("INCORRECTO, vuelva a intentarlo")
        }
    }
});