import sys

student = []

for i in range(30):
    student.append(i + 1)

for i in range(28):
    submit = int(sys.stdin.readline())
    student.remove(submit)

for j in range(2):
    print(student[j])