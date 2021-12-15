# input
nome = input("Informe seu nome: ")
senha = input("Informe uma senha: ")

# processing
while nome == senha:
    print("O nome não pode ser igual a senha.")
    nome = input("Informe novamente seu nome: ")
    senha = input("Informe novamente a senha: ")
print("===============================")
print("||    Usuário cadastrado.    ||")
print("===============================")