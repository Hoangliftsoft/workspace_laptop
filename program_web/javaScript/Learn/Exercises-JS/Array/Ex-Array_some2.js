var courses = [
    {
        name: 'JavaScript',
        coin: 680,
        isFinite: true
    },
    {
        name: 'PHP',
        coin: 860,
        isFinite: false
    },
    {
        name: 'Ruby',
        coin: 980,
        isFinite: false
    },
];

Array.prototype.some2 = function (callback) {
    for (var index in this) {
        if (this.hasOwnProperty(index)) {
            if (callback(this[index], index, this)) {
                return true;
            }
        }
    }
    return false;
}

var result = courses.some2(function (course) {
    return course.isFinite;
});

console.log(result);