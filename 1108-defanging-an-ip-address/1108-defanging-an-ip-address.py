class Solution(object):
    def defangIPaddr(self, address):
        stri = ""

        for i in address:
            if i == ".":
                stri+= "[" + i + "]" 
            else:
                stri+=i
        return stri
        