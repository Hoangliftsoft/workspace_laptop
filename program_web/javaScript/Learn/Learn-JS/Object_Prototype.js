function User(firstName, lastName, avatar) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.avatar = avatar;

    this.getName = function () {
        return `${firstName} ${lastName}`;
    }
}

User.prototype.className = 'F8';
User.prototype.getClassName = function () {
    return this.className;
}

var user = new User('PHAM', 'HOANG', 'AVATAR');
var user2 = new User('NGUYEN', 'VAN A', 'AVATAR');

// author.title = 'Đây là title';
// user.comment = 'Đây là comment';

console.log(user.className);
console.log(user2.getClassName());





EX:
// Làm bài tại đây
function Student(firstName, lastName) {
    this.firstName = firstName,
        this.lastName = lastName
}

Student.prototype.getFullName = function () {
    return `${this.firstName} ${this.lastName}`;
}


// Ví dụ khi sử dụng
var student = new Student('Long', 'Bui');

console.log(student.firstName);  // 'Long'
console.log(student.lastName);  // 'Bui'
console.log(student.getFullName());  // 'Long Bui'