# dev1-lista1

# Implementação dos exercicios da Lista 1 de Dev 1.

1) Escreva um controller em spring que receba o peso e a altura de uma pessoa a partir de uma url e gere o seu IMC (Índice de Massa Corporal).

GET - URL: http://localhost:8080/imc/{peso}/{altura}
Exemplo request: http://localhost:8080/imc/126.0/1.75
Response: {"peso":126.0,"altura":1.75,"imc":41.142857142857146,"classificacao":"Obesidade Grau III (mórbida)"}

2) Escreva um controller em spring que receba dia, mês e ano, retornando o dia da semana:

GET - URL:  = http://localhost:8080/diasemana/{ano}/{mes}/{dia} 
Exemplo request: http://localhost:8080/diasemana/2021/7/10
Response: {"ano":2021,"mes":7,"dia":10,"descricao":"SABADO"}

3) Escreva um controller em spring para executar operações matemáticas com dois números, contendo os seguintes comandos: adição, subtração, multiplicação, divisão.

Operações suportadas:
Adição: adicao
Subtração: subtracao
Multiplicação: multiplicacao
Divisão: divisao
Caso seja enviado outro valor que não as operações suportadas, a operacao será considerada inválida e o resultado é nulo.

GET -URL: http://localhost:8080/calculadora/operacao?n1=numero1&n2=numero2
Exemplo request: http://localhost:8080/calculadora/adicao?n1=10&n2=5
Response: {"numero1":10.0,"numero2":5.0,"operacao":"ADICAO","resultado":15.0

Arquitetura: projeto foi desenvolvido utilizando o Design Pattern Facade e Mapper.
Projeto foi testado com testes unitários.
