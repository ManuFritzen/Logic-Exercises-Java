/* Um dia, o grande herói Chapolout foi ajudar um cientista, 
que criou muitas invenções. Uma destas invenções é um sistema que 
abre a porta secreta do laboratório. O sistema consiste em retirar 
uma vela do candelabro do lado da porta, que a mesma se abre, e, ao 
colocar a vela de volta ao candelabro, a porta se fecha. Porém, 
Chapolout descobriu que a vela era só uma desculpa. Na verdade, 
o assistente do cientista, chamado Pepe, é que abria a porta do 
laboratório, por dentro. Um tempo depois, o sistema foi modificado, 
para funcionar igualmente ao projeto inicial. Colocaram um sensor de 
pressão embaixo da vela do candelabro, de modo que a retirada da vela 
ativa o sistema. Este sistema emite um relatório de log por cada vez que 
a porta abriu ou fechou, mas o log está bem confuso. A cada registro, 
três números inteiros são cadastrados, sendo a hora e o minuto que o 
evento ocorreu e um valor que representa se a porta abriu ou fechou 
naquele momento. Pepe pede a sua ajuda para converter os dados do log 
em dados mais legíveis para ele.

Escreva um programa que, dado um registro de log, este seja 
convertido em textos mais legíveis.

Entrada
A primeira linha contém a quantidade de casos de teste. 
Cada linha de um caso de teste possui três inteiros H, M e O, 
sendo a hora, o minuto da ocorrência, e a própria ocorrência 
(zero se a porta fechou ou um se a porta abriu).

Saída
Para cada caso de teste, imprima o horário da ocorrência, 
no devido formato, seguido de um espaço, um hífen e um espaço, 
e da frase “A porta abriu!” ou “A porta fechou!”, conforme a ocorrência registrada.

Exemplo de Entrada	
3

15 30 1

23 50 0

0 5 1

Exemplo de Saída

15:30 - A porta abriu!

23:50 - A porta fechou!

00:05 - A porta abriu!
*/


public class L04pEx11 {
    
}
