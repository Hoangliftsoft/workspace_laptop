 // Expected results:
var arr = [
    ['name', 'Sơn Đặng'],
    ['age', 18],
];
function arrToObj(arr){
    return arr.reduce(function(index,info){
        index[info[0]] = info[1];
        return index;
    },{});
};
console.log(arrToObj(arr)); // { name: 'Sơn Đặng', age: 18 }
