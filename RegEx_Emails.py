# Matching emails

import re

emailList = ['Bill.Gates@microsoft.com', 'president@whitehouse.gov', 'Mark@facebookcom', 'postoffice22030@postal.gov', 'timothy.thomasyahoo.com']
regex1 = '[^@]+@[^@]+\.[^@]+'

for emails in emailList:
    if re.search(regex1, emailList[emailList.index(emails)]):
        print(emailList[emailList.index(emails)] + " is a valid email address.")
    else:
        print(emailList[emailList.index(emails)] + " is an invalid email address.")