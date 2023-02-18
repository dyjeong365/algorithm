case = int(input())

for j in range(case):
    ans = list(input())
    temp = []
    score = 0
    for i in range(len(ans)):
        if (ans[i] == 'O'):
            score += 1
        else:
            score = 0
        temp.append(score)
    print(sum(temp))