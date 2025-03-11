Feature: Search and access in the search bar

	@Test
	Scenario: Validate Search and Access in the Search Bar
		Given Test case: 'Search and access in the search bar'
		Given That I am using the browser CHROME
		Given That I access the Amazon website
		Then I enter the following words and validate their return:
		|	AIR		|
		|	FRY		|
		|	PROC	|
		|	BAG		|