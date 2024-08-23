package com.user.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.user.dao.UserDAO;
import com.user.entity.Login;
import com.user.entity.User;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {UserService.class})
@ExtendWith(SpringExtension.class)
class UserServiceDiffblueTest {
    @MockBean
    private UserDAO userDAO;

    @Autowired
    private UserService userService;

    /**
     * Method under test: {@link UserService#validateUser(Login)}
     */
    @Test
    void testValidateUser() {
        // Arrange
        User user = new User();
        user.setPassword("iloveyou");
        user.setUseremail("jane.doe@example.org");
        user.setUserfname("Userfname");
        user.setUserid(1);
        user.setUserlname("Userlname");
        user.setUserphone("6625550144");

        // Act
        boolean actualValidateUserResult = userService.validateUser(new Login("jane.doe@example.org", "iloveyou"));

        // Assert
        assertTrue(actualValidateUserResult);
    }

    /**
     * Method under test: {@link UserService#validateUser(Login)}
     */
    @Test
    void testValidateUser2() {
        // Arrange
        User user = new User();
        user.setPassword("LS");
        user.setUseremail("jane.doe@example.org");
        user.setUserfname("Userfname");
        user.setUserid(1);
        user.setUserlname("Userlname");
        user.setUserphone("6625550144");

        // Act
        boolean actualValidateUserResult = userService.validateUser(new Login("jane.doe@example.org", "iloveyou"));

        // Assert
        assertFalse(actualValidateUserResult);
    }

    /**
     * Method under test: {@link UserService#insertUser(User)}
     */
    @Test
    void testInsertUser() {
        // Arrange
        User user = new User();
        user.setPassword("iloveyou");
        user.setUseremail("jane.doe@example.org");
        user.setUserfname("Userfname");
        user.setUserid(1);
        user.setUserlname("Userlname");
        user.setUserphone("6625550144");

        // Act
        boolean actualInsertUserResult = userService.insertUser(user);

        // Assert
        assertFalse(actualInsertUserResult);
    }

    /**
     * Method under test: {@link UserService#insertUser(User)}
     */
    @Test
    void testInsertUser2() {
        // Arrange
        User user = new User();
        user.setPassword("iloveyou");
        user.setUseremail("jane.doe@example.org");
        user.setUserfname("Userfname");
        user.setUserid(1);
        user.setUserlname("Userlname");
        user.setUserphone("6625550144");

        User user2 = new User();
        user2.setPassword("iloveyou");
        user2.setUseremail("jane.doe@example.org");
        user2.setUserfname("Userfname");
        user2.setUserid(1);
        user2.setUserlname("Userlname");
        user2.setUserphone("6625550144");

        // Act
        boolean actualInsertUserResult = userService.insertUser(user2);

        // Assert
        assertTrue(actualInsertUserResult);
    }

    /**
     * Method under test: {@link UserService#getUserByEmail(String)}
     */
    @Test
    void testGetUserByEmail() throws Exception {
        // Arrange
        User user = new User();
        user.setPassword("iloveyou");
        user.setUseremail("jane.doe@example.org");
        user.setUserfname("Userfname");
        user.setUserid(1);
        user.setUserlname("Userlname");
        user.setUserphone("6625550144");

        // Act
        User actualUserByEmail = userService.getUserByEmail("jane.doe@example.org");

        // Assert
        assertSame(user, actualUserByEmail);
    }

    /**
     * Method under test: {@link UserService#updateUser(User)}
     */
    @Test
    void testUpdateUser() {
        // Arrange
        User user = new User();
        user.setPassword("iloveyou");
        user.setUseremail("jane.doe@example.org");
        user.setUserfname("Userfname");
        user.setUserid(1);
        user.setUserlname("Userlname");
        user.setUserphone("6625550144");

        User user2 = new User();
        user2.setPassword("iloveyou");
        user2.setUseremail("jane.doe@example.org");
        user2.setUserfname("Userfname");
        user2.setUserid(1);
        user2.setUserlname("Userlname");
        user2.setUserphone("6625550144");

        // Act
        boolean actualUpdateUserResult = userService.updateUser(user2);

        // Assert
        assertTrue(actualUpdateUserResult);
    }

    /**
     * Method under test: {@link UserService#updateUser(User)}
     */
    @Test
    void testUpdateUser2() {
        // Arrange
        User user = new User();
        user.setPassword("iloveyou");
        user.setUseremail("jane.doe@example.org");
        user.setUserfname("Userfname");
        user.setUserid(1);
        user.setUserlname("Userlname");
        user.setUserphone("6625550144");

        // Act
        boolean actualUpdateUserResult = userService.updateUser(user);

        // Assert
        assertFalse(actualUpdateUserResult);
    }

    /**
     * Method under test: {@link UserService#deleteByEmail(String)}
     */
    @Test
    void testDeleteByEmail() throws Exception {
        // Arrange and Act
        boolean actualDeleteByEmailResult = userService.deleteByEmail("jane.doe@example.org");

        // Assert
        assertTrue(actualDeleteByEmailResult);
    }

    /**
     * Method under test: {@link UserService#getAllUsers()}
     */
    @Test
    void testGetAllUsers() {
        // Arrange and Act
        List<User> actualAllUsers = userService.getAllUsers();

        // Assert
        assertTrue(actualAllUsers.isEmpty());
    }

    /**
     * Method under test: {@link UserService#getAllUsers()}
     */
    @Test
    void testGetAllUsers2() {
        // Arrange
        User user = new User();
        user.setPassword("iloveyou");
        user.setUseremail("jane.doe@example.org");
        user.setUserfname("Userfname");
        user.setUserid(1);
        user.setUserlname("Userlname");
        user.setUserphone("6625550144");

        ArrayList<User> userList = new ArrayList<>();
        userList.add(user);

        // Act
        List<User> actualAllUsers = userService.getAllUsers();

        // Assert
        assertEquals(userList, actualAllUsers);
    }

    /**
     * Method under test: {@link UserService#getAllUsers()}
     */
    @Test
    void testGetAllUsers3() {
        // Arrange
        User user = new User();
        user.setPassword("iloveyou");
        user.setUseremail("jane.doe@example.org");
        user.setUserfname("Userfname");
        user.setUserid(1);
        user.setUserlname("Userlname");
        user.setUserphone("6625550144");

        User user2 = new User();
        user2.setPassword("Password");
        user2.setUseremail("john.smith@example.org");
        user2.setUserfname("42");
        user2.setUserid(2);
        user2.setUserlname("42");
        user2.setUserphone("8605550118");

        ArrayList<User> userList = new ArrayList<>();
        userList.add(user2);
        userList.add(user);

        // Act
        List<User> actualAllUsers = userService.getAllUsers();

        // Assert
        assertEquals(userList, actualAllUsers);
    }
}
