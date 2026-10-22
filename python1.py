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
# name = "Madhav Sharma"
# class_no = 56
# rollno = 4
# print(name)
# print(class_no)
# print(rollno)

#QUESTION26
# n = int(input())
# arr = list(map(int, input().split()))
# num = int(input())
# result = []
# part1 = arr[:len(arr)//2]
# part2 = arr[len(arr)//2:]
# for i in range(len(arr)//2):
#     one = part1[i]
#     two = part2[i]
#     result.append(one)
#     result.append(two)
# print(*result)

#QUESTION27
# n =int(input())
# num = n
# count = 0

# while num > 0:
#     count += 1
#     num //= 10
# print(count)    

#QUESTION28
# n =int(input())
# num = n
# result = 0

# while num > 0:
#     last_digit = num % 10
#     result = (result*10) + last_digit
#     num //= 10

# if n == result:
#     print("is_Palindrome")
# else:
#     print("not_Palindrome")       

#QUESTION29
# n = int(input())
# num = n
# nod =len(str(n))
# total = 0


# while num > 0:
#     lastdigit = num % 10
#     result = lastdigit ** nod
#     total += result
#     num //= 10
# print(total)

# if total == n:
#     print("is_Armstrong")
# else:
#     print("not_Armstrong")    

#QUESTION30
# import math
# n =int(input())
# num = n
# total = 0

# while num > 0:
#     last_digit = num % 10
#     total += math.factorial(last_digit)
#     num //= 10

# if total == n:
#     print("is_Strong")
# else:
#     print("not a strong number")  

#QUESTION31
# from math import sqrt
# num = int(input())
# result = []

# for i in range(1,int(sqrt(num)+1)):
#     if num % i == 0:
#         result.append(i)
#         if num//i != i:
#             result.append(num//i)

# result.sort()
# print(result)

#QUESTION32
# nums  = list(map(int, input().split()))
# n = len(nums)
# hash_map = {}
# for i in range(1,n):
#     hash_map[nums[i]] = hash_map.get(nums[i],0) +1
# print(hash_map)     

# QUESTION33
# name1 = input()
# unit1_sold = int(input())
# unit1_price = int(input())

# name2 = input()
# unit2_sold = int(input())
# unit2_price = int(input())

# name3 = input()
# unit3_sold = int(input())
# unit3_price = int(input())

# revenue1 = unit1_price * unit1_sold
# revenue2 = unit2_price * unit2_sold
# revenue3 = unit3_price * unit3_sold

# def classify(revenue):
    
#     if revenue >= 500:
#         return "High"
#     elif revenue >= 200:
#         return "Medium"
#     else:
#         return "Low"

# p1_class = classify(revenue1)
# p2_class = classify(revenue2)
# p3_class = classify(revenue3)

# classes = (p1_class,p2_class,p3_class)
# names =(name1,name2,name3)
# revenues = (revenue1,revenue2,revenue3)

# total_revenue = sum(revenues)
# max_revenue = max(revenues)
# top_index = revenues.index(max_revenue)
# top_product = names[top_index]
# high_count = classes.count("High")

# print(f"Product 1: {name1}, Revenue: ${revenue1:.2f} ({p1_class})")
# print(f"Product 2: {name2}, Revenue: ${revenue2:.2f} ({p2_class})")
# print(f"Product 3: {name3}, Revenue: ${revenue3:.2f} ({p3_class})")
# print("-" * 30)
# print(f"Total Revenue: ${total_revenue:.2f}")
# print(f"Top Performer: {top_product} (${max_revenue:.2f})")
# print(f"High Performers Count: {high_count}")



#QUESTION34
# def print_pattern(n):
#     for i in range (1,n+1):
#        row_items = [str(j) for j in range(1,i+1)]
#        print("*".join(row_items))
# n = int(input())
# print(print_pattern(n))

#QUESTION35
# def inverted_triangle(n):
#     for i in range(n,0,-1):
#         for j in range(1,i+1):
#             print("*",end=" ")
#         print()

# n = int(input())
# print(inverted_triangle(n))

#QUESTION36
# rows = int(input())
# for i in range(rows):
#     for j in range(rows-i-1):
#         print(" ",end=" ")
#     for k in range(2* i +1):
#         print("*",end=" ")
#     print()

# #QUESTION37
# n =int(input())
# for i in range(1,n+1):
#     for j in range(1,n+1):
#         print("*", end=" ")
#     print()

