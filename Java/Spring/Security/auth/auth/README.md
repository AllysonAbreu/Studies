# About this project

This project is a straightforward example of how to use Spring Security, implementing authentication (stateless) and authorization for developing a web application.
It is based on [Fernanda Kipper's](https://github.com/Fernanda-Kipper) [video tutorial](https://youtu.be/5w-YCcOjPD0?si=tn9eRYRCg9Be9Qxt).
For more details, watch the video or contact me on [LinkedIn](https://www.linkedin.com/in/allyson-de-abreu/).

## How to run
1. Clone this repository
```bash
git clone https://github.com/AllysonAbreu/Studies.git
```
2. Install dependencies with:
```bash
mvn clean install
```
3. Set up a PostgreSQL database, either locally or using an online service, and add the credentials in the ```application.yaml``` file.
4. The application will run on ```localhost:8080```. You can use [Postman](https://www.postman.com/) or [Insomnia](https://insomnia.rest/download) to test the endpoints.
5. Don't forget to add the ```Authorization``` header with the ```Bearer``` token to access the protected endpoints.
6. Download the [Postman collection](https://github.com/AllysonAbreu/Studies/blob/main/PostmanCollections/Spring/Auth%20API.postman_collection.json).