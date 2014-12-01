#import datetime
#starttime = datetime.datetime.now()

#array = [int(line.strip()) for line in open('IntegerArray.txt')]
#array = [1,2,4,3,5]
array = [int(line.strip()) for line in open('242698.txt')]
def divideCount(array):
    length = len(array)
    if length > 1:
        split = length//2
        #left = array[:split]
        #right = array[split:]
        left, leftcount = divideCount(array[:split])
        right, rightcount = divideCount(array[split:])
        merge, mergecount = mergeCount(left, right)
        print(leftcount + rightcount + mergecount)
        return merge, leftcount + rightcount + mergecount
    else:
        return array, 0


def mergeCount(left,right):
    count = 0
    merge = []
    while left and right:
        if left[0] < right[0]:
            merge.append(left.pop(0))
        else:
            count += len(left)
            merge.append(right.pop(0))
    merge += left + right
    return merge, count

divideCount(array)
#endtime = datetime.datetime.now()
#print((endtime - starttime).seconds)

