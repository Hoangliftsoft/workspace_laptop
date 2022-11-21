# # Số nguyên
# intt = 1
# type_int = type(intt)
# print('Type: ', type_int)

# # Số thực
# floatt = 3.5555511111
# type_float = type(floatt)
# print('Type: ', type_float)

# #Decimal in float
# from decimal import*                      #import library(thư viện)
# getcontext().prec = 11
# dec =Decimal(10)/Decimal(3)
# print(dec)
# print(type(dec))


# # Phân số
# from fractions import*                    #import library
# fac =Fraction(1,4)                        #Không thể tạo phân số với mẫu số bằng 0
# print(fac)
# print(type(fac))

# # Số phức
# comp = complex(1,3)
# print(comp)
# print('Phần thực: ',comp.real)            # real để lấy ra phần thực
# print('Phần ảo: ',comp.imag)              # imag để lấy ra phần ảo
# print(type(comp))

# # Assignment expression (:=)
# a = 3
# b = (a:=a+3)+3                            # gán và khởi tạo lại biến a
# print(a)
# print(b)

# #library math in python
# import math 
# print(math.trunc(5.3737))                    # trả về một số nguyên là phần nguyên của số x
# print(math.floor(5.3737))                    # trả về phần nguyên, kết quả < x
# print(math.ceil(5.3737))                     # trả về phần nguyên, kết quả > x
# print(math.fabs(-25))                        # trả về trị tuyệt đối
# print(math.sqrt(25))                         # trả về căn bật hai
# print(math.gcd(11,5))                        # trả về ước chung
# print(math.lcm(11,5))                        # trả về bội chung

