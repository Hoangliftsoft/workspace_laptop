
// // Object
// console.log('Ex1: Object');
// var myInfo = {
//     name: 'Hoang',
//     age: 18,
//     address: 'Quang Ngai, VN'
// };

// for (var key in myInfo) {
//     console.log(key);
// }

// console.log('--------------');

// for (var key in myInfo) {
//     console.log(myInfo[key]);
// }

// // Array
// console.log('Ex2: Array');
// var languages = [
//     'JavaScript',
//     'PHP',
//     'Ruby',
//     'Java'
// ];

// for(var key in languages){
//     console.log(key);
// }

// console.log('--------------');

// for(var key in languages){
//     console.log(languages[key]);
// }

// // String
// console.log('Ex3: String');
// var myString ='JavaScipt';

// for(var key in myString){
//     console.log(key);
// }

// console.log('--------------');

// for(var key in myString){
//     console.log(myString[key]);
// }



// // EX1:
// function run(object) {
//     var arr= [];
//     for(var key in object){
//         arr.push  (`Thuộc tính ${key} có giá trị ${object[key]}`);
//     }
//     return arr;
// }

// // Expected results:
// console.log(run({ name: 'Nguyen Van A', age: 16 }));
// // Output:
// // [
// //     "Thuộc tính name có giá trị Nguyen Van A",
// //     "Thuộc tính age có giá trị 16"
// // ]