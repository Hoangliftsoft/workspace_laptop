var headingElement = 
    document.querySelector('h1');

headingElement.title = 'title test';
console.log(headingElement.title);

headingElement.setAttribute('data', 'test data');
console.log(headingElement.getAttribute('data'));
