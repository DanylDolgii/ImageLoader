package adapter;

public class ImageView implements ImageLoader{

    ImageAdapter imageAdapter;

    @Override
    public void view(String imageFormat, String fileName) {

        if (imageFormat.equalsIgnoreCase("png")) {
            System.out.println("View png file: " + fileName);
        } else if (imageFormat.equalsIgnoreCase("jpg")) {
            imageAdapter = new ImageAdapter(imageFormat);
            imageAdapter.view(imageFormat, fileName);
        } else {
            System.out.println("Invalid file. " + imageFormat + " format not supported");
        }
    }
}
