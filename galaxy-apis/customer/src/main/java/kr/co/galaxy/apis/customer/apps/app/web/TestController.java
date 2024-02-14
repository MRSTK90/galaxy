package kr.co.galaxy.apis.customer.apps.app.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

/**
 * Class Description 
 *
 *
 * @class TestController
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-02-14      SungTae Kim	    최초 작성		
 * </pre>
 */

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("time")
    public ResponseEntity<Object> time(String time){
        LocalTime localTime = LocalTime.parse(time);

        return ResponseEntity.ok(localTime);
    }
}
