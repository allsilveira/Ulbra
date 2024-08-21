# Exercício

- Escolha um dos padrões de design mencionados (Singleton, Factory Method, Observer).
- Descreva um problema prático que poderia ser resolvido usando esse padrão de design.
- Implemente a solução em uma linguagem de programação de sua escolha.
- Explique como a implementação resolve o problema descrito.

## Problema
Boilerplate de código, dificuldade de escalamento e manutenção.

## Explicando implementação que resolve o problema
Relacionado ao módulo de usuário, possui duas classes necessárias para prover os serviços de usuário onde for preciso na aplicação.

A classe UserService depende da injeção de uma dependência que segue uma interface IUserRepository, por este motivo, em todo lugar que seja preciso utilizar UserService, seria necessário criar primeiro uma instancia de repository do tipo IUserRepository para ser injetada em UserService. 

O padrão factory vem pra resolver esse problema, a factory já entrega o UserService pronto para ser utilizado. <br/>

## Bonus
Também estou utilizando um outro padrão arquitetural, portas e adaptadores, esse padrão conversa muito bem com a arquitetura limpa pois mantêm o domínio da aplicação independente do mundo externo. 

Definindo uma porta em forma de interface para os repositórios de usuário, garanto que meu UserService não conheça nenhum detalhe de implementação do repository que ele recebe, dessa maneira, posso criar repositórios de usuário implementando diferentes formas de manipulação de banco de dados e, desde que eles sigam a mesma interface (porta) definida no domínio da minha aplicação, meu UserService saberá utilizá-los sem que eu precise alterar nenhuma linha de código dele.

Essa forma de injetar o repository no UserService também é conhecida como DI (Dependency Inversion Principle).


