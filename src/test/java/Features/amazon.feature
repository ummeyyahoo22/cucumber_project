Feature:Search Functionality

     Scenario:Validate the Search Funtionality for Amazon
       Given launch the chrome "<browser>";
       Then go to the url https://www.amazon.com
       When i landed on amazon homepage
       Then i entered following character in the search field computer
       And i clicked on the search icon
       Then the result according to keyword displays on the screen


