print("Input Number: ", end=" ")
digit = input()
if digit.isdigit():
    print("{} là chữ số".format(digit))
else:
    print("{} không phải là chữ số".format(digit))
