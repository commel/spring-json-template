/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app.controllers;

import app.models.ajax.Example;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author britter
 */
@Controller
@RequestMapping("/rest")
public class ExampleController {
    
    @RequestMapping("example.json")
    public ResponseEntity<Example> showExample(@RequestParam("id") Long id) {
        final Example ex = new Example();
        ex.setId(id);
        ex.setCreationTimestamp(new Date());
        
        return new ResponseEntity<>(ex, HttpStatus.OK);
    }
    
}
