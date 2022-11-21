// Array
var languages = [
    'JavaScript',
    'PHP',
    'Java'
];

for(var value of languages){
    console.log(value);
}

// String
var languages = 'JavaScript';

for(var value of languages){
    console.log(value);
}

// Object
var myInfo = {
    name:'Hoang',
    age:18
};

for(var value of Object.values(myInfo)){
    console.log(value);
}

for(var value of Object.keys(myInfo)){
    console.log(myInfo[value]);
}