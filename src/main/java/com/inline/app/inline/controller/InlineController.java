package com.inline.app.inline.controller;

import com.inline.app.inline.entity.FactoryDefect;
import com.inline.app.inline.service.InlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InlineController {

    @Autowired
    private InlineService inlineService;

    @RequestMapping(value = "/defect", method = RequestMethod.PUT)
    public ResponseEntity<?> addDefects(@RequestBody InlineRequest inlineRequest) {
        inlineService.addDefect(inlineRequest);
        return new ResponseEntity<String>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/fetch_defects", method = RequestMethod.GET)
    public ResponseEntity<?> getDefects() {
        return new ResponseEntity<List<FactoryDefect>>(inlineService.getDefects(),
                HttpStatus.OK);
    }
}
