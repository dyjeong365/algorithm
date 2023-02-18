word = input().upper()
unique = list(set(word))
result = []

for i in range(len(unique)):
    result.append(word.count(unique[i]))

if result.count(max(result)) > 1:
    print("?")
else:
    print(unique[result.index(max(result))])