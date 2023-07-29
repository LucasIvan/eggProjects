document.addEventListener("DOMContentLoaded", () => {
    let radio = parseFloat(prompt("Ingrese el radio de la circunferencia"));
    let area = Math.PI * Math.pow(radio,2);
    let perimetro = 2 * Math.PI * radio

    document.querySelector("body").innerHTML = `<p>El área de la circunferencia es: ${area.toFixed(3)}<br>
                                                El perímetro de la circunferencia es: ${perimetro.toFixed(3)}</p>`;
})
