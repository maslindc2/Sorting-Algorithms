def partition(numArray, low, high):
	pivotIndex = low
	pivot = numArray[pivotIndex]
	while low < high:
		while low < len(numArray) and numArray[low] <= pivot:
			low += 1
		while numArray[high] > pivot:
			high -= 1
		if(low < high):
			numArray[low], numArray[high] = numArray[high], numArray[low]
	numArray[high], numArray[pivotIndex] = numArray[pivotIndex], numArray[high]
	return high
	
def quickSort(numArray, low, high):
	if (low < high):
		p = partition(numArray, low, high)
		quickSort(numArray, low, p - 1)
		quickSort(numArray, p + 1, high)
		
if __name__ == "__main__":
    numArray = [ 10, 7, 8, 9, 1, 5 ]
    quickSort(numArray, 0, len(numArray) - 1)
    for i in range(len(numArray)):
        print("%d" %numArray[i], end=" ")