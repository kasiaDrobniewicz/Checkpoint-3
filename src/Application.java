import View.View;

public class Application {

    public static void main (String [] args){

        View view = new View();
        View.welcomeUser();
        int action = View.displayMenu();

        while (action != 99) {
            switch(action) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Incorrect option chosen");
            }
            action = View.displayMenu();
        }



    }
}
