print("Input Number: ", end=" ")
digit = int(input())
sum = 0
for i in range(1, digit+1, 1):
    sum += i
print("Sum = {0}".format(sum))
