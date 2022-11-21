print("Enter Number: ", end=" ")
digit = int(input())
sum = 0
for i in range(1, digit, 1):
    if i % 3 == 0:
        sum += i
print("Sum = {}".format(sum))
