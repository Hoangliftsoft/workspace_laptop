print("Input Radius: ", end=" ")
radius = int(input())

peremeter = '%.2f' % (radius * 2 * 3.14)
area = '%.2f' % (radius*radius*3.14)

print("\nPeremeter = {0}\nArea = {1}".format(peremeter, area))
