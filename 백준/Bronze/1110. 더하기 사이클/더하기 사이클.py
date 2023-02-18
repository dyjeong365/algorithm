result = 0
count = 0

n = int(input())

if n < 10:
    count += 1
    result = 10 * n + n
    tens = result // 10
    units = result % 10
else:
    tens = n // 10
    units = n % 10

while n != result:
    result = 10 * units + ((tens + units) % 10)
    count += 1
    tens = result // 10
    units = result % 10

print(count)