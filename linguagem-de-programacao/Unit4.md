Unidade 4 - Classes e Objetos
=============================

1. Modifique a classe Aluno apresentada como exemplo para incluir novas funcionalidades:

    - Calcular o IMC dado pela fórmula: peso/(altura * altura)
    - Mostrar a Situação do aluno de acordo com a tabela a seguir:

IMC | Situação
----|---------
Abaixo de 18,5    | Abaixo do peso ideal
Entre 18,5 e 24,9 | Peso normal
Entre 25,0 e 29,9 | Acima do peso (sobrepeso)
Entre 30,0 e 34,9 | Obesidade grau I
Entre 35,0 e 39,9 | Obesidade grau II
40,0 e acima      | Obesidade grau III

2. Uma equação de 2o grau é representada por (ax2+bx+c). Utilize os conceitos de OO estudados para definir uma classe que represente tal conceito. A classe deve contemplar as seguintes funcionalidades:
    - Cálculo do delta (b2 - 4 * a * c)
    - Cálculo das raízes de uma equação de 2o grau, quando o delta >=0
        -(b + RAIZ(delta)) / 2 * a
        -(b - RAIZ(delta)) / 2 * a
    - Utilize o seguinte conjunto de teste:
        0 2 3 : Não é de segundo grau
        1 -8 7: Raiz 1: 7 e Raiz 2 = 1 (delta > 0)
        1 2 3 : Não há raiz real (delta < 0)
        2 4 2 : Há uma raiz real -1 (delta = 0)

