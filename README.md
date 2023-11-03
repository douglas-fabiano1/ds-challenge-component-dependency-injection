# ds-challenge-component-dependency-injection

## Desafio: Componentes e injeção de dependência

A proposta desse desafio elaborado pelo Prof. Nélio da Devsuperior foi de aplicar o conceito de componentes e injeção de dependência no desenvolvimento de um sistema para calcular o valor total de um pedido, considerando uma porcentagem de desconto e o frete.<br/><br/>
O cálculo do valor total consiste em aplicar o desconto ao valor básico do pedido e adicionar o valor do frete.

A regra para cálculo do frete foi: <br/><br/>
![Captura de tela 2023-09-30 134430](https://github.com/douglas-fabiano1/ds-challenge-component-dependency-injection/assets/119501911/757e22b2-b39f-4f55-87ae-429ab09cec48)

### Especifições do desafio
Pedido representado por um objeto:<br/><br/>
![Captura de tela 2023-09-30 133133](https://github.com/douglas-fabiano1/ds-challenge-component-dependency-injection/assets/119501911/2cf4158e-1ef4-46d8-924a-7dde729a692e)

Componentes(serviços), cada um com sua responsabilidade, conforme abaixo:<br/><br/>
![Captura de tela 2023-09-30 133643](https://github.com/douglas-fabiano1/ds-challenge-component-dependency-injection/assets/119501911/d14b3ed7-4df2-4fa6-b54d-94f7aa66a1a8)

Serviço OrderService: responsável por operações referentes a pedidos.<br/>
Serviço ShippingService: responsável por operações referentes a frete.<br/><br/>

A solução foi implementada em Java com Spring Boot e a saída dos dados feita no log do terminal da aplicação.
