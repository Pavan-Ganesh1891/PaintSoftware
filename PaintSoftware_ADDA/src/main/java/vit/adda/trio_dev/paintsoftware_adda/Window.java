package vit.adda.trio_dev.paintsoftware_adda;

public class Window {
    public String open() {
        String msg="Window opened.";
        System.out.println(msg);
        return msg;
    }

    public void close() {
        System.out.println("Window closed.");
    }
    

    public void resize(int units) {
        System.out.println("Window resized to " + units + " units.");
    }

    public void display() {
        System.out.println("Displaying the window content.");
    }

    public void handleEvent(Event event) {
        System.out.println("Handling event in window.");
        event.triggerEvent();
    }
}

