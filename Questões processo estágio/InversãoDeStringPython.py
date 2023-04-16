# pede a entrada da string
string = input("Digite uma string: ")

# inicializa uma lista vazia para armazenar os caracteres invertidos
inverted_string = []

# itera pelos caracteres da string de trás para frente e adiciona na lista invertida
for i in range(len(string)-1, -1, -1):
    inverted_string.append(string[i])

# converte a lista invertida em uma string novamente
inverted_string = ''.join(inverted_string)

# imprime a string invertida
print("String invertida:", inverted_string)