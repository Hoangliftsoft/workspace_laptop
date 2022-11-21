print("Input Characters: ", end=" ")
char = str(input())
if char.islower():
    print("{} là chữ thường".format(char))
else:
    print("{} không phải là chữ thường".format(char))
