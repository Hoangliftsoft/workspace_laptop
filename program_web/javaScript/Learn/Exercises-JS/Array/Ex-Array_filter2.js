var courses =[
    {
        name: 'JavaScript',
        coin: 680
    },
    {
        name: 'PHP',
        coin: 860
    },
    {
        name: 'Ruby',
        coin: 980
    }
];

Array.prototype.filter2 = function(callback){
    var output = [];
    for(var index in this){
        if(this.hasOwnProperty(index)){
            var result = callback(this[index],index,this);
            if(result){
                output.push(this[index]);
            }
        }

    }
    return output
}

var filterCourses = courses.filter2(function(course,index,array){
    return course.coin > 700;
});

console.log(filterCourses);