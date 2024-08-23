package com.user.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.user.dao.UserDAO;
import com.user.entity.Login;
import com.user.entity.User;
import com.user.service.UserService;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;

@ContextConfiguration(classes = {UserRestController.class, RestTemplate.class, UserService.class})
@ExtendWith(SpringExtension.class)
class UserRestControllerDiffblueTest {
    @MockBean
    private UserDAO userDAO;

    @Autowired
    private UserRestController userRestController;

    /**
     * Method under test: {@link UserRestController#deleteUser(String)}
     */
    @Test
    void testDeleteUser() throws Exception {
        // Arrange
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/userservice/user/{email}",
                "jane.doe@example.org");

        // Act and Assert
        MockMvcBuilders.standaloneSetup(userRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("\"OK\""));
    }

    /**
     * Method under test: {@link UserRestController#getAllProperties()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllProperties() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access the network.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new UserRestController()).getAllProperties();
    }

    /**
     * Method under test: {@link UserRestController#getAllPropertiesByOwnerId(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllPropertiesByOwnerId() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access the network.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new UserRestController()).getAllPropertiesByOwnerId(1);
    }

    /**
     * Method under test: {@link UserRestController#userLogin(Login)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUserLogin() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.springframework.http.converter.HttpMessageConversionException: Type definition error: [simple type, class com.user.entity.Login]; nested exception is com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Cannot construct instance of `com.user.entity.Login` (no Creators, like default constructor, exist): cannot deserialize from Object value (no delegate- or property-based Creator)
        //    at [Source: (PushbackInputStream); line: 1, column: 2]
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:681)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //   com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Cannot construct instance of `com.user.entity.Login` (no Creators, like default constructor, exist): cannot deserialize from Object value (no delegate- or property-based Creator)
        //    at [Source: (PushbackInputStream); line: 1, column: 2]
        //       at com.fasterxml.jackson.databind.exc.InvalidDefinitionException.from(InvalidDefinitionException.java:67)
        //       at com.fasterxml.jackson.databind.DeserializationContext.reportBadDefinition(DeserializationContext.java:1904)
        //       at com.fasterxml.jackson.databind.DatabindContext.reportBadDefinition(DatabindContext.java:400)
        //       at com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:1349)
        //       at com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1415)
        //       at com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:351)
        //       at com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:184)
        //       at com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.readRootValue(DefaultDeserializationContext.java:322)
        //       at com.fasterxml.jackson.databind.ObjectMapper._readMapAndClose(ObjectMapper.java:4674)
        //       at com.fasterxml.jackson.databind.ObjectMapper.readValue(ObjectMapper.java:3682)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:681)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        UserRestController userRestController = new UserRestController();

        // Act
        userRestController.userLogin(new Login("jane.doe@example.org", "iloveyou"));
    }

    /**
     * Method under test: {@link UserRestController#deleteUser(String)}
     */
    @Test
    void testDeleteUser2() throws Exception {
        // Arrange
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/userservice/user/{email}",
                "jane.doe@example.org");
        requestBuilder.characterEncoding("Encoding");

        // Act and Assert
        MockMvcBuilders.standaloneSetup(userRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("\"OK\""));
    }

    /**
     * Method under test: {@link UserRestController#getAllUsers()}
     */
    @Test
    void testGetAllUsers() throws Exception {
        // Arrange
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/userservice/users");

        // Act and Assert
        MockMvcBuilders.standaloneSetup(userRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link UserRestController#getAllUsers()}
     */
    @Test
    void testGetAllUsers2() throws Exception {
        // Arrange
        User user = new User();
        user.setPassword("iloveyou");
        user.setUseremail("jane.doe@example.org");
        user.setUserfname("?");
        user.setUserid(1);
        user.setUserlname("?");
        user.setUserphone("6625550144");

        ArrayList<User> userList = new ArrayList<>();
        userList.add(user);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/userservice/users");

        // Act and Assert
        MockMvcBuilders.standaloneSetup(userRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "[{\"userid\":1,\"userfname\":\"?\",\"userlname\":\"?\",\"userphone\":\"6625550144\",\"useremail\":\"jane.doe@example"
                                        + ".org\",\"password\":\"iloveyou\"}]"));
    }

    /**
     * Method under test: {@link UserRestController#getAllUsers()}
     */
    @Test
    void testGetAllUsers3() throws Exception {
        // Arrange
        User user = new User();
        user.setPassword("iloveyou");
        user.setUseremail("jane.doe@example.org");
        user.setUserfname("?");
        user.setUserid(1);
        user.setUserlname("?");
        user.setUserphone("6625550144");

        User user2 = new User();
        user2.setPassword("?");
        user2.setUseremail("john.smith@example.org");
        user2.setUserfname("Userfname");
        user2.setUserid(2);
        user2.setUserlname("Userlname");
        user2.setUserphone("8605550118");

        ArrayList<User> userList = new ArrayList<>();
        userList.add(user2);
        userList.add(user);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/userservice/users");

        // Act and Assert
        MockMvcBuilders.standaloneSetup(userRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "[{\"userid\":2,\"userfname\":\"Userfname\",\"userlname\":\"Userlname\",\"userphone\":\"8605550118\",\"useremail\":"
                                        + "\"john.smith@example.org\",\"password\":\"?\"},{\"userid\":1,\"userfname\":\"?\",\"userlname\":\"?\",\"userphone\":"
                                        + "\"6625550144\",\"useremail\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}]"));
    }

    /**
     * Method under test: {@link UserRestController#getUserByEmail(String)}
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
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/userservice/user/{email}",
                "jane.doe@example.org");

        // Act and Assert
        MockMvcBuilders.standaloneSetup(userRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"userid\":1,\"userfname\":\"Userfname\",\"userlname\":\"Userlname\",\"userphone\":\"6625550144\",\"useremail\":\"jane"
                                        + ".doe@example.org\",\"password\":\"iloveyou\"}"));
    }

    /**
     * Method under test: {@link UserRestController#registerNewUser(User)}
     */
    @Test
    void testRegisterNewUser() throws Exception {
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
        String content = (new ObjectMapper()).writeValueAsString(user2);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/userservice/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userRestController)
                .build()
                .perform(requestBuilder);

        // Assert
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(400))
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("{\"message\":\"FAILURE\",\"description\":\"Registration failed\"}"));
    }

    /**
     * Method under test: {@link UserRestController#registerNewUser(User)}
     */
    @Test
    void testRegisterNewUser2() throws Exception {
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
        String content = (new ObjectMapper()).writeValueAsString(user2);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/userservice/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(userRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("{\"message\":\"SUCCESS\",\"description\":\"Registration successfull\"}"));
    }

    /**
     * Method under test: {@link UserRestController#updateUser(User)}
     */
    @Test
    void testUpdateUser() throws Exception {
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
        String content = (new ObjectMapper()).writeValueAsString(user2);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/userservice/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(userRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("\"OK\""));
    }

    /**
     * Method under test: {@link UserRestController#updateUser(User)}
     */
    @Test
    void testUpdateUser2() throws Exception {
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
        String content = (new ObjectMapper()).writeValueAsString(user2);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/userservice/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userRestController)
                .build()
                .perform(requestBuilder);

        // Assert
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(400))
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"message\":\"FAILURE\",\"description\":\"User update failed\"}"));
    }
}
