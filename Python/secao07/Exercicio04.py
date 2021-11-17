# var 
maior = -999
menor = 999
soma = 0

# processing
for i in range(1, 11):
    valor = int(input("Informe um número: "))
    if valor > 0:
        if valor > maior:
            maior = valor
        if valor < menor:
            menor = valor
        soma = soma + valor
    else:
        valor = int(input("Informe um número: "))
        
print("O maior valor é: {0}".format(maior))
print("O menor valor é: {0}".format(menor))
print("A média dos valores registrados é: {0}".format(soma/10))