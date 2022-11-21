# kiểm tra kiểu dữ liệu số nguyên
a = 1
print(a)
print(type(a))

# kiểm tra kiểu dữ liệu số thực
b = 1.5
print(b)
print(type(b))

# lấy toàn bộ nội dung của thư viện decimal
from decimal import*
# lấy tối đa 30 chữ số phần nguyên và phần thập phân Decimal
getcontext().prec = 10
f=Decimal(10)/Decimal(3)
print(f)
print(type(f))

# phân số
from fractions import*
frac1= Fraction(6,9)
frac2= Fraction(5,10)
frac3= frac1+frac2
print(frac3)

# số phức
c = complex(2,5)
print(c)
# phần thực
print(c.real)
# phần ảo
print(c.imag)

# chuỗi --------------
# in nhiều dòng
print(5*"hello world!\n")
# ktra chuỗi trong chuỗi
strA = "HowKteam.com"
strB = "K"
strC = strB in strA
print(strC)
# lấy ra từng kí tự trong chuỗi
strA = "HowKteam.com"
strB = strA[0]
print(strB)
# lấy độ dài chuỗi
strA = "HowKteam.com"
strB = strA[len(strA)-1]
print(strB)
# cắt chuỗi
strA = "HowKteam"
strB = strA[1:] #len(strA) || none
print(strB)
