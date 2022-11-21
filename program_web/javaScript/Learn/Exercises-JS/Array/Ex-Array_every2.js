var courses = [
    {
        name: 'JavaScript',
        coin: 680,
        isFinite: true
    },
    {
        name: 'PHP',
        coin: 860,
        isFinite: true
    },
    {
        name: 'Ruby',
        coin: 980,
        isFinite: true
    },
];

Array.prototype.every2 = function (callback) {
    for (var index in this) {
        if (this.hasOwnProperty(index)) {
            var result = callback(this[index], index, this);
            if (!result) {
                return false;
            }
        }
    }
    return true;
}

var result = courses.every2(function (course) {
    return course.isFinite;
});

console.log(result);