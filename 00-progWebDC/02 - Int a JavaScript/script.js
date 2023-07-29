const form = document.getElementById('myForm');
form.addEventListener('submit', function(event) {
  event.preventDefault();
  validateForm();
});

function validateEmail(email) {
  const regex =  /^[^\s@]+@[^\s@]+\.[^\s@]{2,7}$/
  return regex.test(email)
}

function validateForm() {
  const emailInput = document.getElementById('email');
  const email = emailInput.value;
  if (!validateEmail(email)) {
    alert('No es válido CTM!!!!.');
  } else {
    alert('ENORABUENA SABES INGRESAR UN MAIL xD.');
  }
}

/*
function ValidateEmail(input) {
  var validRegex = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;

  if (input.value.match(validRegex)) {
    alert("Correo válido!");
    document.form1.text1.focus();
    return true;
  } else {
    alert("Correo invalido");
    document.form1.text1.focus();
    return false;
  }
}*/