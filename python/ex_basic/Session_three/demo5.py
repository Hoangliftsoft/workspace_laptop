print("Enter Number: ", end=" ")
digit = int(input())
sum = 0
for i in range(1, digit+1, 1):
    sum += (1/(2*i))
print("Sum = %.2f" % sum)
