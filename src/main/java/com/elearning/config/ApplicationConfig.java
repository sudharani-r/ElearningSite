package com.elearning.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
 

@Configuration
@PropertySource(value = "classpath:mongo-config.properties")
public class ApplicationConfig {
 
    @Value("${MONGO_DB_HOST}")
    private String MONGO_DB_HOST;
 
    @Value("${MONGO_DB_PORT}")
    private int MONGO_DB_PORT;
 
    @Value("${DB}")
    private String DB;
 
    protected String getDatabaseName() {
        return DB;
    }
 
    @Bean
    public Mongo getMongo() throws Exception {
        return new MongoClient(MONGO_DB_HOST, MONGO_DB_PORT);
    }
 
    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(getMongo(), getDatabaseName());
    }
 
    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
 
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
 
        return mongoTemplate;
 
    }
}
