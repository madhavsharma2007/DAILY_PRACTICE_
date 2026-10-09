#PYTHON DSA QUESTIONS SOLUTION SERIAL WISE:

# #QUESTION1(extercting digit);
# n = int(input())
# num = n
# while num > 0:
#     last_digit = num % 10
#     print(last_digit)
#     num //= 10

#QUESTION2(COUNTING DIGIT);
n = int(input())
num = n
count = 0
while num > 0:
    count += 1
    last_digit = num % 10
    num //= 10
print(count)

