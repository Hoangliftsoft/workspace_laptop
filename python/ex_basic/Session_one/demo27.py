print("Input Number one: ", end=" ")
digit_one = int(input())
print("Input Number two: ", end=" ")
digit_two = int(input())
print("Input Number three: ", end=" ")
digit_three = int(input())
if digit_one+digit_two > digit_three and digit_one+digit_three > digit_two and digit_two+digit_three > digit_one:
    print("{} {} {} là tam giác hợp lệ".format(
        digit_one, digit_two, digit_three))
else:
    print("{} {} {} không phải là tam giác hợp lệ".format(
        digit_one, digit_two, digit_three))
