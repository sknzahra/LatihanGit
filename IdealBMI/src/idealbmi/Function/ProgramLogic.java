/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealbmi.Function;

import idealbmi.Model.ModelProgram;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import idealbmi.Model.Operation;
import java.text.DecimalFormat;

/**
 *
 * @author Asus
 */
public class ProgramLogic extends ModelProgram{
    ModelProgram mp = new ModelProgram();
    
    public Boolean checkName(String name){
        Pattern pattern = Pattern.compile("^[a-zA-Z\\s-]+$");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    
    public Boolean checkAge(String age){
        Pattern pattern = Pattern.compile("^[1-9]?[0-9]{1}$|^100$");
        Matcher matcher = pattern.matcher(age);
        return matcher.matches();
    }
    
    public String returnBMI(ModelProgram modelProgram){
        Operation op = new Operation();
        DecimalFormat format = new DecimalFormat("##,##");
        double result = op.operation(modelProgram.getWeight(), modelProgram.getHeight());
        String total = "" + format.format(result);
        return total;
    }
	
    public String returnTips(ModelProgram modelProgram){
        Operation op = new Operation();
        DecimalFormat format = new DecimalFormat("##,##");
        double result = op.operation(modelProgram.getWeight(), modelProgram.getHeight());
        String total = "" + format.format(result);
        return total;
    }

}

