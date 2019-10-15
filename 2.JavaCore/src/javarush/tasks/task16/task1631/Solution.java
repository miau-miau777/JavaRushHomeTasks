package javarush.tasks.task16.task1631;

import javarush.tasks.task16.task1631.common.ImageReader;
import javarush.tasks.task16.task1631.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
