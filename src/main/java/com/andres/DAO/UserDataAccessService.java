package com.andres.DAO;

import com.andres.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository("postgres")
public class UserDataAccessService implements UsersDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int createUser(UUID id, Users user) {
        return 0;
    }

    @Override
    public List<Users> getAllUsers() {
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql,(resultSet, i) ->{
            UUID id = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("id");
            int age = resultSet.getInt("age");
            String userName = resultSet.getString("userName");
            String email = resultSet.getString("email");
            String password = resultSet.getString("password");
            return new Users(id,name,age,userName,email,password);
        });
    }

    @Override
    public Optional<Users> getUserById(UUID id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        Users user = jdbcTemplate.queryForObject(sql,
                new Object[]{id},(resultSet, i) ->{
            UUID userId = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("id");
            int age = resultSet.getInt("age");
            String userName = resultSet.getString("userName");
            String email = resultSet.getString("email");
            String password = resultSet.getString("password");
            return new Users(userId,name,age,userName,email,password);
        });
        return Optional.ofNullable(user);
    }

    @Override
    public int deleteUsersById(UUID id) {
        String sql = "DELETE FROM users WHERE id = ?";
        jdbcTemplate.update(sql,id);
        return 0;
    }

    @Override
    public int updateUserById(UUID id, Users user) {
        return 0;
    }
}
