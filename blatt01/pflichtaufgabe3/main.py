"""Hausaufgabe 3"""
from raten import *

arr=[""]*32

for i in range(0,32):
    arr[i]= i



"""IterativeSearch"""

"""Existiert"""
print(iterativeSearch(arr,15))

"""Existiert nicht"""
print(iterativeSearch(arr,66))


"""BinarySearch"""

"""Existiert"""
print(binarySearch(arr,15))

"""Existiert nicht"""
print(binarySearch(arr,66))
