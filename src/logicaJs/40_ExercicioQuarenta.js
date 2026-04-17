let a = 0, b = 1;
for (let i = 1; i <= 20; i++) {
    console.log(a);
    let prox = a + b;
    a = b;
    b = prox;
}