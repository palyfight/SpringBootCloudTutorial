package example;

import brave.sampler.Sampler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/example")
@Slf4j
public class HelloWorldController {

    @GetMapping("/hello")
    public String getHello() {
        log.info("Hello Sleuth");
        log.error("This is a FAKE error");
        return "Hello YOU!";
    }

    @Bean
    public Sampler alwaysSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

}