import math
array = [int(line.strip()) for line in open('QuickSort.txt')]
#array = [int(line.strip()) for line in open('252921.txt')]
#array = [int(line.strip()) for line in open('615587518.txt')]
#array = [int(line.strip()) for line in open('10297101848921.txt')]
#array = [3, 9, 8, 4, 6, 10, 2, 5, 7, 1]
count = 0
def partition(array):
    global count
    if len(array) < 2 :
        return
    count += len(array) -1
    pivot = 0
    
#    array[0], array[-1] = array[-1], array[0]

    mid = math.ceil(len(array)/2) - 1
    if ((array[mid] > array[0] and array[mid] < array[-1]) or
        (array[mid] < array[0] and array[mid] > array[-1])):
        array[0], array[mid] = array[mid], array[0]
    elif ((array[-1] > array[0] and array[-1] < array[mid]) or
        (array[-1] < array[0] and array[-1] > array[mid])):
        array[0], array[-1] = array[-1], array[0]
 

    head = 1
    tail = 1
    for i in range(1, len(array)):
        if array[i] < array[pivot]:
            array[head], array[i] = array[i], array[head]
            head += 1
            tail += 1
        else:
            array[tail], array[i] = array[i], array[tail]
            tail += 1
    array[pivot], array[head-1] = array[head-1], array[pivot]
    pos = head -1
#    print array
#    print array[:pos]
#    print array[pos+1:]
    partition(array[:pos])
    partition(array[pos+1:])
    
   
        
partition(array)
print(count)
