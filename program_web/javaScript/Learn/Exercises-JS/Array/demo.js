var courses = [
    'JavaScript',
    'PHP',
    'Ruby'
];

Array.prototype.map2 = function (callback) {
    var output = [], arrayLength = this.length;
    for (var i = 0; i < arrayLength; ++i) {
        let result = callback(this[i], i);
        output.push(result);
    }
    return output;
};






var htmls = courses.map2(function (course, index) {
    return `<h2>${course}</h2>`;
});
console.log(htmls.join(''));

// document.write(htmls.join(''));