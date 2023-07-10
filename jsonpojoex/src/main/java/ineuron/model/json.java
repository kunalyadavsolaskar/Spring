package ineuron.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class json {

    public static void main(String[] args) {
        String json = "{\"id\":\"123456\",\"name\":\"John Doe\",\"email\":\"johndoe@example.com\"}";

        ObjectMapper mapper = new ObjectMapper();

        try {
            // Convert JSON to POJO
            Customer customer = mapper.readValue(json, Customer.class);

            // Print the converted POJO
            System.out.println(customer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
