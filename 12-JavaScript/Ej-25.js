/*Escriba una función de JavaScript para obtener los valores de Nombre y Apellido del 
siguiente formulario.
<!DOCTYPE html>
<html>
<head>
    <meta charset=utf-8 />
    <title>Obtener nombre y apellido de form </title>
</head>
<body>
    <form id="form1" onsubmit="getFormValores()">
        Nombre: <input type="text" name="nombre" value="David"><br>
        Apellido: <input type="text" name="apellido" value="Beckham"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>*/

let formulario = `<form id="form1">
        Nombre: <input type="text" name="nombre" value="David"><br>
        Apellido: <input type="text" name="apellido" value="Beckham"><br>
        <input type="submit" value="Submit">
    </form>`

document.addEventListener("DOMContentLoaded",()=>{
    document.body.innerHTML = formulario;
    document.querySelector("form").addEventListener("submit",(event)=>{
        event.preventDefault();
        let nombre = document.getElementsByName("nombre")[0].value;
        let apellido = document.getElementsByName("apellido")[0].value;
        console.log(nombre,apellido);
    })
})
