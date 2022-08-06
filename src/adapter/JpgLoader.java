package adapter;

public class JpgLoader implements AdvancedImageLoader {

    @Override
    public void viewJpg(String fileName) {
        System.out.println("View jpg file: " + fileName);
    }
}
