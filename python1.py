#QUESTION1
#  n = int(input())
# for i in range(1,n+1):
#     for j in range(1,i+1):
#         print(i, end=" ")
#     print()    

#QUESTION2
#  n = int(input())
# for i in range(1,n+1):
#     for j in range(1,i+1):
#         print(j, end=" ")
#     print()    

#QUESTION3
#  n = int(input())
# for i in range(n,0,-1):
#     for j in range(i,0,-1):
#         print(j, end=" ")
#     print()        

#QUESTION4
#  n = int(input())
# for i in range(n,0,-1):
#     for j in range(1,i+1):
#         print(j, end=" ")
#     print()        

#QUESTION5
# n = int(input())
# for i in range(n,0,-1):
#     for j in range(1,i+1):
#         print(i, end=" ")
#     print()   

#QUESTION6
# def fizz_buzz(n):
#     for i in range(1,n+1):
#         if i % 3 == 0 and i % 5 == 0:
#             print("fizzbuzz")
#         elif i % 3 ==0:
#             print("fizz")
#         elif i % 5 == 0:
#             print("buzz")
#         else:
#             print(i)
# n = int(input())
# fizz_buzz(n)

#QUESTION7
# n = int(input())
# count = 0
# for i in range(1,n+1):
#     for j in range(1,i+1):
#         count += 1
#         print(count, end=" ") 
#     print()         

#QUESTION8
# def count_vowel_and_consonants(sentence):
#     vowel_count = 0
#     consonant_count = 0
#     vowels = "aeiou"

#     for char in sentence.lower():
#         if char.isalpha():    
#             if char in vowels:
#                 vowel_count += 1
#             else:
#                 consonant_count += 1
#     return vowel_count, consonant_count

# sentence = input("enter text here: ")
# v_count, c_count = count_vowel_and_consonants(sentence)

# print("vowels: ", v_count)
# print("consonant: ", c_count)

#QUESTION9
# n = int(input("enter n here: "))
# arr = list(map(int, input("enter elements here: ").split()))
# largest_num = arr[0]
# for i in arr:
#     if i > largest_num:
#         largest_num = i
# print(largest_num)        

#QUESTION10
# n = int(input("enter n here: "))
# hours = list(map(int, input().split()))
# min = int(input())
# count = 0
# for i in hours:
#     if i>= min:
#         count += 1
# print(count)    
    
#QUESTION11
# def print_alternative_pointers(n):
#     left = 1
#     right = n
#     result = []
#     while left <= right:
#         if left == right:
#             result.append(str(left))
#         else:
#             result.append(str(left))
#             result.append(str(right))
#         left += 1
#         right -= 1
#     return " ".join(result)
# result =(print_alternative_pointers(6))
# print(result)
                
#QUESTION12
# n = int(input("enter n here: "))
# words = input("enter words here: ").split()
# suffix = input("enter suffix here: ")
# count = 0

# for word in words:
#     if word.endswith(suffix):
#         count += 1
# print(count)        

#QUESTION13
# def print_nda_ima(n):
#     for i in range(1,n+1):
#         if i % 3 == 0 and i % 5 == 0:
#             print("ndaima")
#         elif i % 3 == 0:
#             print("nda")
#         elif i % 5 == 0:
#             print("ima")
#         else:
#             print(i)            
# n = int(input())
# final= print_nda_ima(n)
# print(final)            

#QUESTION14
# def prime_num(n):
#     if n <= 1:
#         return"not prime number"
#     for i in range(2,int(n**0.5)+1):
#         if n % i == 0:
#             return"not prime number"
#     return"prime num"
# n = int(input())
# final = prime_num(n)
# print(final)

#QUESTION15
# n = int(input())
# arr = list(map(int, input().split()))
# num = int(input())
# count = 0
# for i in arr:
#     if num == i:
#         count += 1
# print(count)        

#QUESTION16
# def check_balanced_parenthesis(s: str):
#     balance = 0
#     for char in s:
#         if char == "(":
#             balance += 1
#         elif char == ")":
#             balance -= 1
#         if balance < 0:
#             print("not balanced")

#     if balance == 0:
#         print("balanced")
#     else:
#         print("not balanced")    
# s: str = input()
# final = (check_balanced_parenthesis(s))
# print(s)

#QUESTION17
# n = input().strip()
# even_count = 0
# odd_count = 0

# for digit_char in n:
#     digit = int(digit_char)
#     if digit % 2 == 0:
#         even_count += 1
#     else:
#         odd_count += 1

# print(even_count, odd_count)            

#QUESTION18
# def chech_prime_num(n):
#     if n <= 1:
#         return"not prime"
#     for i in range(2, int(n**0.5)+1):
#         if n % i == 0:
#             return"not prime"
#     return"prime"

# print("All prime num till 100:")
# for num in range(2,101):
#     if chech_prime_num(num) == "prime":
#         print(num,end=" ")

#QUESTION19
# n = int(input())
# for i in range(1,n+1):
#     for j in range(n-i):
#         print(" ",end ="")
#     for k in range(1,i+1):
#         print(k,end =" " if k < i else"")    
#     print() 

#QUESTION20
# n = int(input())
# fact = 1
# for i in range(1,n+1):
#     fact *= i
# print((fact))

#QUESTION21
# n = int(input())
# sum = 0
# for i in range(1,n+1):
#     if i % 3 == 0:
#         sum += i
# print(sum)  

#QUESTION22
# n = int(input())
# while n >= 9:
#     total = 0
#     for digit in str(n):
#         total += int(digit)
#     n = total
# print(n)  

#QUESTION23
# word = input()
# for i in word:
#     if i in ['a','e','i','o','u','A','E','I','O','U']:
#         print(i, end=" ")

# #count number of words:
# a = input().strip()
# count = 1
# for i in a:
#     if i == " ":
#         count += 1
# print(count)        

#QUESTION24
# text = input()
# letters = 0
# numbers = 0
# others = 0
# for ch in text:
#     if ch.isalpha():
#         letters += 1
#     elif ch.isdigit():
#         numbers += 1  
#     else:
#         others += 1
# print("total letter:",letters)
# print("total numbers:",numbers) 
# print("others:",others)            

#QUESTION25
name = "Madhav Sharma"
class_no = 56
rollno = 4
print(name)
print(class_no)
print(rollno)
