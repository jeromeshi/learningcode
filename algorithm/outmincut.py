import random
import copy

graph = {}

# initial the graph
f = open('kargerMinCut.txt')

for line in f.readlines():
    l = line.split()
    graph_l = [int(i) for i in l]
    graph[graph_l[0]] = graph_l[1:]

# initial a test value
##graph = {1:[2, 3, 4],
##         2:[1, 3, 4, 5],
##         3:[1, 2, 4],
##         4:[1, 2, 3, 7],
##         5:[2, 6, 7, 8],
##         6:[5, 7, 8],
##         7:[4, 5, 6, 8],
##         8:[5, 6, 7]}

def random_cut(graph_list):
    random.seed()
#    min_cut_num = -1
#    for i in xrange(iteration):
    g_list = copy.deepcopy(graph_list)
    while(len(g_list.keys()) > 2):
#        print g_list
#        print g_list.keys()
        v1 = random.choice(g_list.keys())
        v2 = random.choice(g_list[v1])

#        print v1, v2,'#',
        # 合并节点
        g_list[v1].extend(g_list[v2])

        # 删除或者替换所有邻接链表中被合并节点v2
        for v in g_list.keys():
            while v2 in g_list[v]:
                g_list[v].remove(v2)
                g_list[v].append(v1)

        # 删除主合并节点v1中指向自己的边
        while v1 in g_list[v1]:
            g_list[v1].remove(v1)

        # 删除被合并的节点v2
        del g_list[v2]            

    cut_edge = g_list.values()[0]
#    print len(cut_edge)
    return len(cut_edge)

def r_cut(graph_list, iteration):
    min_cut_num = -1
    m_num = -1
    for i in xrange(iteration):
        m_num = random_cut(graph_list)

        if min_cut_num == -1 or min_cut_num > m_num:
            min_cut_num = m_num
    return min_cut_num
    
print r_cut(graph, 500)
