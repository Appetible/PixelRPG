package object;

import java.io.IOException;
import java.util.Objects;

import javax.imageio.ImageIO;

public class Boots extends SuperObject{
    
    public Boots() {

        name = "Stivali";
        try {
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/boots.png")));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
