print("Inpit Number: ", end=" ")
digit = int(input())
sum = 0
for i in range(1, digit+1, 1):
    sum += (1/(i*(i+1)))

sums = '%.2f' % sum
print("Sum = {}".format(sums))
