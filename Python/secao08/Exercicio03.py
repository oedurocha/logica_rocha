# var
vetor = []

# processing
for i in range(0, 10):
    num = int(input("Informe um valor para o vetor: "))
    vetor.append(num)

vetor.reverse()
for i in vetor:
    print(i)
    