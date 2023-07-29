document.addEventListener("DOMContentLoaded", () => {
    let flag = true;
    let input;
    while (flag) {
        input = prompt("Ingrese S o N").toUpperCase();
        if (input == "S" || input == "N") {
            flag = false;
        } else {
            alert("Incorrecto, vuelva a intentarlo")
        }
    }
});