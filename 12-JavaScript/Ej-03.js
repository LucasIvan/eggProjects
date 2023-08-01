/*Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de 
edad se debe mostrar un mensaje indicándolo. */

document.addEventListener("DOMContentLoaded", () => {
    let edad = parseInt(prompt("Ingrese su edad"));
    if (edad<18) {
        alert("Es menor de edad!!!")
    } else {
        alert("Es mayor de edad!!!")
    }
})
