package guru.springframework.springaiintro.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class OpenAIServiceImplTest {  // this is for testing

    @Autowired
    OpenAIService openAIService;

    @Test
    void getAnswer() {

        String answer = openAIService.getAnswer("\"Write a short story about a robot who discovers emotions after finding" +
                " a dusty old book of poetry in a post-apocalyptic library.\"\n");
        System.out.println("Got The answer");
        System.out.println(answer);

    }
}