# input
n1 = int(input("Informe um número 1/4: "))
n2 = int(input("Informe um número 2/4: "))
n3 = int(input("Informe um número 3/4: "))
n4 = int(input("Informe um número 4/4: "))

# processing
q1 = n1 * n1
q2 = n2 * n2
q3 = n3 * n3
q4 = n4 * n4

if q3 >= 100:
    print("Num3: {0}, Quadrado: {1}".format(n3, q3))
else:
    print("Num1: {0}, Quadrado: {1}".format(n1, q1))
    print("Num2: {0}, Quadrado: {1}".format(n2, q2))
    print("Num3: {0}, Quadrado: {1}".format(n3, q3))
    print("Num4: {0}, Quadrado: {1}".format(n4, q4))
