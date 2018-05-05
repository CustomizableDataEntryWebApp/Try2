#Customizable-Data-Search Web Application
This is a class group project. The objective is to observe the entire software development life cycle using the agile methodology. The technology of choice for this project is the Java stack. We are developing a search application which interfaces with a pre-filled database. In version 1.0 we are pre-staging user/admin accounts. The Admin role can configure which search fields the user can use to search and retrieve the data. With multiple search fields the user has an option to either “Add” or “OR” their search keywords. This Wireframe demonstrates the visual. https://xd.adobe.com/view/eb8d3a70-ca84-4aa8-ac51-cf338c51a556/?fullscreen After developing and testing the app is to be deployed in Azure.

This project includes partial back end code with a repo and entities, the business layer, and stripped down viwes. The pre-staging user/admin accounts is done via the script below.

select * from users; select * from authority;

insert into users ( password ,username ) VALUES ( 'password1' -- password - IN varchar(255) ,'user1' -- username - IN varchar(255) );

insert into authority ( authority ,user_id ) VALUES ( 'ROLE_USER' -- authority - IN varchar(255) ,1 -- user_id - IN bigint(20) );
