import copy
import random


#lineArray = [line.strip() for line in open('3cut.txt')]
lineArray = [line.strip() for line in open('KargerMinCut.txt')]

div2array = []
result = []
for i in range(0, len(lineArray)):
    a = lineArray[i].split()
    div2array.append(a)



    
def contract(testarray):
    vertex = []
    edge = []
    mid = []
    while len(testarray) >2 :
        t = testarray.pop(random.randint(0, len(testarray) - 1))
#        print(t)
        vertex.append(t.pop(0))
        edge = edge + t
        edge = list(set(edge).difference(set(vertex)))
        mid.append(len(edge))

                    
#    print(edge)
#    print(len(edge))
#    print(mid)
    mid.sort()
#    print(mid)
    return(mid[0])

for i in range(0,500) :
    testarray = copy.deepcopy(div2array)
    result.append(contract(testarray))
#    print(result)

result.sort()
print(result)         
            
        
 

