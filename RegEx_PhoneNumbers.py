import re

numbersList = ['212.445.6765', '202-239-2454', '(404) 864-5689', ' 650 678 2134', '7733124571', '727-555-927']

for numbers in numbersList:
    cleanString = re.sub('\W+', '', numbersList[numbersList.index(numbers)])
    if len(cleanString) == 10:
        print(cleanString + " is a valid phone number.")
    else:
        print(cleanString + " is an invalid phone number.")
