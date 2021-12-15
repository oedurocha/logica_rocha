# input
altura = float(input("Informe sua altura: "))
sexo = input("Informe o sexo m/f: ")

# processing
if sexo.lower() == 'm':
    peso_ideal = (72.7 * altura) - 58
elif sexo.lower() == 'f':
    peso_ideal = (62.1 * altura) - 58
else:
    peso_ideal = 0
    print("Sexo não reconhecido.")

# output
print("Seu peso ideal é {0:.2f}".format(peso_ideal))