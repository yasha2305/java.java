package basics;

public class volumeofBox {
    int length, width, heigth;

    // constructor
    volumeofBox(int l, int w, int h) {
        length = l;
        width = w;
        heigth = h;
    }

    void volume() {
        int v = length * width * heigth;
        System.out.println("Volume = " + v);
    }

    public static void main(String args[]) {
        volumeofBox b1 = new volumeofBox(2, 3, 4); // object 1
        volumeofBox b2 = new volumeofBox(5, 6, 7); // object 2
        b1.volume(); 
        b2.volume();

    }

}
