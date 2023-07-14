for (let i = 0; i < 10; i++) {
  let number;
  do {
    number = Math.floor(Math.random() * 10);
  } while (number == 0);
  console.log(`${number}: ${decimalABinario(number)}`);
}

function decimalABinario(decimal) {
  let pila = [];
  let binario = "";

  while (decimal > 0) {
    let resto = decimal % 2;
    pila.push(resto);
    decimal = Math.floor(decimal / 2);
  }

  while (pila.length > 0) {
    binario += pila.pop().toString();
  }

  return binario;
}
