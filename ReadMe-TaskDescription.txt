A Tarefa B consiste em ler uma s�rie de caminhos completos para nodos, um por linha (como se fossem subdiret�rios, por exemplo). 

Cada linha lista os antecessores deste nodo (separados por dois pontos), o pr�prio nodo e seu tamanho espec�fico em bytes (indicado entre colchetes). 

Uma �rvore bin�ria usando a classe BinaryTree (sem modifica��es) deve ser constru�da com base nos caminhos especificados, armazenando em cada nodo o seu nome e tamb�m o seu tamanho. 

Esta �rvore deve ent�o ser percorrida e os totais para cada nodo dever�o ser impressos na tela. Um total � a soma dos bytes de um nodo + o total dos bytes do seu filho esquerdo (se houver) + o total dos bytes do seu filho direito (se houver). 

O resultado deve ser exibido da forma abaixo, listando todos os nodos e seus respectivos totais (sendo que por �ltimo deve ser exibida a raiz, que � XKC nesse caso). 

Al�m disso, deve ser tamb�m impresso o di�metro (em ingl�s, diameter) da �rvore.