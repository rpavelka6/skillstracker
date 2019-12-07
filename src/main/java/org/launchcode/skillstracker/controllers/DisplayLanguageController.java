package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class DisplayLanguageController {

    @GetMapping
    @RequestMapping("/")
    public String displayHeader() {
        return "<html><head>" +
                "<h1>" +
                "Skills Tracker" +
                "</h1>" +
                "</head>" +
                "<body>" +
                "<h2>" +
                "We have a few skills we would like you to learn.  Here is the list!" +
                "</h2>" +
                "<ol type='1'>" +
                "<li>Java</li>\n" +
                "  <li>JavaScript</li>\n" +
                "  <li>Python</li>\n" +
                "</ol>" +
                "</html>";
    }

//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="skill")
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String displayLanguageChoice(@RequestParam (defaultValue = "World") String name,
            @RequestParam (defaultValue = "Java") String language) {
        return "Language chosen";
    }

    @GetMapping("form")
    public String languageForm() {
        return "<html>" +
                "<body><h1><center>" +
                "<form method = 'post' action = '/formSubmit'" +
                "Name: <br>" +
                "<input type='text' name='name' /><br>" +
                "My favorite language: <br>" +
                "<select name='language'>" +
                    "<option value='javascript'>JavaScript</option>" +
                    "<option value='java'>Java</option>" +
                    "<option value='python'>Python</option>" +
                "</select>" +
                "<br>" +
                "My second favorite language:<br>" +
                "<select name='language2'>" +
                    "<option value='javascript'>JavaScript</option>" +
                    "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br>" +
                "My third favorite language:<br>" +
                "<select name=language3'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br><input type='submit' value='Submit'>" +
                "</form></h1></center>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value = "/formSubmit", method = {RequestMethod.GET, RequestMethod.POST})     //Handles both get and post requests
    public String displayValues(@RequestParam (defaultValue = "World") String name,
                                      @RequestParam (defaultValue = "JavaScript") String language,
                                      @RequestParam (defaultValue = "Java") String language1,
                                      @RequestParam (defaultValue = "Python") String language2) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol type = 1><li>" + language+ "</li>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "</body>" +
                "</html>";
    }

}
