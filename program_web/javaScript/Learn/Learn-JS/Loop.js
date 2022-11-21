// Làm bài
var arr=[];
function getRandNumbers(min,max,length){
    for(var i =0;i<length;++i){
        arr[i] = Math.random() ;
        // arr[i] = Math.floor(Math.random() * (max-min)+min);
    }
    return arr;
};

console.log(getRandNumbers(3,10,10));

for(var i=0;i<10;++i){
    console.log(arr[i]* (10-3)+3);
}

for(var i=0;i<10;++i){
    console.log(Math.floor(arr[i]* (10-3)+3));
}

/**
 * Hết sức lưu ý: Hãy suy nghĩ kỹ để đảm bảo vòng lặp (loop)
 * luôn có điểm dừng, trình duyệt của bạn sẽ bị treo
 * nếu vòng lặp không có điểm dừng.
 * 
 * VD 1: for (var i = 0; i < 100; i--) // i++ mới đúng
 * VD 2: for (var i = 100; i >= 0; i++) // i-- mới đúng
 * là 2 vòng lặp không có điểm dừng (lặp vô hạn)
 * 
 * => Treo trình duyệt!!!
 */


Phan2
var myArray = [
    'JavaScipt',
    'PHP',
    'Java',
    'Dart'
];

var arrayLength = myArray.length;

for(var i=0;i<arrayLength;++i){
    console.log(myArray[i]);
}

Phan3:
var orders = [
    {
        name: 'Khóa học HTML - CSS Pro',
        price: 3000000
    },
    {
        name: 'Khóa học Javascript Pro',
        price: 2500000
    },
    {
        name: 'Khóa học React Pro',
        price: 3200000
    }
]



// Expected results:
// Output: 8700000
function getTotal(orders) {
    var ordersLength = orders.length;
    var sum = 0;
    for(var i=0;i<ordersLength;++i){
        sum += orders[i].price;
    }
    return sum;
};
