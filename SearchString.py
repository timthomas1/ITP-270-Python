def xxx(textString, searchString):
    hits = textString.upper().count(searchString.upper())
    return hits

def xxy(textString, searchString):
    hits = xxx(textString, searchString)
    print("'%s' has %d matches for '%s'" % (textString, hits, searchString))


line = input("Enter a series of letters: ")
user_input = input("Enter a character: ")
xxy(line, user_input)

hits = line.upper().count(user_input.upper())
#print(hits)
#print(line.upper())
