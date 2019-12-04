# KafKa-and-spring
a simple integration of kafka in spring boot
you need to follow the installation procedure in thins link
https://www.edureka.co/community/39170/how-to-install-kafka-on-windows-system
you should tape this command after starring the both (start zookeeper first and after kafka)
in the directory C:\kafka_2.12-2.3.1\bin\windows tape this command :kafka-console-producer.bat --broker-list localhost:9092 --topic "the name of topics indicated in the KafkaListner in Spring"
