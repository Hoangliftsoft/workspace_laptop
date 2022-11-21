print("Input Month: ", end=" ")
month = int(input())
print("Input Year: ", end=" ")
year = int(input())

if month <= 0 or year <= 0 or month < 1 or month > 12:
    print("INVALID")
elif month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12:
    print("Tháng {0} có 31 ngày".format(month))
elif month == 4 or month == 6 or month == 9 or month == 11:
    print("Tháng {0} có 30 ngày".format(month))
elif month == 2:
    if year % 4 == 0 and year % 100 != 0:
        print("Tháng {0} có 29 ngày".format(month))
    else:
        print("Tháng {0} có 28 ngày".format(month))
