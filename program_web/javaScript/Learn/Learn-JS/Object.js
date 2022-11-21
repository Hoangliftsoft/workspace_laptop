var myInfo = {
    name: 'Son Dang',
    age: 18,
    address: 'Ha Noi, VN'
};

// Note : Thêm 1 key
myInfo.email = 'sondn@fullstack.edu.vn';

// Note : Thêm 1 key có vi phạm quy tắc đặt tên
myInfo['my-email'] = 'sondn@fullstack.edu.vn';

// Note : lấy ra key
console.log(myInfo.name)

// Note : lấy ra key
console.log(myInfo['address']);

// Note : tìm key trong Object
var myKey = 'address';
console.log(myInfo[myKey]); // không truyền myKey dạng String

// Note : Xoá 1 key
delete myInfo.age;


console.log(myInfo);