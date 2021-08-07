def bubbleSort(array):
    n = len(array)
    for i in range(n):
        for j in range(0, n-i-1):
            if array[j] > array[j+1]:
                temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp

if __name__ == "__main__":
    array = [65,12,1,3,4,7,8,9,45];
    bubbleSort(array)
    for i in range(len(array)):
        print("%d" %array[i],end=" ")