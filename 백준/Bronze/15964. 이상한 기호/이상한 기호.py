def cal(a, b):
    if a <= 1000 and b <= 1000:
        print((a + b) * (a - b))

a, b = map(int, input().split())
cal(a, b)