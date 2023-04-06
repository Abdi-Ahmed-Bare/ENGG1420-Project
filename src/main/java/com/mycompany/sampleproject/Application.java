package com.mycompany.sampleproject;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carter Rows
 */
public class Application {
    
    // throws file not found exception and parse exception
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        try {
            System.out.println("1420 Project:\n");
            // call scenario processor class "parse and excecute", with the directory for json file
            ScenarioProcessor.ParseAndExecute("D:\\Desktop\\Windows\\Documents\\NetBeansProjects\\FINAL-PROJECT-ENGG1420\\test.json");
        } catch (org.json.simple.parser.ParseException ex) {
            // catch parse exception error
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
