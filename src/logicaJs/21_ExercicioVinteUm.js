let num = parseInt(prompt("Número:"));
let i = 1;
do {
    if (num % i === 0) console.log(i);
    i++;
} while (i <= num);