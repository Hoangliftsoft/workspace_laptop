import math
print("Input X1: ", end=" ")
x1 = int(input())
print("Input y1: ", end=" ")
y1 = int(input())
print("Input x2: ", end=" ")
x2 = int(input())
print("Input y2: ", end=" ")
y2 = int(input())

oxy = '%.2f' % (math.sqrt(pow(x2-x1, 2)+pow(y2-y1, 2)))
print("Khoang Cach = {0}".format(oxy))
