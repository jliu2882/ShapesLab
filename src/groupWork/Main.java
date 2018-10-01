package groupWork;

public class Main {

    public static void main(String[] args) {
	// write your code here kevin is trash at being trash 
    }
    public abstract class Shape{
        private String type;

        public Shape(String type) {
            this.type = type;
        }

        public abstract double getArea();

        public abstract double getPerimeter();

        public String toString() {
            return "I am a " + type + ".";
        }
    }
}
