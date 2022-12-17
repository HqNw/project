
import random
import string

length = int(input("Enter the length of the password: "))
password = "".join(random.choices(string.ascii_letters +
                   string.digits + string.punctuation, k=length))
print("Your generated password is:", password)
