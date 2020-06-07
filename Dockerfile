FROM maven:3-alpine
COPY . .
CMD [ "mvn", "bash" ]

