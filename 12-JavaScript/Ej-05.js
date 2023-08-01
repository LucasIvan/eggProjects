/*Construir un programa que simule un menú de opciones para realizar las cuatro 
operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores 
numéricos enteros. El usuario, además, debe especificar la operación con el primer 
carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’ 
o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división. */

document.addEventListener("DOMContentLoaded", () => {
    let num1 = parseFloat(prompt("Ingrese un número"));
    let num2 = parseFloat(prompt("Ingrese otro número"));
    let flag = true
    while (flag) {
        opcion = prompt(`
        Seleccione la operación que desea realizar:
        s - suma
        r - resta
        d - división
        m - multiplicación
        e - salir
        `).toUpperCase();

        switch (opcion) {
            case "S":
                alert(`El resultado de la suma es: ${num1 + num2}`)
                break;
            case "R":
                alert(`El resultado de la suma es: ${num1 - num2}`)
                break;
            case "D":
                alert(`El resultado de la suma es: ${num1 / num2}`)
                break;
            case "M":
                alert(`El resultado de la suma es: ${num1 * num2}`)
                break;
            case "E":
                flag = false;
                break;
            default:
                alert("Opción inválida")
                break;
        }
    }
})
