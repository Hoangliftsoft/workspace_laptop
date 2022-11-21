var courses = [
    {
        id: 1,
        name: 'JavaScipt',
        coin: 100
    },
    {
        id: 2,
        name: 'HTML,CSS',
        coin: 200
    },
    {
        id: 3,
        name: 'Ruby',
        coin: 300
    },
    {
        id: 4,
        name: 'PHP',
        coin: 400
    },
    {
        id: 5,
        name: 'ReactJS',
        coin: 500
    }
];

var i = 0;
// accumulator : biến khai báo
// currentValue : mảng được duyệt
// currentIndex : giá trị index
// originArray : all mảng
function coinHandler(accumulator,currentValue,currentIndex,originArray){
    return accumulator + currentValue.coin;
}
var totalCoin = courses.reduce(coinHandler,0);

console.log(totalCoin);