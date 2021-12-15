# input
idade = int(input("Informe sua idade: "))

# processing
if idade >= 5 and  idade <= 7:
    print("Você faz parte do grupo Infantil A")
if idade >= 8 and  idade <= 11:
    print("Você faz parte do grupo Infantil B")
if idade >= 12 and  idade <= 13:
    print("Você faz parte do grupo Juvenil A")
if idade >= 14 and  idade <= 17:
    print("Você faz parte do grupo Juvenil B")
if idade >= 18:
    print("Você faz parte do grupo Adulto")
else:
    print("Você ainda não pode entrar em nenhum grupo.")