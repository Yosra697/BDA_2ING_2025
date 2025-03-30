def printDependencies(F):
    for alpha, beta in F:
        print("\t", alpha, " --> ", beta)

def printRelations(T):
    for R in T:
        print("\t", R)

import itertools

def powerSet(inputset):
    _result = []
    for r in range(1, len(inputset) + 1):
        _result += map(set, itertools.combinations(inputset, r))
    return _result

