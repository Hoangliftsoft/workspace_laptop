var courses = [
    'JavaScript',
    'PHP',
    'Ruby'
];

Array.prototype.map2 = function(callback){
    let output = [], arrLength = this.length;
    for(var i=0;i<arrLength;++i){
        let result = callback(this[i],i);
        output.push(result);
    }
    return output;
}


var htmls = courses.map2(function(courses){
    return `<h2>${courses}</h2>`;
});

console.log(htmls.join(''));


// var htmls = courses.map(function (courses) {
//     return `<h2>${courses}</h2>`;
// });
// console.log(htmls.join(''));
// document.write(htmls.join(''));