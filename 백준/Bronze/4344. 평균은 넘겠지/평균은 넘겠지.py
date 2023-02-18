test_case = int(input())

average = 0
score = 0

for i in range(test_case):
    honor = 0
    score = list(map(int, (input().split())))
    average = (sum(score) - score[0]) / score[0]
    for j in range(1, len(score)):
        if (score[j] > average):
            honor += 1
    print(format((honor / score[0]) * 100, ".3f"), "%", sep='')