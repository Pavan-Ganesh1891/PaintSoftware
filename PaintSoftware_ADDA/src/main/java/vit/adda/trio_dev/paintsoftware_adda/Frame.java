package vit.adda.trio_dev.paintsoftware_adda;
public class Frame {
    private final Window w = new Window();

    public String showFrame() {
        System.out.println("Frame shown.");
        w.display();
        
        return "Frame shown.";
    }
}

