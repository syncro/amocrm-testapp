# amocrm-testapp


This example demonstrates how you can use amocrm API client

1. edit client credentials in TestApp class with yours
```$java
        LeadHalClient leadClient = new LeadHalClientBuilder()
                .baseUrl("https://something.amocrm.ru/")
                .login("email@example.com")
                .passwordHash("4582e7asdfs7bsdfsdfsf96")
                .build();
```
2. build with shadowJar task
```$bash
./gradlew shadowJar 
```
3. run with 
```$bash
java -jar ./build/libs/testapp-1.0-all.jar 
```