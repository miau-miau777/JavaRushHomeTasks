package javarush.tasks.task16.task1631;

import javarush.tasks.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes types) {
        if (types == ImageTypes.JPG) {
            return new JpgReader();
        } else if (types == ImageTypes.BMP) {
            return new BmpReader();
        } else if (types == ImageTypes.PNG) {
            return new PngReader();
        } else
            throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
