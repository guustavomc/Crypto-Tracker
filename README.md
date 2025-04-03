--Create jar file
mvn clean package

Create docker image and run it
docker build -t crypto-tracker .

docker run -it --rm crypto-tracker
