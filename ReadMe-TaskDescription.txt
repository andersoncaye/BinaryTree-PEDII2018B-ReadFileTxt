A Tarefa B consiste em ler uma série de caminhos completos para nodos, um por linha (como se fossem subdiretórios, por exemplo). 

Cada linha lista os antecessores deste nodo (separados por dois pontos), o próprio nodo e seu tamanho específico em bytes (indicado entre colchetes). 

Uma árvore binária usando a classe BinaryTree (sem modificações) deve ser construída com base nos caminhos especificados, armazenando em cada nodo o seu nome e também o seu tamanho. 

Esta árvore deve então ser percorrida e os totais para cada nodo deverão ser impressos na tela. Um total é a soma dos bytes de um nodo + o total dos bytes do seu filho esquerdo (se houver) + o total dos bytes do seu filho direito (se houver). 

O resultado deve ser exibido da forma abaixo, listando todos os nodos e seus respectivos totais (sendo que por último deve ser exibida a raiz, que é XKC nesse caso). 

Além disso, deve ser também impresso o diâmetro (em inglês, diameter) da árvore.