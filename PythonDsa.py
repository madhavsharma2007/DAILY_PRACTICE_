#PYTHON DSA QUESTIONS SOLUTION SERIAL WISE:
## 🚀 Data Structures & Algorithms (DSA) Solutions
#Welcome to my personal repository dedicated to mastering **Data Structures & Algorithms**. This repo tracks my problem-solving journey across platforms like **LeetCode, HackerRank, and Codeforces**.

#QUESTION 1 (extracting digits)
# n = int(input())
# num = n
# count = 0
# while num > 0:
#     count += 1
#     last_digit = num % 10 #getting last digit
#     num //= 10 #removing last digit
# print("total number of digits: ",count)

#QUESTION 2 (armstrong number)
# n = int(input())
# num = n
# total = 0
# nod = len(str(n))

# while num > 0:
#     last_digit = num % 10
#     total += last_digit ** nod
#     num //= 10

# if total == n:
#     print("armstrong number")
# else:
#     print("not armstrong number")

#QUESTION 3 (palindrome)
# n = int(input())
# num = n
# result = 0

# while num > 0:
#     last_digit = num % 10
#     result = result * 10  + last_digit
#     num //= 10

# if n == result:
#     print("is palidrome")
# else:
#     print("not palidrome")

#QUESTION 4 (printing factors)
# from math import sqrt
# result = []
# num = int(input())
# for i in range(1, int(sqrt(num)) + 1):
#     if num % i == 0:
#         result.append(i)
#         if num // i != i:
#             result.append(num // i)
#sort(result) 
# print(result)

#QUESTION 5 (hash mapping)
# num = [5,6,7,7,1,9,111,1,1,5,1,1]
# hash_map = dict()
# n = len(num)
# for i in range(0,n):
#     hash_map[num[i]] = hash_map.get(num[i], 0)+1
# print(hash_map)

#QUESTION 6 (matrix upper triangle)
# nums = [ [5, 10, 8 ], [7, 6, 3], [2, 1, 9]]
# rows = len(nums)
# colm = len(nums[0])
# for i in range(0, rows):
#     for j in range(0, colm):
#         if j >= i:
#             print(nums[i][j], end=" ")
#         else:
#             print("*", end=" ")
#     print()

#QUESTION 6 (matrix lower triangle)
# nums = [ [4, 5, 6], [4, 3, 9], [90, 34, 21]]
# rows = len(nums)
# colm = len(nums[0])
# for i in range(0,rows):
#     for j  in range(0,colm):
#         if i>= j:
#             print(nums[i][j], end=" ")
#         else:
#             print("*",end=" ")
#     print()

#QUESTION 7 (transpose of matrix)
nums = [[2, 3, 1], [3, 4, 9] , [4,12,6]]
rows = len(nums)
colm = len(nums[0])

# Initialize a new matrix with swapped dimensions (4 rows x 3 columns) filled with zeros
transpose = [[0 for _ in range(rows)] for _ in range(colm)]

# Populate the transpose matrix without using functions
for i in range(rows):
    for j in range(colm):
        transpose[j][i] = nums[i][j]

# Print the transposed result
print("Transposed Matrix:")
for row in transpose:
    print(row)