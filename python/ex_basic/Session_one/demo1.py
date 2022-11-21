
digit_one = int(input("Input number: "))
digit_two = int(input("Input number: "))
summation = digit_one+digit_two
subtraction = digit_one - digit_two
multiplication = digit_one * digit_two
print("\nSum = {0} \nSubtraction = {1} \nMultiplication = {2} ".format(
    summation, subtraction, multiplication), end=" ")

if (digit_one == 0 or digit_two == 0):
    print("\nDevision = NO")
else:
    devision = digit_one / digit_two
    print("\nDevision = %.2f" % devision)


# digit_one = int(input("Input number: "))
# digit_two = int(input("Input number: "))
# summation = digit_one+digit_two
# subtraction = digit_one - digit_two
# multiplication = digit_one * digit_two
# from decimal import*
# getcontext().prec = 2
# devision = Decimal (digit_one) / digit_two
# print("Sum = {0} \nSubtraction = {1} \nMultiplication = {2} \nDevision = {3}".format(summation,subtraction,multiplication,devision))
