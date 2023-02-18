n = int(input())
grade = list(map(int, input().split()))
average = 0

for i in range(len(grade)):
    average += grade[i] / max(grade) * 100

print(average / len(grade))