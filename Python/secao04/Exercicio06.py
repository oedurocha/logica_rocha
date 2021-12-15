# input
numero = int(input("Informe um número: "))

# processing
while numero > 10:
    print("O número deve ser maior que 10.") 
    numero = int(input("Informe novamente um número: "))

print("Tabuada do {0}:".format(numero))

for i in range(0, 11):
    valor = numero * i
    print("{0} x {1} = {2}".format(numero, i, valor))