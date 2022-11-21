// Flat - "Làm phẳng" mảng từ Depth aray - "Mảng sâu"


// Case: 1
var depthArray = [1, 2, [3, 4], 5, 6, [7, 8, 9]];


var flatArray = depthArray.reduce(function (flatOutput, depthItem) {
    return flatOutput.concat(depthItem);
}, []);

console.log(flatArray);




// Case: 2
var topics = [
    {
        topic: "Front-end",
        courses: [
            {
                id: 1,
                title: "HTML, CSS"
            },
            {
                id: 2,
                title: "JavaScript"
            }
        ]
    },
    {
        topic: "Back-end",
        courses: [
            {
                id: 1,
                title: "PHP"
            },
            {
                id: 2,
                title: "NodeJS"
            }
        ]
    }
];

var newCourses = topics.reduce(function (courses, topic) {
    return courses.concat(topic.courses);
}, []);

console.log(newCourses);