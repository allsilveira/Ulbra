# Exercício

- Escolha um dos padrões de design mencionados.
- Descreva um problema prático que poderia ser resolvido usando esse padrão de design.
- Implemente a solução em uma linguagem de programação de sua escolha.
- Explique como a implementação resolve o problema descrito.

## Problema
Dependência a tecnologias externas

## Explicando implementação que resolve o problema
Quando está ocorrendo o desenvolvimento de um software, o foco deve se estar em resolver o problema do domínio que se está atacando, existem diversas tecnologias utilizadas no software que não fazem parte deste problema.

Hoje em dia já existem muitas bibliotecas e API's que resolvem problemas comuns do desenvolvimento de software, essas bibliotecas resolvem problemas que vão desde conferir se um número é par ou ímpar, até a criptografia de uma senha e a geração de um token de acesso para um usuário poder se logar em uma aplicação de forma segura. 

Por causa disto, o uso de bibliotecas e API's externas no desenvolvimento de um novo software é comum e recomendado, porém, isto gera um novo problema pois, os recursos externos utilizados na aplicação estão sujeito a mudanças e, quando essas mudanças ocorrem, eles não se adaptam a todas as aplicações que os utilizam, isso nem seria possível.

Este é o motivo para a criação de adapters. Um software nunca deve conhecer detalhes de implementação dos recursos externos que ele utiliza, ao invés disso, deve-se criar adaptadores que adaptam esses recursos para uma implementação que o domínio do software possa conhecer. Desta forma, se o recurso externo eventualmente mudar, a alteração a nível da aplicação que o utiliza será apenas necessária no adapter e não em vários pontos da aplicação (que podem ser muitos). 

Outro benefício do uso de adapters é a flexibilidade, pois assim como existem vários recursos prontos para resolverem muitos problemas comuns já enfrentados no desenvolvimento de software, também existem vários desses recursos que fazem a mesma coisa. Pode ser que um recurso não funcione mais tão bem como o esperado e se deseja mudá-lo por outro que faça a mesma coisa porém de forma mais eficiente. Se este recurso é conhecido pelo domínio da aplicação através de um adaptador que segue uma interface, ou seja, um contrato de implementação pré definido pelo domínio, a troca deste adaptador por outro adaptador que segue o mesmo contrato (interface) e implementa o recurso novo e mais eficiente é feita de forma muito mais fácil e segura.

