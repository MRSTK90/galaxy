package kr.co.galaxy.apis.user.app.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Description 
 *
 *
 * @class ConfigController
 * @author SungTae Kim
 * @version 1.0
 * @modification
 * <pre>
 * since	    author	        description
 * ---------	------------	---------------------
 * 2024-03-07      SungTae Kim	    최초 작성		
 * </pre>
 */

@RestController
@RequestMapping("config")
public class ConfigController {

    @Value("${galaxy.use: false}")
    private boolean use;

    @Value("${galaxy.key: val}")
    private String value;

    @GetMapping
    public ResponseEntity<Object> get(){
        List<Object> result = new ArrayList<>();
        result.add(use);
        result.add(value);
        return ResponseEntity.ok(result);
    }
}
