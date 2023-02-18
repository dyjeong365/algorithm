a, b = map(int, input().split())
c = int(input())
sum = (60 * a) + b + c

print(sum // 60 % 24, sum % 60)