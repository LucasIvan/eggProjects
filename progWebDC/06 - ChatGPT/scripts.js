const contactForm = document.getElementById('contact-form');
const nameInput = document.getElementById('name');
const emailInput = document.getElementById('email');


contactForm.addEventListener('submit', function (event) {

    if (nameInput.value === '' || emailInput.value === '') {
        event.preventDefault();


        alert('Por favor, completa todos los campos.');
    } else {
        alert("Gracias por contactarme");
    }
});