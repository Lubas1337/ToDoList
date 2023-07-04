# ToDoList
Spring boot






Запуск Postgres в Docker  




sudo docker pull postgres 

sudo docker run --name ToDo -e POSTGRES_PASSWORD=passwors -d -p 5432:5432 postgres 

sudo docker exec -it ToDo psql -U postgres

sudo docker exec -it ToDo psql -U postgres

