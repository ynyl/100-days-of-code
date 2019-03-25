#program that generates Fibonacci sequence up to nth term where n is provided by a user

terms = int(input("How many terms?"))

n1 = 0
n2 = 1
count = 0

if terms <= 0:
    print("Please enter a positive integer.")
elif terms == 1:
    print("Fibonacci sequence up to", terms, ":")
    print(n1)
else:
    print("Fibonacci sequence up to", terms, ":")
    while count < terms:
        print(n1, end=" , ")
        nth = n1 + n2
        n1 = n2
        n2 = nth
        count += 1
