print("Input Number one: ", end=" ")
digit_one = int(input())
print("Input Number two: ", end=" ")
digit_two = int(input())
print("Input Number three: ", end=" ")
digit_three = int(input())
print("Max({0},{1},{2}) = {3} \nMin({0},{1},{2}) = {4}".format(digit_one, digit_two, digit_three, max(
    digit_one, digit_two, digit_three), min(digit_one, digit_two, digit_three)))
