const form = document.getElementById("myForm");

form.addEventListener("submit", (event) => {
  event.preventDefault();

  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;
  const message = document.getElementById("message").value;

  if (name === "" || email === "" || message === "") {
    alert("Please fill all the fields");
    return;
  }

  const output = `Name: ${name}, Email: ${email}, Message: ${message}`;

  document.getElementById("output").innerText = output;
  console.log(output);

  form.reset();
});
