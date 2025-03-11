Feature: Validar funcionamento de pesquisa - Textos Invalidos

	@Test
	Scenario: Validar campo de pesquisa e seu retorno invalido
		Given Teste: 'Validar funcionamento de pesquisa - Textos Invalidos'
		Given Que eu esteja usando o navegador FIREFOX
		And Eu acesso o site AgiBank
		Then Eu valido a busca INVALIDA com as seguintes palavras:
		|	AIR	|
		|	*&	|
		|	\	|
		|	GAG	|