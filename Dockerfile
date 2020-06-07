FROM maven:3.6.3-openjdk-15
COPY . .
CMD [ "mvn", "bash" ]

