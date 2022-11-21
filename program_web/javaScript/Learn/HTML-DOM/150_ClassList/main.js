// ClassList property

// add          :   thêm class vào element
// contains     :   ktra 1 class có nằm trong element
// remove       :   xoá class khỏi element
// toggle       :   có bỏ không có thêm class

var boxElement =
    document.querySelector('.box');

// console.log(boxElement.classList.length);
// console.log(boxElement.classList.value);
// console.log(boxElement.classList[0]);

boxElement.classList.add('red','green');

// console.log(boxElement.classList.contains('red  '));

// setTimeout(()=>{
//     boxElement.classList.remove('red');
// },3000);

setInterval(()=>{
    boxElement.classList.toggle('red');
},1000);