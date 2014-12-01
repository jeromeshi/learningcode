import copy
import random



lineArray = [line.strip() for line in open('KargerMinCut.txt')]

div2array = []
result = []
for i in range(0, len(lineArray)):
    a = lineArray[i].split()
    div2array.append(a)



    
def contract(testarray):
    vertex = []
    edge = []
    while len(testarray) >0 :
        t = testarray.pop(random.randint(0, len(testarray) - 1))
#        print(t)
        if (random.randint(0,1)) == 0 :
            vertex.append(t.pop(0))
            remove = []
            for i in range(0,len(t)) :
                for j in range(0,len(vertex)) :
                    if t[i] == vertex[j] :
                        remove.append(t[i])
#            print(t)
            t =  list(set(t).difference(set(remove)))
#            print(t)            
            for i in range(0,len(t)) :
                if t[i] not in edge :
                    edge.append(t[i])
                    
    print(edge)
#    print(len(edge))
    return(len(edge))

for i in range(0, 1) :
    testarray = copy.deepcopy(div2array)
    result.append(contract(testarray))
#    print(result)
result.sort()
#print(result)         
            
        
 

