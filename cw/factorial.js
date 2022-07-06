function factorial(n) {
    for (let i = 1; i <= n; i++) {
        n *= i;
    }
    return n;
}