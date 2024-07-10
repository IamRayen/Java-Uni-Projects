"""Hausaufgabe 2 DoubleTrouble"""

""""0.10593032836914062"""

"""Erste Methode"""
def sumArray(array):
    Summe = 0
    for i in array:
        Summe += i
    return Summe


"""Zweite Methode"""
def sumArraySorted(array):
    array.sort()
    Summe = 0
    for i in array:
        Summe += i
    return Summe



