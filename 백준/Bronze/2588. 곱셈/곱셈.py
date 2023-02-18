a = int(input())
b = int(input())

one = b % 10
ten = (b % 100) // 10
hun = b // 100

print(a * one, a * ten, a * hun, a * b, sep="\n")