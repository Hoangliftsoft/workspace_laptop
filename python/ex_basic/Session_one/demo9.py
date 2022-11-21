import math
print("Input Number: ", end=" ")
digit = int(input())
sum = 0
for i in range(1, digit+1, 1):
    sum += int(math.pow(i, 2))

print("Sum = {}".format(sum))
