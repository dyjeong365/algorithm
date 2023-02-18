t = int(input())
sum = []
for i in range(t):
    a, b = input().split()
    sum.append(int(a) + int(b))

for i in range(t):
    print(sum[i])