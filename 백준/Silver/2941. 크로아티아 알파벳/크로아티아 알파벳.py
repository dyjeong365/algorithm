croatia = input()
cnt = 0
for i in range(len(croatia)):
    if croatia[i] == "=":
        if croatia[i - 1] == "c" or croatia[i - 1] == "s":
            continue
        elif croatia[i - 1] == "z":
            if croatia[i - 2] == "d":
                cnt -= 1
                continue
            else:
                continue
    elif croatia[i] == "-":
        if croatia[i - 1] == "c" or croatia[i - 1] == "d":
            continue
    elif croatia[i] == "j":
        if croatia[i - 1] == "l" or croatia[i - 1] == "n":
            continue
    cnt += 1

print(cnt)