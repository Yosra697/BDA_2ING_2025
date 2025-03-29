# Importation des données de test : relations et dépendances
from data import myrelations, mydependencies

# Importation des fonctions d'affichage
from utils import printDependencies, printRelations

# Importation des fonctions de traitement logique
from dependencies import (
    isSuperKey,
    computeAllCandidateKeys,
    isBCNFRelation,
    computeBCNFDecomposition
)

# ▶️ Affiche la liste des relations définies (chaque ensemble d'attributs)
print("Relations :")
printRelations(myrelations)
# ▶️ Affiche la liste des dépendances fonctionnelles sous forme A --> B
print("Dépendances :")
printDependencies(mydependencies)
# ▶️ Test si l'ensemble {'A'} est une super-clé dans la première relation
print("\nEst-ce que {'A'} est une super-clé ?")
print(isSuperKey(mydependencies, myrelations[0], {'A'}))
# ▶️ Calcule et affiche toutes les clés candidates de la première relation
print("\nClés candidates :")
print(computeAllCandidateKeys(mydependencies, myrelations[0]))
# ▶️ Vérifie si la première relation est en forme normale de Boyce-Codd (BCNF)
print("\nRelation en BCNF ?")
print(isBCNFRelation(mydependencies, myrelations[0]))
# ▶️ Applique la décomposition BCNF sur toutes les relations
print("\nDécomposition BCNF :")
print(computeBCNFDecomposition(mydependencies, myrelations))
