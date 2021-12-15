#  var
valor_hora = 10.00
valor_extra = 20.00

# input
codigo = int(input("Informe seu código de operador: "))
horas_trabalhadas = float(input("Informe quantas horas você trabalhou este mês: "))

# processing
if horas_trabalhadas > 50:
    horas_extras = (horas_trabalhadas - 50) * valor_extra
    salario = (50 * valor_hora) + horas_extras
    print("Salário total: R$ {0:.2f}".format(salario))
    print("Salário excedente: R$ {0:.2f}".format(horas_extras))
else:
    salario = horas_trabalhadas * valor_hora
    print("Salário total: R$ {0:.2f}".format(salario))
