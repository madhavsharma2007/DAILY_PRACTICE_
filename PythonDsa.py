#PYTHON DSA QUESTIONS SOLUTION SERIAL WISE:
## 🚀 Data Structures & Algorithms (DSA) Solutions
#Welcome to my personal repository dedicated to mastering **Data Structures & Algorithms**. This repo tracks my problem-solving journey across platforms like **LeetCode, HackerRank, and Codeforces**.

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

# #QUESTION4(CHECK ARMSTRONG NUMBER);
# n = int(input())
# num = n 
# nod = len(str(n))
# total = 0
# while num > 0:
#     last_digit = num % 10
#     total += last_digit**nod
#     num //= 10
# if n == total :
#     print("ARMSTRONG", total)
# else:
#     print("NOT ARMSTRONG", total)

# #QUESTION5(PRINTTING FACTORS);
# from math import sqrt
# num = int(input())
# result = []
# for i in range(1,int(sqrt(num))+1):
#     if num % i == 0:
#         result.append(i)
#         if num // i != i:
#             result.append(num//i)
# result.sort()
# print(result)

# #QUESTION6(FREQUENCY MAP);
# nums = [5,6,7,7,1,9,5,111,1,1,1]
# n = len(nums)
# hash_map= {}
# for i in range(0,n):
#     hash_map[nums[i]] = hash_map.get(nums[i],0)+1
# print(hash_map)

# #QUESTION7(NUM HASH MAPING);
# n = [5,3,2,2,1,5,5,7,5,10,5]
# m = [10,11,1,9,5,67,2]

# hash_list = [0] * 11
# for num in n:
#     hash_list[num] += 1
# for num in m:
#     if num < 1 or num > 10:
#         print(0)
#     else:
#         print(hash_list[num])

#QUESTION8(ALPHABETICAL HASH MAPING);
s = "azyxyyzaaaa"
q = ["d" ,"a" , "y" , "x"]
hash_list = [0] * 27
for ch in s:
    ascii = ord(ch)
    index = ascii - 97
    hash_list[index] += 1
for ch in q:
    ascii = ord(ch)
    index = ascii - 97
    print(hash_list[index])
