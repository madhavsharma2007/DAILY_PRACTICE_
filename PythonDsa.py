#PYTHON DSA QUESTIONS SOLUTION SERIAL WISE:

# #QUESTION1(EXTRACTING DIGITS);
# n = int(input())
# num = n
# while num > 0:
#     last_digit = num % 10
#     print(last_digit)
#     num //= 10

# #QUESTION2(COUNTING DIGIT);
# n = int(input())
# num = n
# count = 0
# while num > 0:
#     count += 1
#     last_digit = num % 10
#     num //= 10
# print(count)

# #QUESTION3(CHECK PALIDROME NUMBER);
# n = int(input())
# num = n 
# result = 0
# while num > 0:
#     last_digit = num % 10
#     result = result * 10  + last_digit
#     num //= 10
# if n == result:
#     print("THIS IS PALIDROME", result)
# else:
#     print("NOT PALIDROME" , result)

#QUESTION4(CHECK ARMSTRONG NUMBER);
n = int(input())
num = n 
nod = len(str(n))
total = 0
while num > 0:
    last_digit = num % 10
    total += last_digit**nod
    num //= 10
if n == total :
    print("ARMSTRONG", total)
else:
    print("NOT ARMSTRONG", total)