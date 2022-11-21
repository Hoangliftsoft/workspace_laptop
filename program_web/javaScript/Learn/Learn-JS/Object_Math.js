/**
 * Math object
 *
 * - Math.PI()      :   Số Pi
 * - Math.round()   :   Làm tròn số
 * - Math.abs()     :   Giá trị tuyệt đối
 * - Math.ceil()    :   Làm tròn trên
 * - Math.floor()   :   Làm tròn dưới
 * - Math.random()  :   Trả về một số thập phân ngẫu nhiên
 * - Math.min()     :   Trả về giá trị nhỏ nhất
 * - Math.max()     :   Trả về giá trị lớn nhất
 *
 */

console.log(Math.PI);
console.log(Math.round(1.3));
console.log(Math.abs(-4));
console.log(Math.ceil(4.00000001));
console.log(Math.floor(4.9999999));
console.log(Math.random());
console.log(Math.min(-100, 1, 90, 50, 40));
console.log(Math.max(-100, 1, 90, 50, 40));






// Áp dụng random
console.log(Math.floor(Math.random() * 10));  // Ứng dụng random số

// Áp dụng cho game
var random = Math.floor(Math.random() * 5);
var bonus = [
    '10 coin',
    '20 coin',
    '30 coin',
    '40 coin',
    '50 coin'
];
console.log(bonus[random]);

// Áp dụng cho game có tỉ lệ
var random = Math.floor(Math.random() * 100);
if (random < 50) {
    console.log('Cường hoá thành công!');
}




EX:
function getRandomItem(array) {
    var random = Math.floor(Math.random() * array.length);
    return array[random];
}

var myArray = [
    'array1',
    'array2',
    'array3'
];

console.log(getRandomItem(myArray));