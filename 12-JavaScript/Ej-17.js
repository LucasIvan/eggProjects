/*Realizar un programa que elimine los dos últimos elementos de un array. Mostrar el 
resultado*/

function eliminarUltimos(x) {
    if (x.length >= 2) {
        x.pop()
        x.pop()
    }
    console.log(x)
}