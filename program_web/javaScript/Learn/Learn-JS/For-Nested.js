var myArray = [
    [1, 2],
    [3, 4],
    [5, 6]
];

var ArrayLength = myArray.length;
for (var i = 0; i < ArrayLength; ++i) {
    for (var j = 0; j < myArray[i].length; ++j) {
        console.log(myArray[i][j]);
    }
}
