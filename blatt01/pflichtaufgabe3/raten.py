"""Erste Methode"""

def iterativeSearch(array,num):
    for i in array:

        if array[i] == num:
            return f'Number of iterations:{i}'
        
        elif i == len(array)-1:
            return -1
        

"""Zweite Methode"""

def binarySearch(array, num):
    a = 0
    b = len(array)-1
    i = 0

    while a != b:
        i += 1
        m = int((a+b)/2)
        if array[m] >= num:
            b = m
        else:
            a = m+1

    if array[a] == num:
        return f'Number of iterations:{i}'
    else: return -1


