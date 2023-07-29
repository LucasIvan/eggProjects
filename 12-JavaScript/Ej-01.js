document.addEventListener("DOMContentLoaded", () => {
    let dia = prompt("¿Cómo está el día de hoy?\nsoleado/nublado/lloviendo");
    document.querySelector("body").textContent = `El día de hoy está ${dia}`;
})
