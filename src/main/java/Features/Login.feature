Feature:

@smoke
Scenario Outline:
Given greenkart application should open.
When Search with vegetable name <Name>
And Capture the filterDetails and then click on the Link.
Then Again Search with vegetable name <Name> and capture the filtered details.
And validate the landing page and Offers Page filter details.

Examples:
|Name|
|Tom|
|Beet|

