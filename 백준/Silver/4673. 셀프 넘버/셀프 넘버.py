def d(n):
    if n < 10:
        return 2*n
    elif n < 100:
        return (n+(n//10)+(n % 10))
    elif n < 1000:
        return n+(n//100)+(n % 100//10)+(n % 100 % 10)
    elif n < 10000:
        return n+(n//1000)+(n % 1000//100)+(n % 1000 % 100//10)+(n % 1000 % 100 % 10)


s = []
l = []
i = 1
while (True):
    if (i > 10000):
        break
    s.append(i)
    l.append(d(i))
    i += 1
j = 1

result = sorted(list(set(s)-set(l)))

for i in range(len(result)):
    print(result[i], end='\n')