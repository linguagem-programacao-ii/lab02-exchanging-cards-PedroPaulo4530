while True:
    cardsA, cardsB = input().split()
    if cardsA == "0" and cardsB == '0':
        break
    listA = [int(x) for x in input().split()]
    listB = [int(x) for x in input().split()]
    cardsA = set(listA)
    cardsB = set(listB)
    aux = cardsB
    f = 0
    if len(listA) < len(listB):
        aux = listA
        listA = listB
    aux = [x for x in aux if x not in listA]
    print(len(aux))