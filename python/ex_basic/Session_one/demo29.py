print("Day Number Input: ", end=" ")
day_number = int(input())
years = day_number // 365
weeks = (day_number-(years*365))//7
days = day_number-((years*365)+(weeks*7))
print("Year = {}\nWeek = {}\nDay = {}".format(years, weeks, days))
