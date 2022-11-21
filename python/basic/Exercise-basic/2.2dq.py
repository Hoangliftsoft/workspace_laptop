digit = int(input('Nhập vào một số nguyên: '))

def factorial(n):
    if(n == 0):
        return 1
    return n*factorial(n-1)

print(factorial(digit))