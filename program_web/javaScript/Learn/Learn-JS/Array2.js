/*
    Array methods:
        forEach()
        every()
        some()
        find()    :   Trả về khoá học đầu tiên thoả mãn điều kiện
        filter()    :   Trả về các khoá học thoả mãn điều kiện
        map()
        reduce()
 */

var courses = [
    {
        id: 1,
        name: 'JavaScipt',
        coin: 0
    },
    {
        id: 2,
        name: 'HTML,CSS',
        coin: 50
    },
    {
        id: 3,
        name: 'Ruby',
        coin: 50
    },
    {
        id: 4,
        name: 'PHP',
        coin: 50
    },
    {
        id: 5,
        name: 'ReactJS',
        coin: 50
    },
    {
        id: 6,
        name: 'Ruby',
        coin: 50
    },
];


// var course=courses.forEach(function(course,index){
//     console.log(index,course);
// });


// var isFree = courses.every(function (course, index) {
//     return course.coin === 0;
// });
// console.log(isFree);

// var isFree = courses.some(function (course, index) {
//     return course.coin === 0;
// });
// console.log(isFree);

// var course = courses.find(function (course, index) {
//     return course.name === 'Ruby';
// });
// console.log(course);

// var listCourse = courses.filter(function (course, index) {
//     return course.name === 'Ruby';
// });
// console.log(listCourse);









// const sports = [
//     {
//         name: 'Bóng rổ',
//         like: 6
//     },
//     {
//         name: 'Bơi lội',
//         like: 5
//     },
//     {
//         name: 'Bóng đá',
//         like: 10
//     },
// ]




// // Kỳ vọng
// function getMostFavoriteSport(sports){
//     let listSport = sports.filter(function(sport){
//         return sport.like > 5;
//     });
//     return listSport;
// }

// console.log(getMostFavoriteSport(sports)) 
// // Output: [{ name: 'Bóng rổ, like: 6 }, { name: 'Bóng đá, like: 10 }]





