package adapter;

// pattern Adapter used
// simple implementation

public class AdapterPattern {

    public static void main(String[] args) {

        ImageView imageView = new ImageView();

        imageView.view("png", "Lion.png");
        imageView.view("png", "Iphone XS.png");
        imageView.view("jpg", "New York.jpg");
        imageView.view("gif", "My friends.gif");
        imageView.view("jpg", "Animals.jpg");
    }
}
