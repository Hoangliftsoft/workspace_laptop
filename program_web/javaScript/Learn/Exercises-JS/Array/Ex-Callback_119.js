function sumCb(a, b) {
    return a + b;
}
function subCb(a, b) {
    return a - b;
}
function multiCb(a, b) {
    return a * b;
}
function divCb(a, b) {
    return a / b;
}


function caculate(a, b, cb) {
    return cb(a, b);
}

// Expected results
console.log(caculate(1, 2, sumCb))
console.log(caculate(1, 2, subCb))
console.log(caculate(1, 2, multiCb))
console.log(caculate(3, 1, divCb))




