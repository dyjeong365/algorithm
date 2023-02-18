t = int(input())
for i in range(t):
    n, s = input().split()
    for j in range(len(s)):
        print(int(n)*s[j], end='')
    print()