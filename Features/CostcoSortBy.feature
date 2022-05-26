Feature: Validate Sort by dropdown
@happy_path_us3

Scenario Outline:
Given user visits Costco homepage
When user types "<product name>" and clicks search button  
When user clicks sort by dropdown and select one of the sort option
Then user will be able to see the results sorted out successfully

Examples:

|product name|
|baby wipes|

