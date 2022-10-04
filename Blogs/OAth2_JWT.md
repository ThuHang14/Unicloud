# Spring Boot Security using OAuth2 with JWT

[author](https://www.pixeltrice.com/spring-boot-security-using-oauth2-with-jwt/)  
[video](https://youtu.be/af_2f1rrZdw)

1 . create spring with dependence

![image](https://user-images.githubusercontent.com/96046778/193729878-dfe2b6e1-3699-455b-9bb6-15467eebd39d.png)

```java
//  <!-- https://mvnrepository.com/artifact/org.springframework.security.oauth/spring-security-oauth2 -->
       <dependency>
           <groupId>org.springframework.security.oauth</groupId>
           <artifactId>spring-security-oauth2</artifactId>
           <version>2.5.2.RELEASE</version>
       </dependency>


    //    <!-- https://mvnrepository.com/artifact/org.springframework.security/spring-security-jwt -->
       <dependency>
           <groupId>org.springframework.security</groupId>
           <artifactId>spring-security-jwt</artifactId>
           <version>1.1.1.RELEASE</version>
       </dependency>
// lombook
        <dependency>
           <groupId>org.projectlombok</groupId>
           <artifactId>lombok</artifactId>
       </dependency>

```

3. Enable the Authorization Server and Resource Server
   inside SpringBootApplication , I inject 2 annotation `@EnableAuthorizationServer` and `@EnableResourceServer`

- `@EnableAuthorizationServer`: This annotation enables the Authorization Server in the application.
- `@EnableResourceServer`: It makes the application Resource Server.

Note: In this case, our application will act as both Authorization as well as Resource Server.
![image](https://user-images.githubusercontent.com/96046778/193731551-8158f108-3433-4196-bea1-3fc3680993fc.png)

4. Create a UsersPojo Class  
   Here we will create a class or POJO class to store the users or client information in the database.

```java
@Data
public class UsersPojo {
    private String username;
    private String password;
    private Collection<GrantedAuthority> listOfgrantedAuthorities = new ArrayList<>();

}
```

- `Collection<GrantedAuthority>`: It represents the collection or list of Granted Authority.
- `GrantedAuthority`: It is an interface in Spring Security which used to provides permission to perform some tasks to the user, for example, add the new user or delete the existing user, etc.

5. Create a User Helper Class

- We need to create one more class that extends the User class provided by spring security and it is present in `org.springframework.security.core.userdetails.User` .The purpose of creating a UsersHelper class is to `authenticate the user`.
