# lstInt = [11,22,['aa','bb'],33,'cc']
# print(lst[2][0])

# lstFor = [i for i in range(10)]
# print(lstfor)

# lstIter = list([1, 2, 3])
# print(lst_iter)

# strList = list('Hoang')
# print(strlist)

# ------------------------------------

# # Toán tử +
# lstSum = [1, 2]
# lstSum += ['one', 'two']
# print(lstSum)
# lstSum += 'Hoang'
# print(lstSum)

# # Toán tử *
# lstMulChar = ['one', 'two'] * 2
# print(lstMulChar)

# lstMulInt = [1, 2] * 2
# print(lstMulInt)


# # Toán tử in
# print('a' in ['a','b','c'])

# print('a' in [['a'],'b','c'])       # Chỉ có [a] không có a


# Toán tử so sánh
# A <toán tử so sánh> B (A và B là 2 list)
# print(['a', 'b', 'c'] == ['a', 'c', 'b'])
# print(['a', 'b', 'c'] >= ['a', 'c', 'b'])
# print(['a', 'b', 'c'] <= ['a', 'c', 'b'])
# print(['a', 'b', 'c'] != ['a', 'c', 'b'])
# print(['a', 'b', 'c'] > ['a', 'c', 'b'])
# print(['a', 'b', 'c'] < ['a', 'c', 'b'])


# indexing
# lstIndex = [1,2,'a','b',[3,4]]
# print(lstIndex[0])

# lstStr = [1,'two',3]
# print(lstStr[1])
# lstStr[1] = 2
# print(lstStr)


# # Toán tử is : kiểm tra giá trị có cùng vị trí trỏ
# # VD1:
# a=[1,2,3]
# b=[1,2,3]
# print(a is b)

# # VD2:
# a = [1,2,3]
# b = a
# print(a is b)
# a[1] = 100
# print(a)
# print(b)

lst = [ 1,2,3]
lst_coppy = list(lst)
print(lst is lst_coppy)

lst_coppy_1 = lst[:]
print(lst is lst_coppy_1)

lst_coppy_2 = lst.copy()
print(lst is lst_coppy_2)



