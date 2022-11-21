// search: javaScipt date object mozilla

var date = new Date();

var day = date.getDate();
var month = date.getMonth() + 1;
var year = date.getFullYear();


console.log(day);
console.log(month);
console.log(year);

console.log(`${day}/${month}/${year}`);




// EX:
function getNextYear(year) {
    year = new Date();
    return year.getFullYear() + 1;
}

console.log(getNextYear(2022));