print("Input Characters: ", end=" ")
char = input()
if char.islower() or char.isupper():
    print("{} là chữ cái".format(char))
else:
    print("{} không phải là chữ cái".format(char))
