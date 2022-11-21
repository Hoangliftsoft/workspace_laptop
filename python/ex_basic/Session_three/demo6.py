import math
print("Enter Number: ", end=" ")
digit = int(input())
sum = 0
for i in range(1, digit+1, 1):
    sum += int((i*math.pow(-1, i)))
print("Sum = {}".format(sum))
