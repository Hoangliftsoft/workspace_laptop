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

function courseHandler(course,index,originArray){
    return {
        id: course.id,
        name: `Khoa hoc: ${course.name}`,
        coin: course.coin,
        coinText: `Gia: ${course.coin}`,
        index: index,
        // originArray: originArray,
        // originArray: course
    }
}
var newCourse= courses.map(courseHandler);

console.log(newCourse);