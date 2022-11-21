var courses = [
    'JavaScript',
    'PHP',
    'Ruby'
];

Array.prototype.forEach2 = function (callback) {
    for (var index in this) {
        if (this.hasOwnProperty(index)) {
            console.log(this[index], index, this)
        }
    }
}

courses.push('Html', 'Css');


courses.forEach2(function (course, index, array) {
    console.log(course, index, array);
});