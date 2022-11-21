print("Input Characters: ", end=" ")
char = str(input())
if char.isupper():
    print("{} là chữ hoa".format(char))
else:
    print("{} không phải là chữ thường".format(char))
