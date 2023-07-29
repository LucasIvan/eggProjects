document.addEventListener("DOMContentLoaded", () => {
    let edad = parseInt(prompt("Ingrese su edad"));
    if (edad<18) {
        alert("Es menor de edad!!!")
    } else {
        alert("Es mayor de edad!!!")
    }
})
