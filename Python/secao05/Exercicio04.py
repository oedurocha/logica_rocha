# var
from typing import SupportsComplex


vetor = []
soma = 0

# processing
for i in range(0, 20):
    num = int(input("Informe um valor para o vetor: "))
    vetor.append(num)
    soma = soma + num

print("A soma de todos os valores é: {0}".format(soma))