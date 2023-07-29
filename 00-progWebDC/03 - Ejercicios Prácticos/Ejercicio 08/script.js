const form = document.getElementById("formulario");
const emailInput = document.getElementById("email");
const ageInput = document.getElementById("edad");

form.addEventListener("submit", function (event) {
    event.preventDefault();

    document.getElementById("email-error").textContent = '';
    document.getElementById("edad-error").textContent = '';

    const emailRegex = /^nacho-ff@mail.com.ar$/;
    if (!emailRegex.test(emailInput.value)) {
        document.getElementById("email-error").textContent = "Correo inválido.";
    }

    if (isNaN(ageInput.value) || ageInput.value <= 0) {
        document.getElementById("edad-error").textContent = "La edad debe ser un número mayor a 0.";
    }
});