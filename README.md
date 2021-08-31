### API de gerenciamento de pessoas implementado no Santander Bootcamp | Fullstack Developer na Digital Innovation One

API com métodos CRUD desenvolvida em Java 11 com o uso de SpringBoot, Lombok e H2.

A classe *PersonService* apresenta os seguintes métodos públicos:

* createPerson(): insere uma pessoa no BD.
* listAll(): retorna uma lista com todas as pessoas no BD.
* findById(): retorna a pessoa com o ID informado.
* deleteById(): apaga a pessoa com o ID informado.
* updateById(): atualiza os dados da pessoa com o ID informado.

Os métodos privados são:

* verifyIfExists(): verifica se a pessoa de ID informado existe no BD.
* createMessageResponse(): cria uma mensagem de resposta da API.

