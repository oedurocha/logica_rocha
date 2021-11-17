# var
maior = 0

# input
valor = int(input("Informe um valor: "))

# processing
while valor != 0:
    if valor > maior:
        maior = valor
    valor = int(input("Informe um valor: "))
print("O maior valor registrado foi {0}.".format(maior))