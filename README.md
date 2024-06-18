# banco-desafio-dio
 Aproveitando o conhecimento no domínio bancário, abstrai uma solução orientada a objetos em Java. Para isso, interpretei o seguinte cenário: “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”
# Explicação o código
Banco: Usei Lombok com a anotação @Data para gerar getters, setters e outros métodos utilitários automaticamente.
Cliente: Adicionei o atributo id e usamos Lombok para reduzir a verbosidade.
Conta: Adicionei verificações nos métodos sacar, depositar e transferir para garantir que os valores sejam positivos e que haja saldo suficiente para as operações.
Utilizei Lombok para gerar getters, setters e outros métodos utilitários automaticamente.
ContaCorrente e ContaPoupanca: Continuam como subclasses de Conta, cada uma com seu próprio método imprimirExtrato.
Isso torna o código mais robusto, extensível e fácil de manter, ao mesmo tempo em que utilizam Lombok para reduzir a verbosidade do código.
