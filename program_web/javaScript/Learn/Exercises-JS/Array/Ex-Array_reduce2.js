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

var totalCoin = courses.reduce(function (total, course) {
    return total + course.coin
}, 0);

console.log(totalCoin);


// Không cần đặt accumulator
var numbers = [0, 50, 50, 50, 50, 50];
var totalCoin = numbers.reduce(function (total, number) {
    return total + number;
});

console.log(totalCoin);

