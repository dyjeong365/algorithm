import sys

input = sys.stdin.readline
amount = int(input())
n = int(input())
sum = 0
for i in range(n):
    price, ea = map(int, input().split())
    sum = sum + (price * ea)

if amount == sum:
    print("Yes")
else:
    print("No")