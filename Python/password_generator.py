import secrets
import string

# define the characters
letters = string.ascii_letters
digits = string.digits
special_chars = string.punctuation

characters = letters + digits + special_chars

# set the password length
pwd_length = 12

# generate a password string
pwd = ''
for i in range(pwd_length):
  pwd += ''.join(secrets.choice(characters))

print(pwd)