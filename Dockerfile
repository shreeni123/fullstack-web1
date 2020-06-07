FROM maven:3-alpine
WORKDIR /app
COPY . /app 
RUN mvn -B -DskipTests compile
CMD [ "mvn", "bash" ]

