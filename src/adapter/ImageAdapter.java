package adapter;

public class ImageAdapter implements ImageLoader{

    AdvancedImageLoader advancedImageLoader;

    public ImageAdapter(String imageFormat) {

        if (imageFormat.equalsIgnoreCase("jpg")) {
            advancedImageLoader = new JpgLoader();
        }
    }

    @Override
    public void view(String imageFormat, String fileName) {

        if (imageFormat.equalsIgnoreCase("jpg")) {
            advancedImageLoader.viewJpg(fileName);
        }
    }
}
