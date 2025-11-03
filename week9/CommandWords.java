package PBO.week8;

public class CommandWords
{
    private static final String validCommands [] = {
        "go", "quit", "help", "look"
    };
    
    public CommandWords(){
        
    }
    
    public boolean isCommand(String string){
        for (int i = 0; i<validCommands.length; i++){
            if (validCommands[i].equals(string))
            return true;
        }
        return false;
    }
}