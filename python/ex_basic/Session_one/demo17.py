print("Input Number: ", end=" ")
digit = int(input())
if digit <= 0:
    print("INVALID")
elif (digit % 4) == 0 and (digit % 100) != 0:
    print("{0} là năm nhuận".format(digit))
else:
    print("{0} không phải là năm nhuận".format(digit))
