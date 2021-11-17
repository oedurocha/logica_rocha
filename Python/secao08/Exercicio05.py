# var
vetor = []
posicao = 0
tem_maior_50 = False

# input
for i in range(0, 10):
    num = int(input("Informe um valor para o vetor"))
    vetor.append(num)

for i in vetor:
    if i > 50:
        print("O número {0} está na posição {1} do vetor.".format(i, posicao))
        tem_maior_50 = True
    posicao = posicao + 1
if tem_maior_50 == False:
    print("Não existe nenhum número maior que 50")