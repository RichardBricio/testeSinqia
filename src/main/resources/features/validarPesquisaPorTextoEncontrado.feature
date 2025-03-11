Feature: Validar funcionamento de pesquisa - Textos Validos

	@Test
	Scenario: Validar campo de pesquisa e seu retorno valido
		Given Teste: 'Validar funcionamento de pesquisa - Textos Validos'
		Given Que eu esteja usando o navegador FIREFOX
		And Eu acesso o site AgiBank
		Then Eu valido a busca VALIDA com as seguintes palavras:
		|	LAR		|
		|	AMARELO	|
		|	VERDE	|
		|	VIDA	|