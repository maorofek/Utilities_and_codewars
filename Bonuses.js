let bonus = function(arr, s) {
    let num = arr.reduce((total, num) => total+(1/num),0);
    return arr.map(x=>Math.round(s/(num*x)));
}