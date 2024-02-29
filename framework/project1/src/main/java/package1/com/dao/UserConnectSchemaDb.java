package package1.com.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import package1.com.model.UserInfoSchema;

public interface UserConnectSchemaDb extends MongoRepository<UserInfoSchema, String> {
}
