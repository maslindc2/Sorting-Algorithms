#include <iostream>

void bubbleSort(int array[], int len){
    int temp = 0;
    for (int i = 0; i < len-1; i++)
    {
        for (int j = 0; j < len-i-1; j++)
        {
            if (array[j] > array[j+1])
            {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
        
    }
    
}
int main(int argc, char const *argv[])
{
    int numArray[] = {64, 34, 25, 12, 22, 11, 90};
    int len = *(&numArray+1)-numArray;
    bubbleSort(numArray, len);
    for (int i = 0; i < len; i++)
    {
        std::cout << numArray[i] << " ";
    }
    return 0;
}
