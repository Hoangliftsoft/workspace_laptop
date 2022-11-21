print("Input Number: ", end=" ")
digit = int(input())

if (digit % 3) == 0 and (digit % 5) == 0:
    print("{} chia hết cho 3 và 5".format(digit))
else:
    print("{} không chia hết cho 3 và 5".format(digit))
