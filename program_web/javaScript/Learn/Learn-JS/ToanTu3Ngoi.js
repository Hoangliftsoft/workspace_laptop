var course = {
    name: 'JavaScipt',
    coin: 250
}

if(course.coin>0){
    console.log(`${course.coin} Coin`);
}else{
    console.log('Miễn Phí');
}

// ->
var result = course.coin > 0 ? `${course.coin} Coin` : 'Miễn Phí';
console.log(result);

EX
var a =1;
var b=2;
var c= a>0 ? a:b;

EX:
// Làm bài
function getCanVoteMessage(age){
    return age >= 18? 'Bạn có thể bỏ phiếu' : 'Bạn chưa được bỏ phiếu';
}



// Kỳ vọng
console.log(getCanVoteMessage(18)) // 'Bạn có thể bỏ phiếu'
console.log(getCanVoteMessage(15)) // 'Bạn chưa được bỏ phiếu'