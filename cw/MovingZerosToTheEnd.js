var moveZeros = function (arr) {
    let results = []
    let zeros = []
    arr.forEach(num => {
        if (num === 0) {
            zeros.push(num)
        } else {
            results.push(num)
        }
    })
    return [...results, ...zeros]
}
