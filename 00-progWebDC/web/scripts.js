document.querySelector(".button-menu-toggle").addEventListener('click', function () {
    document.querySelector(".nav-links").classList.toggle("nav-links-responsive");
});

document.addEventListener('DOMContentLoaded', function () {
    const carouselSlides = document.querySelectorAll('.carousel-slide');
    const carouselPrev = document.querySelector('.carousel-prev');
    const carouselNext = document.querySelector('.carousel-next');
    let slideIndex = 0;

    showSlide(slideIndex);

    function showSlide(index) {
        carouselSlides.forEach(function (slide) {
            slide.classList.remove('active');
        });
        carouselSlides[index].classList.add('active');
    }

    function slideNext() {
        slideIndex++;
        if (slideIndex >= carouselSlides.length) {
            slideIndex = 0;
        }
        showSlide(slideIndex);
    }

    function slidePrev() {
        slideIndex--;
        if (slideIndex < 0) {
            slideIndex = carouselSlides.length - 1;
        }
        showSlide(slideIndex);
    }

    carouselNext.addEventListener('click', slideNext);
    carouselPrev.addEventListener('click', slidePrev);

    setInterval(slideNext, 5000);
});

document.addEventListener('DOMContentLoaded', function () {
    const suscripcionForm = document.getElementById('suscripcion-form');
    const contactoForm = document.getElementById('contacto-form');

    suscripcionForm.addEventListener('submit', function (event) {
        event.preventDefault();
        const emailInput = document.getElementById('email-sus');
        const email = emailInput.value.trim();

        if (!validateEmail(email)) {
            alert('Por favor, ingresa un correo electrónico válido.');
            return;
        }
        suscripcionForm.reset();
        alert('¡Te has suscrito exitosamente!');
    });

    contactoForm.addEventListener('submit', function (event) {
        event.preventDefault();
        const nombreInput = document.getElementById('nombre-input');
        const emailInput = document.getElementById('email-input');
        const mensajeInput = document.getElementById('mensaje-input');
        const nombre = nombreInput.value.trim();
        const email = emailInput.value.trim();
        const mensaje = mensajeInput.value.trim();

        if (nombre === '' || email === '' || mensaje === '') {
            alert('Por favor, completa todos los campos.');
            return;
        }
        if (!validateEmail(email)) {
            alert('Por favor, ingresa un correo electrónico válido.');
            return;
        }
        contactoForm.reset();
        alert('¡Mensaje enviado correctamente!');
    });

    function validateEmail(email) {
        const emailRegex = /^\S+@\S+\.\S+$/;
        return emailRegex.test(email);
    }
});