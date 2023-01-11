# KafkaWithSpringBoot-Basics

This repository helps us to get a basic information on How kafka Works . 

Prerequisites : 

1. Kafka should be installed in your machine 
2. intellij new community version 

We have to start kafka in few terminal tabs to see how kafka messaging works 

tab1(zookeeper) -> bin/zookeeper-server-start.sh config/zookeeper.properties
tab2(kafka server) -> bin/kafka-server-start.sh config/server.properties
tab3(producer1) -> bin/kafka-console-producer.sh --broker-list localhost:9092 --topic kafka_example
tab4(consumer1) -> bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic kafka_example --from-beginning
tab5(producer2) -> bin/kafka-console-producer.sh --broker-list localhost:9092 --topic kafka_example_json
tab6(consumer2) -> bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic kafka_example_json --from-beginning

We have used two producers and two consumers and we have configured the same in code base . When we run producer we can the message log in terminal or 
intellij run screen 



https://user-images.githubusercontent.com/24520290/211762565-0b3062e2-f95c-4921-8356-b9f9ebbbdf34.mov

