function User(firstName, lastName, avatar) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.avatar = avatar;

    this.getName = function () {
        return `${firstName} ${lastName}`
    }
}

var author = new User('PHAM', 'HOANG', 'AVATAR');
var user = new User('NGUYEN', 'VAN A', 'AVATAR');

author.title = 'Đây là title';
user.comment = 'Đây là comment';

console.log(author.getName());
console.log(user);