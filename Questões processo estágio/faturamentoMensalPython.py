import json

# Lê o arquivo JSON
with open('faturamento.json') as f:
    dados = json.load(f)

# Calcula o menor e o maior valor de faturamento
valores = [dado['valor'] for dado in dados]
min_valor = min(valores)
max_valor = max(valores)

# Calcula a média mensal, ignorando dias sem faturamento
valores_validos = [valor for valor in valores if valor > 0]
media_mensal = sum(valores_validos) / len(valores_validos)

# Calcula o número de dias em que o faturamento diário foi superior à média mensal
dias_acima_media = sum(1 for valor in valores_validos if valor > media_mensal)

# Imprime os resultados
print('Menor valor de faturamento: R$ {:.2f}'.format(min_valor))
print('Maior valor de faturamento: R$ {:.2f}'.format(max_valor))
print('Número de dias com faturamento acima da média mensal: {}'.format(dias_acima_media))
