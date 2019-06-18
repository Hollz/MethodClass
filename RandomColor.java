class RandomColor{

 public static int randomColor() {
        int red = (int)(Math.random() * 128);
        int green = (int)(Math.random() * 128);
        int blue = (int)(Math.random() * 128);
        return 0xFF000000 | (red << 16) | (green << 8) | blue;
    }
}
 
