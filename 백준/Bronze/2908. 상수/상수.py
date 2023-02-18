a, b = map(int, input().split())


def hundreds(n):
    return (n % 100 % 10)*100


def tens(n):
    return (n % 100//10)*10


def ones(n):
    return n//100


a = hundreds(a)+tens(a)+ones(a)
b = hundreds(b)+tens(b)+ones(b)

if (a > b):
    print(a)
elif (a < b):
    print(b)