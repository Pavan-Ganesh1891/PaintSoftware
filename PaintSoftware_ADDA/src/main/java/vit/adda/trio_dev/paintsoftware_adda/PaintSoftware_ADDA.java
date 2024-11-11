package vit.adda.trio_dev.paintsoftware_adda;

import java.util.Scanner;
import java.util.ArrayList;


public class PaintSoftware_ADDA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Window window = new Window();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Open Window");
            System.out.println("2. Close Window");
            System.out.println("3. Resize Window");
            System.out.println("4. Display Window");
            System.out.println("5. Handle Event");
            System.out.println("6. Drawing context");
            System.out.println("7. Frame display");
            System.out.println("8. Console window");
            System.out.println("9. Dialog box");
            System.out.println("10. Draw Shape");
            System.out.println("11. Erase Shape");
            System.out.println("12. Move Shape");
            System.out.println("13. Resize Shape");
            System.out.println("14. Exit");
            
            System.out.print("\nYour Choice: ");
                    
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    window.open();
                    break;
                case 2:
                    window.close();
                    break;
                case 3:
                    System.out.print("Enter the units to resize the window: ");
                    int windowSize = scanner.nextInt();
                    window.resize(windowSize);
                    break;
                case 4:
                    window.display();
                    break;
                case 5:
                    Event event = new Event();
                    window.handleEvent(event);
                    break;
                case 6:
                    DrawingContext dc=new DrawingContext();
                    dc.setPoint();
                    dc.clearScreen();
                    dc.getVerticalSize();
                    dc.getHorizontalSize();
                    break;
                case 7:
                    Frame f=new Frame();
                    f.showFrame();
                    break;
                case 8:
                    ConsoleWindow cw=new ConsoleWindow();
                    cw.showConsole();
                    break;
                case 9:
                    DialogBox db=new DialogBox();
                    DataController d_c=new DataController();
                    d_c.controlData();
                    db.showDialog();
                    break;
                case 10:
                    System.out.print("Enter shape to draw (circle/rectangle/polygon): ");
                    String shapeType = scanner.nextLine().toLowerCase();

                    switch (shapeType) {
                        case "circle":
                            System.out.print("Enter radius for Circle: ");
                            float radius = scanner.nextFloat();
                            System.out.print("Enter x and y coordinates for Circle center: ");
                            int x = scanner.nextInt();
                            int y = scanner.nextInt();
                            Circle c = new Circle(radius, new Point(x, y));
                            c.draw();
                            break;
                        case "rectangle":
                            System.out.print("Enter width and height for Rectangle: ");
                            int width = scanner.nextInt();
                            int height = scanner.nextInt();
                            System.out.print("Enter x and y coordinates for top-left: ");
                            x = scanner.nextInt();
                            y = scanner.nextInt();
                            Rectangle a = new Rectangle(width, height, new Point(x, y));
                            a.draw();
                            break;
                        case "polygon":
                            ArrayList<Point> vertices = new ArrayList<>();
                            System.out.print("Enter number of vertices: ");
                            int verticesCount = scanner.nextInt();
                            for (int i = 0; i < verticesCount; i++) {
                                System.out.print("Enter x and y coordinates for vertex " + (i + 1) + ": ");
                                x = scanner.nextInt();
                                y = scanner.nextInt();
                                vertices.add(new Point(x, y));
                            }
                            Polygon p= new Polygon(vertices);
                            p.draw();
                            break;
                        default:
                            System.out.println("Invalid shape type.");
                    }
                    break;
                case 11:
                    System.out.print("Enter shape to erase (circle/rectangle/polygon): ");
                    String eraseType = scanner.nextLine().toLowerCase();
                    
                    switch(eraseType){
                        case "circle":
                            Circle c=new Circle();
                            c.erase();
                            break;
                        case "rectangle":
                            Rectangle r=new Rectangle();
                            r.erase();
                            break;
                            
                        case "polygon":
                            Polygon p=new Polygon();
                            p.erase();
                            break;
                    }
                    break;
                case 12:
                    System.out.print("Enter direction to move (right, left, up, down): ");
                    String direction = scanner.nextLine();
                    System.out.print("Enter the units to move: ");
                    int units = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter shape to erase (circle/rectangle/polygon): ");
                    
                    String moveType = scanner.nextLine().toLowerCase();
                    switch(moveType){
                        case "circle":
                            Circle c=new Circle();
                            c.move(direction, units);
                            break;
                        case "rectangle":
                            Rectangle r=new Rectangle();
                            r.move(direction, units);
                            break;
                            
                        case "polygon":
                            Polygon p=new Polygon();
                            p.move(direction, units);
                            break;
                    }
                    break;
                case 13:
                    System.out.print("Enter shape: ");
                    String resizeType=scanner.nextLine();
                    //scanner.nextLine();
                    switch(resizeType){
                        case "circle":
                            Circle c=new Circle();
                            System.out.println("Enter the new radius: ");
                            float new_r=scanner.nextFloat();
                            c.resize(new_r);
                            break;
                        case "rectangle":
                            Rectangle r=new Rectangle();
                            System.out.println("Enter the new length: ");
                            int new_l=scanner.nextInt();
                            System.out.println("Enter the new breadth: ");
                            int new_b=scanner.nextInt();
                            r.resize(new_l, new_b);
                            break;
                            
                        case "polygon":
                            Polygon p=new Polygon();
                            p.resize();
                                    
                            break;
                    }
                    break;
                case 14:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
