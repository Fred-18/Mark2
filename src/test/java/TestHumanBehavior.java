import org.example.Race.Human;
import org.junit.jupiter.api.Test;

public class TestHumanBehavior {

    @Test
    public void humanCanSpeak(){
        Human charlie = new Human("Charlie",23,"M",100,0);
        String results = charlie.speak(charlie.getName());


    }


}
