# var
p1 = 0
p2 = 0
p3 = 0
p4 = 0
contador_sit1 = 0
contador_sit2 = 0
contador_sit3 = 0
contador_sit4 = 0
quantidade = 0

# input
cod = int(input("Informe o código de identificação: "))

# processing
while cod != 0:
    print("------------------------------------------")
    print("Identifique o defeito:")
    print("1 - Necessita de esfera")
    print("2 - Necessita de limpeza")
    print("3 - Necessita de troca do cabo ou conector")
    print("4 - Quebrado ou inutilizado")
    defeito = int(input("Informe o defeito: "))
    print("==========================================")
    cod = int(input("Informe o código de identificação: "))

    if defeito == 1:
        contador_sit1 = contador_sit1 + 1
    elif defeito == 2:
        contador_sit2 = contador_sit2 + 1
    elif defeito == 3:
        contador_sit3 = contador_sit3 + 1
    elif defeito == 4:
        contador_sit4 = contador_sit4 + 1

    
    quantidade = quantidade + 1

p1 = (contador_sit1 / quantidade) * 100.0
p2 = (contador_sit2 / quantidade) * 100.0
p3 = (contador_sit3 / quantidade) * 100.0
p4 = (contador_sit4 / quantidade) * 100.0

print("============================================================================")
print("TOTAL DE APARELHOS: {0}".format(quantidade))
print("")
print(" Situação                                    ||  Quantidade  ||  Percentual")
print(" 1 - Necessita de esfera                     ||       {0}      ||     {1}".format(contador_sit1, p1))
print(" 2 - Necessita de limpeza                    ||       {0}      ||     {1}".format(contador_sit2, p2))
print(" 3 - Necessita de troca ou cabo do conector  ||       {0}      ||     {1}".format(contador_sit3, p3))
print(" 4 - Quebrado ou inutilizado                 ||       {0}      ||     {1}".format(contador_sit4, p4))