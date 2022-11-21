
var sports = [
    {
        name: 'Bơi lội',
        gold: 11
    },
    {
        name: 'Boxing',
        gold: 3
    },
    {
        name: 'Đạp xe',
        gold: 4
    },
    {
        name: 'Đấu kiếm',
        gold: 5
    },
]


// Case 1:
function getTotalGold(sports) {
    let sumGold = sports.reduce(function (accumulator, currentValue) {
        return accumulator + currentValue.gold;
    }, 0)
    return sumGold;
}
// Expected results:
console.log(`Trường Hợp 1: ${getTotalGold(sports)}`) // Output: 23




// Case 2:
function goldHandler(accumulator, currentValue) {
    return accumulator + currentValue.gold;
}
function getTotalGold(sports) {
    let sumGold = sports.reduce(goldHandler, 0)
    return sumGold;
}
// Expected results:
console.log(`Trường Hợp 2: ${getTotalGold(sports)}`) // Output: 23







