Background
In the world of capital projects, many organizations have the need to formally manage the
financial terms of the contracts that they enter into. It is a direct and straightforward way to get a
sense of how much money has been spent on a project, and how much money is expected to
be received by the organization performing the work. Typically, this area is called Contract Management.

Contract managers have several areas of interest:
● Budgets (how much money did I expect to spend/receive)
● Commitments (how much money have I committed to spending/receiving)
● Forecasts (how much money in the future will I have to spend/receive)
● Payments (how much money has actually left/arrived in my bank account)

The combination of these items is sufficient to get a sense of the performance of the project
from a financial perspective.

Deliverable
Our goal is to be able to display a list of contracts with some detail given a set of initial dummy
data. Some additional details:
● The list should be presented in a tabular format
● Each contract should have a “Code”, “Description”, “Budget ($)”, “Committed Cost ($)”,
“Forecast ($)”, “Paid ($)”, “Complete (%)”, and “Vendor” field. Unless otherwise
indicated, the fields are either numerical, or text based.
● A user will want to edit the values in some way and expect them to stick around
● The user should know what project they are on. Consequently, a project consists of at
least a name. A project has many contracts. You should place the project name
somewhere on the page.


Summary:

This simple web application use of the following technologies:

- Spring boot
- Spring data JPA + hibernate
- H2 in-memory database
- flywaydb for integration
- Angular JS,bootstrap and other third parties JavaScript libraries
- HTML5, CSS3, and JavaScript


How to Run

Steps:
1. Clone this project and import into your IDE(Eclipse, IntelliJ or Spring STS, etc...)
2. After it is imported, navigate into /src/java/com/aconex/ and run Application.java as Application from the IDE.
3. A spring boot application should be running.

View UI:
1. Type http://localhost:8080/index.html on browser to view


View database:

1. Type http://localhost:8080/h2 onto browser address location after the application runs
2. make sure the JDBC URL is jdbc:h2:~/cms and click on "CONNECT" to get into the database





