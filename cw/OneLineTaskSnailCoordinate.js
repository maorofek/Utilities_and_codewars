snailCoordinate = n => [0, 1 - n, 2, 1 + n][n % 4] / 2
//TODO
let snail = function (arr) {
    let result = [];

    while (arr.length > 0) {
        result = result.concat.apply(result, arr.splice(0, 1));

        for (let i = 0; i < arr.length; i += 1) {
            result = result.concat(arr[i].splice(arr.length));
        }

        let temp = [].concat.apply([], arr.splice(arr.length - 1)).reverse();
        result = result.concat.apply(result, temp);

        for (let i = arr.length - 1; i >= 0; i -= 1) {
            result = result.concat(arr[i].splice(0, 1));
        }
    }
    return result;
}