x = int(input())
count = 0
for i in range(1, x + 1):
    hundreds = i // 100
    tens = i % 100 // 10
    units = i % 100 % 10
    if (i < 100) or (hundreds - tens) == (tens - units):
        count += 1
print(count)
