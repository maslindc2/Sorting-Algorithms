#include <iostream>
void merge(int array[], int const left, int const mid, int const right)
{
	auto const sizeL = mid - left + 1;
	auto const sizeR = right - mid;

	// Create temp arrays
	auto *leftArray = new int[sizeL],
		 *rightArray = new int[sizeR];

	// Copy data to temp arrays
	for (auto i = 0; i < sizeL; i++)
		leftArray[i] = array[left + i];
	for (auto j = 0; j < sizeR; j++)
		rightArray[j] = array[mid + 1 + j];

	int iSubArrayOne = 0, 
		jSubArrayTwo = 0;  
	int kMergedArray = left; 

	// Merge the temp arrays back into array[left..right]
	while (iSubArrayOne < sizeL && jSubArrayTwo < sizeR) {
		if (leftArray[iSubArrayOne] <= rightArray[jSubArrayTwo]) {
			array[kMergedArray] = leftArray[iSubArrayOne];
			iSubArrayOne++;
		}
		else {
			array[kMergedArray] = rightArray[jSubArrayTwo];
			jSubArrayTwo++;
		}
		kMergedArray++;
	}
	
	while (iSubArrayOne < sizeL) {
		array[kMergedArray] = leftArray[iSubArrayOne];
		iSubArrayOne++;
		kMergedArray++;
	}
	
	while (jSubArrayTwo < sizeR) {
		array[kMergedArray] = rightArray[jSubArrayTwo];
		jSubArrayTwo++;
		kMergedArray++;
	}
}

void mergeSort(int array[], int const start, int const end)
{
    if (start >= end)
        return;
    auto mid = start + (end - start) /2;
    mergeSort(array, start, mid);
    mergeSort(array, mid + 1, end);
    merge(array, start, mid, end);
}
void printArray(int array[], int len)
{
    for (int i = 0; i < len; i++)
    {
        std::cout<< array[i] << " ";
    }
    
    
}

int main(int argc, char const *argv[])
{
    int array[] = { 12, 11, 13, 5, 6, 7 };
    auto len = sizeof(array)/sizeof(array[0]);
    std::cout << "Array before merge sort " << std::endl;
    printArray(array, len);
    mergeSort(array, 0, len-1);
    std::cout << "Array after merge " << std::endl;
    printArray(array, len);
    return 0;
}
