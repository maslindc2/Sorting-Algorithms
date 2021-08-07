def selectionSort(numArray):
    for i in range(0, len(numArray)):
        minElement = i
        for j in range(i+1, len(numArray)):
            if numArray[j] < numArray[minElement]:
                minElement = j
        temp = numArray[minElement]
        numArray[minElement] = numArray[i]
        numArray[i] = temp

if __name__ == "__main__":
    numArray=[5,4,7,8,2,1,3,6]
    selectionSort(numArray)
    for i in range(len(numArray)):
        print("%d" %numArray[i], end=" ")