package ny.com;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
class TestContoller {
    //    ADD YOUR ENDPOINT MAPPINGS HERE

    public TestContoller() {
    }

    @GetMapping("/")
    public ResponseEntity<String> HomeTest() {
        return ResponseEntity.ok().body("DevOps is Easy! :D");
    }
}

