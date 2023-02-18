s = input()
alphabet = 96

for i in range(26):
    alphabet += 1
    for j in range(len(s)):
        if chr(alphabet) == s[j]:
            print(j, end=" ")
            break
        elif j == len(s) - 1:
            print(-1, end=" ")