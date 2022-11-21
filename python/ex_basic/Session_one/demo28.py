print("Input Number One: ", end=" ")
a = int(input())
print("Input Number Two: ", end=" ")
b = int(input())
print("Input Number Three: ", end=" ")
c = int(input())

if a+b > c and a+c > b and b+c > a:
    if a == b and b == c:
        print("{0} {1} {2} Là tam giác đều".format(a, b, c))
    elif (a == b) or (a == c) or (b == c):
        print("{0} {1} {2} Là tam giác cân".format(a, b, c))
    elif (a*a == b*b+c*c) or (b*b == a*a+c*c) or (c*c == a*a+b*b):
        print("{0} {1} {2} Là tam giác vuông".format(a, b, c))
    elif (a*a == b*b+c*c) or (b*b == a*a+c*c) or (c*c == a*a+b*b) and (a == b) or (a == c) or (b == c):
        print("{0} {1} {2} Là tam giác vuông cân".format(a, b, c))
    else:
        print("{0} {1} {2} Là tam giác thường".format(a, b, c))
else:
    print("INVALID")
