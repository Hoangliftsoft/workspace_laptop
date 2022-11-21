digit = int(input('Nhập vào một số nguyên: '))

def factorial(n):
    fac = 1
    for i in range(1,n+1):
        fac *= i
    return fac

print(','.join(str(factorial(digit))))

    



    