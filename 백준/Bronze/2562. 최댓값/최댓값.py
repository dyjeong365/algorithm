a = []

for i in range(9):
    a.append(int(input()))

for i in range(9):
    if max(a) == a[i]:
        print(max(a), i + 1, sep="\n")