var array = ['a', 'b', 'c', 'a', 'b', 'c'];

console.log(new Set(array));
console.log([...(new Set(array))]);


var inPut = prompt('Nhập Đầu Vào: ');

function countDown(num) {
    if (num > 0) {

        // Loop  
        console.log(num);
        return countDown(num - 1);
    }
    return num;
}

countDown(inPut);


// Vòng Lặp
var array = ['JavaScipt', 'PHP', 'Ruby'];

function loop(start, end, cb) {
    if (start < end) {
        cb(start);
        return loop(start + 1, end, cb);
    }

}

loop(0, array.length, function (index) {
    console.log(array[index]);
});

// Giai thừa
function giaiThua(number) {
    var output = 1;
    if (number > 0) {
        return number * giaiThua(number - 1);
    }
    return 1;
}
console.log(giaiThua(6));