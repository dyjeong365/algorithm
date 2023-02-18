n = []

for i in range(10):
    n.append(int(input()) % 42)

n = list(set(n))

print(len(n))