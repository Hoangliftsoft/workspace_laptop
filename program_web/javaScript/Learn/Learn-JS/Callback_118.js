function myFunction(parameter) {
    if (typeof parameter === 'function') {
        parameter('Phạm Quốc Hoàng');
    }
}

function myCallback(name) {
    console.log(`Name : ${name}`);
}

myFunction(myCallback);
