// Tạo mảng
var languages = [
    'JavaScript',
    'PHP',
    'Ruby',
];

console.log(languages);

// Note: Kiểm tra có phải là arr trả về true false
console.log(Array.isArray(languages));

console.log(Array.isArray({}))
console.log(Array.isArray(new Array(1, 2)));

// Note: Kiểm tra độ dài mảng
console.log(languages.length);

// Note: Lấy phần tử theo index
console.log(languages[0]);

// Làm việc với Array
// 1. Note: ToString: chuyển Array sang String
console.log(languages.toString());

// 2.Note: Join: chuyển Array sang String được xoá dấu ','
console.log(languages.join(" - "));

// 3.Note: Pop: xoá element cuối mảng và trả về phần tử đã xoá
console.log(languages.pop()); 
console.log(languages);


// 4.Note: Push: thêm phần tử cuối mảng và trả về độ dài mới của mảng
console.log(languages.push('Dart', 'Java'));
console.log(languages); 

// 5.Note: shift: xoá element đầu mảng và trả về phần tử đã xoá
console.log(languages.shift());
console.log(languages);


// 6.Note: Push: thêm phần tử đầu mảng và trả về độ dài mới của mảng
console.log(languages.unshift('Dart', 'Java'));
console.log(languages);

// 7.Note: Splicing(stt muốn xoá, số element muốn xoá, string muốn chèn)
// Note: xoá element
languages.splice(1, 2);
console.log(languages);
// Note: chèn element
languages.splice(1, 0, 'Dart', 'Java');
console.log(languages);

// 8.Concat: Nối 2 Array
var languages2 = [
    'Dart',
    'Ruby'
];
console.log(languages.concat(languages2));

// 9.Note: Slicing: Cắt Array đầu và cuối
console.log(languages.slice(1,2))
// Note: Truyền số âm để lấy từ cuối mảng
console.log(languages.slice(-2, -1))
// Note: Truyền số 0 để coppy mảng
console.log(languages.slice(0))




