s = 'pphạm quOc Hoangg'

# Các phương thức biến đổi
'''
# Viết hoa chữ đầu
# <chuỗi>.capitalize()
print(s.capitalize())

# Viết hoa
# <chuỗi>.upper()
print(s.upper())

# Viết thường
# <chuỗi>.lower()
print(s.lower())

# Hoa thành thường, thường thành hoa
# <chuỗi>.swapcase()
print(s.swapcase())

# Chuỗi dạng tiêu đề
# <chuỗi>.title()
print(s.title())
'''

# Các phương  thức định dạng
'''
# Chuỗi căn giữa
# <chuỗi>.center(width, [fillchar])
print(s.center(30,'-'))

# Chuỗi căn trái
# <chuỗi>.rjust(width, [fillchar])
print(s.rjust(30,'-'))

# Chuỗi căn phải
# <chuỗi>.ljust(width, [fillchar])
print(s.ljust(30,'-'))
'''

# Các phương thức xử lý
"""
# Mã hoá 
# <chuỗi>.encode(encoding=’utf-8’, errors=’strict’)
print(s.encode(encoding='utf-8',errors='strict'))

# Giải mã hoá 
# <chuỗi (đã mã hóa)>.decode(encoding=’utf-8’, errors=’strict’)
# ss=s.encode(encoding='utf-8',errors='strict')
print(ss.decode(encoding='utf-8',errors='strict'))

# Nối chuỗi : phải là chuỗi
# <kí tự nối>.join(<iterable>)
print(' '.join(['1', '2', '3']))
print(' '.join(('1', '2', '3')))

# Thay đổi chuỗi
# <chuỗi>.replace(old, new, [count])    count là số lượng
print(s.replace('Hoang','hoang'))
print('abc how abc kteam'.replace('abc', 'AA', 1))

# Trả về một chuỗi với phần đầu và phần đuôi của chuỗi được bỏ đi các kí tự chars
# <chuỗi>.strip([chars])
print(s.strip('g'))

# Bỏ phần đuôi
# <chuỗi>.rstrip()
print(s.rstrip('g'))

# Bỏ phần đầu
# <chuỗi>.lstrip()
print(s.lstrip('p'))


# Xoá 1 kí tự ở đâu
# <chuỗi>.removeprefix([prefix])
print(s.removeprefix('p'))

# Xoá 1 kí tự ở cuối
# <chuỗi>.removesuffix([suffix])
print(s.removesuffix('g'))
"""
