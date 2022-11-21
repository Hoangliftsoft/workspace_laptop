var date = 5;

switch (date) {
    case 2:
    case 3:
    case 4:
        console.log('Hôm nay là thứ 2,3,4');
        break;
    case 5:
        console.log('Hôm nay là thứ 5');
        break;
    default:
        console.log('INVALID');

}

EX:
function run(fruits) {
    var result;

    switch (fruits) {
        case "Banana":
            result = "This is a Banana";
            break;
        case "Apple":
            result = "This is an Apple";
            break;
        default:
            result = "No fruits";
    }

    return result;
}