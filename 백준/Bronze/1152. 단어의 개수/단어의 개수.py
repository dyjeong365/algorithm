word = input().strip()
count = 1

for i in range(len(word)):
    if word[i] == " ":
        count += 1

if bool(word) == False:
    count = 0

print(count)