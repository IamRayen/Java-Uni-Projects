"""Hausaufgabe 2"""
from Summe import *

arr = [10**-7]*(10**7+1)
arr[0]=2*10**8

sum = sumArray(arr)
sortedSum = sumArraySorted(arr)

print("Summe :", sum, "/ Sorted Summe :", sortedSum)
print("Differenz :", sortedSum-sum)


