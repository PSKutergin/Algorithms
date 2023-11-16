import sys

def findMaxUnderBoundary(inputArray, topBoundary):
    currentMax = -sys.maxsize - 1

    for elem in inputArray:
        if elem < topBoundary:
            currentMax = max(currentMax, elem)

    return currentMax

def findTopElement(inputArray, numberOfElements):
    topElements = []
    previousMax = sys.maxsize

    for i in range(numberOfElements):
        currentMax = findMaxUnderBoundary(inputArray, previousMax)
        previousMax = currentMax
        topElements.append(currentMax)

    return topElements

ages = [10, 6, 15, 93, 42, 7, 32]
top3age = findTopElement(ages, 3)

print(top3age)