#QUESTION38
# n =int(input())
# for i in range(1,n+1):
#     for j in range(1,i+1):
#         print("*", end=" ")
#     print()

#QUESTION39
# n = int(input())
# for i in range(n,0,-1):
#     for j in range(i):
#         print("*", end=" ")
#     print()

#QUESTION40
# n = int(input())
# for i in range(1,n+1):
#     for j in range(1,i+1):
#         print("*", end=" ")
#     print()
# for k in range(n-1,0,-1):
#     for l in range(k):
#         print("*", end=" ")
#     print()

#QUESTION41
# n = int(input())
# for i in range(1,n+1):
#     for j in range(1,i+1):
#         print(j, end=" ")
#     print()

#QUESTION42
# n = int(input())
# for i in range(n,0,-1):
#     for j in range(i,0,-1):
#         print(j, end=" ")
#     print()

# QUESTION43
# a = input().strip()
# b = input().strip()
# c = input().strip()

# # Check validation in exact order using string comparisons
# if not (a.isdigit() and a != "0"):
#     print("Error: side a must be a positive whole number")
# elif not (b.isdigit() and b != "0"):
#     print("Error: side b must be a positive whole number")
# elif not (c.isdigit() and c != "0"):
#     print("Error: side c must be a positive whole number")
# else:
#     # Convert to integers after validation
#     A = int(a)
#     B = int(b)
#     C = int(c)

#     # Triangle Inequality Check
#     if not (A + B > C and B + C > A and A + C > B):
#         print("Error: sides do not form a valid triangle")
#     else:
#         # Classification by sides
#         if A == B == C:
#             side_type = "Equilateral"
#         elif A == B or B == C or C == A:
#             side_type = "Isosceles"
#         else:
#             side_type = "Scalene"

#         # Classification by angle (sorting integers)
#         sides = sorted([A, B, C])
#         s1, s2, largest = sides[0], sides[1], sides[2]

#         largest_sq = largest**2
#         sq_other_side = s1**2 + s2**2

#         if largest_sq == sq_other_side:
#             angletype = "Right-angled"
#         elif largest_sq < sq_other_side:
#             angletype = "Acute"
#         else:
#             angletype = "Obtuse"

#         # Output report
#         print(f"Sides: a={A}, b={B}, c={C}")
#         print(f"Type by Sides: {side_type}")
#         print(f"Type by Angle: {angletype}")
#         print(f"Classification: {side_type} {angletype} Triangle")
    
#QUESTION44
# raw_length = input()
# raw_height = input()
# raw_width = input()

# if not ( raw_length.isdigit() and raw_length != "0"):
#     print("ERROR: length must be positive")
# elif not ( raw_width.isdigit() and raw_width != "0"):
#     print("ERROR: width must be positive")
# elif not ( raw_height.isdigit() and raw_height != "0"):
#     print("ERROR: height must be positive")
# else:
#     L = int(raw_length)
#     W = int(raw_width)
#     H = int(raw_height)

#     volume = L * W * H
#     shape = "Cube" if (L == W == H) else "Rectangular Prism"

#     print(f"Dimensions: L={L}, W={W}, H={H}")
#     print(f"Volume: {volume}")
#     print(f"Shape: {shape}")

#QUESTION45
# raw_length = input()
# raw_width = input()
# raw_heigth = input()

# if not ( raw_length.isdigit() and raw_length != "0"):
#     print("Error: length must be positive integer")
# elif not ( raw_width.isdigit() and raw_width != "0"):
#     print("Error: width must be positive integer")
# elif not ( raw_heigth.isdigit() and raw_heigth != "0"):
#     print("Error: height must be positive integer")
# else:

#     L = int(raw_length)
#     W = int(raw_width)
#     H = int(raw_heigth)

#     surface_area = 2 * (L * W + W * H + H * L)
#     space_diagonal_squared =  L **2 + W ** 2+ H ** 2

#     if L == W == H:
#         symmetry = "Perfect Cube"
#     elif L == W:
#         symmetry = "Uniform Base"
#     else:
#         symmetry = "Irregular"
    
    
#     print(f"Box: L={L}, W={W}, H={H}")
#     print(f"Surface Area: {surface_area}")
#     print(f"Diagonal Squared: {space_diagonal_squared}")
#     print(f"Symmetry: {symmetry}")