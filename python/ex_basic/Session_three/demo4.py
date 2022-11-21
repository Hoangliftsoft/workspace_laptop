print("Enter Number: ", end=" ")
digit = int(input())
sum = 0
for i in range(1, digit+1, 1):
    sum += (1/i)
print("Sum = %.3f" % sum)


# from decimal import*
# getcontext().prec = 4
# print("Enter Number: ", end=" ")
# digit = int(input())
# sum = 0
# for i in range(1, digit+1, 1):
#     sum += (1/Decimal(i))
# print("Sum = {}".format(sum))
