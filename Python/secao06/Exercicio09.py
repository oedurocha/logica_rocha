# input
indice = float(input("Informe o índice de poluição: "))

# processing
if indice >= 0.3 and indice < 0.4:
    print("Grupo 1 suspender atividades imediatamente.")
if indice >= 0.4 and indice < 0.5:
    print("Grupo 1 e 2 suspender atividades imediatamente.")
if indice >= 0.5:
    print("Todos os grupos suspender atividades imediatamente.")
else:
    print("Níveis aceitáveis")