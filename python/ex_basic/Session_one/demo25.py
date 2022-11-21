print("Input Characters: ", end=" ")
char = str(input())
if char == 'z' or char == 'Z':
    print("a")
elif char.isupper():
    number = ord(char) + 33
    print(chr(number))
elif char >= 'a' and char <= 'z':
    number = ord(char) + 1
    print(chr(number))
else:
    print(char)
