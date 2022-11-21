import math
from decimal import*
from unicodedata import decimal
getcontext().prec = 2
print("Enter the first number: ", end=" ")
first = int(input())
print("Enter the second number: ", end=" ")
second = int(input())
print("Enter the third number: ", end=" ")
third = int(input())
denta = math.pow(second, 2)-4*first*third

if first == 0 and second == 0 and third == 0:
    print("Phương trình có vô số nghiệm")
elif denta < 0:
    print("Phương trình vô nghiệm")
elif denta > 0:
    print("{} {}".format(Decimal(-second+math.sqrt(denta)) /
          (2*first), Decimal(-second-math.sqrt(denta))/(2*first)))
