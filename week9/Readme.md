
**Class Command**

```java
package PBO.week9;

public class Command {
    private String commandWord;
    private String secondWord;

    public Command(String firstWord, String secondWord) {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

    public String getCommandWord() {
        return commandWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public boolean isUnknown() {
        return (commandWord == null);
    }

    public boolean hasSecondWord() {
        return (secondWord != null);
    }
}
```java

class Command memiliki fungsi untuk mewakili perintah yang diinput oleh user, class Command memiliki 2 variable yaitu command word dan second word untuk menavigasi
user. command word digunakan untuk menentukan mode apa yang ditampilkan oleh program, sedangkan second word mewakili keterangan dari command word


**Class CommandWords**

```java
package PBO.week9;

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
```java

class CommandWords digunakan untuk menentukan berapa mode yang dimiliki oleh program, pada program ini kita mendefinisikan 4 mode yaitu : go,quit,help, and look menggunakan

```java
    private static final String validCommands [] = {
        "go", "quit", "help", "look"
    };
```java

lalu terdapat fungsi isCommand

```java
    public boolean isCommand(String string){
        for (int i = 0; i<validCommands.length; i++){
            if (validCommands[i].equals(string))
            return true;
        }
        return false;
    }
```java

fungsi isCommand digunakan untuk memetakan input dari user ke dalam string validCommand kita untuk melakukan check apakah input dari user merupakan salah satu dari mode/Command dari program

**Class Room**

```java
package PBO.week9;

public class Room {
    public String description;
    public Room northExit;
    public Room southExit;
    public Room eastExit;
    public Room westExit;

    public Room(String description) {
        this.description = description;
    }

    public void setExits(Room north, Room east, Room south, Room west) {
        if (north != null) northExit = north;
        if (east != null) eastExit = east;
        if (south != null) southExit = south;
        if (west != null) westExit = west;
    }

    public String getDescription() {
        return description;
    }
}
```java

Class Room berfungsi untuk memetakan dan mendefinisikan Room yang kita punya di dalam program, pada class Room terdapat 4 variable yaitu northexit, southexit, eastexit, and westexit dan juga deskripsi yang mewakili deskripsi tiap room
pada class Room terdapat fungsi setExists
```java
public void setExits(Room north, Room east, Room south, Room west) {
        if (north != null) northExit = north;
        if (east != null) eastExit = east;
        if (south != null) southExit = south;
        if (west != null) westExit = west;
    }
```java
fungsi setExist pada class Room bertujuan untuk menghubungkan current room dengan next room pada arah tertentu


**Class Parser**
```java
package PBO.week9;
import java.io.BufferedReader;
import java.io.InputStreamReader; 
import java.util.StringTokenizer;

public class Parser
{
    private CommandWords commands;
    
    public Parser(){
        commands = new CommandWords();
    }
    
    public Command getCommand(){
        String inputLine = "";
        String word1;
        String word2;
        System.out.print("> ");
        
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        try {
            inputLine = reader.readLine();
        } catch(java.io.IOException exc) {
            System.out.println("There was an error during reading: " + exc.getMessage());
        }
        
        StringTokenizer tokenizer = new StringTokenizer(inputLine);
        if(tokenizer.hasMoreTokens())
        word1 = tokenizer.nextToken();
        else 
        word1 = null;
        if (tokenizer.hasMoreTokens())
        word2 = tokenizer.nextToken();
        else 
        word2 = null;
        
        if (commands.isCommand(word1))
        return new Command(word1, word2);
        else 
        return new Command(null,word2);
        }
   
}
```java

Class Parser berfungsi untuk membaca input dari pemain dan mengubahnya menjadi objek Command dengan flow :
Menampilkan prompt >
Membaca input baris dari System.in
Memecah input jadi dua kata menggunakan StringTokenizer
Kata pertama-> command
Kata kedua-> argument
Mengecek apakah kata pertama valid lewat CommandWords
Mengembalikan Command yang sesuai


