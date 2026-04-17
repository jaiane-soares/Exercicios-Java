let i = 1, a = 0, b = 1;
do {
    console.log(a);
    let prox = a + b;
    a = b;
    b = prox;
    i++;
} while (i <= 20);