# var
excesso = 0
multa = 0

# input
peso = float(input("Informe o peso da pesca: "))

# processing
if peso > 50:
    excesso = peso - 50
    multa = excesso * 40
    print("Você deverá pagar R$ {0:.2f} de multa.".format(multa))
else:
    print("Peso: {0:.2f} Kg".format(peso))
    print("Multas: R$ {0:.2f}".format(multa))
    print("Excesso: R$ {0:.2f}".format(excesso))