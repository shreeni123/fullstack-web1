FROM maven:3.6.3-alpine
COPY . .
CMD [ "mvn", "bash" ]

