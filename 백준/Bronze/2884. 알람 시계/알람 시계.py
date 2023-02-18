h, m = map(int, input().split())

tmp = (60 * h) + m
result = tmp - 45
if result < 0:
    min = 60 + result
    hour = 23
else:
    hour = result // 60
    min = result % 60

print(hour, min)